package org.jsp.CDA.serviceImple;

import java.util.Optional;

import org.jsp.CDA.Dao.AdministerDao;
import org.jsp.CDA.Dao.DepartmentDao;
import org.jsp.CDA.ResponseStrcture.ResponseStrcture;
import org.jsp.CDA.entity.Administrator;
import org.jsp.CDA.entity.Department;
import org.jsp.CDA.exceptionClass.InvalidAdminIdException;
import org.jsp.CDA.exceptionClass.InvalidCourseIdException;
import org.jsp.CDA.exceptionClass.InvalidDepartmentIdException;
import org.jsp.CDA.service.AdministatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
@Service
public class AdministerServiceImple  implements AdministatorService{

	
	@Autowired
	private AdministerDao adminDao;
	
	@Autowired
	private DepartmentDao deptDao;

	@Override
	public ResponseEntity<?> assignAdminToDepartment(int did, int aid) {
		
		Optional<Department> dept = deptDao.findDepartmentById(did);
		
		
		if(dept.isEmpty()) {
			throw InvalidDepartmentIdException.builder().message("invalid id").build();

			
		}
		Optional<Administrator> admin = adminDao.findAdminById(aid);
		
		if(admin.isEmpty()) {
			throw InvalidAdminIdException.builder().message("invalid id").build();

		}
		Administrator a = admin.get();
		Department d = dept.get();
		
		a.setDepartment(d);
		adminDao.saveAdminister(a);
		
		 return ResponseEntity.status(HttpStatus.OK.value()).
	 				body(ResponseStrcture.builder().
	 					httpStatus(HttpStatus.OK.value()).
	 					 message("Admin assigned to department sucssfully").body(a).build());
	 	
	}

	@Override
	public String deleteAdminById(int id) {
		Optional<Administrator> admin = adminDao.findAdminById(id);
		
		if(admin.isEmpty()) {
			throw InvalidAdminIdException.builder().message("invalid id").build();
		}
		
		Administrator ad = admin.get();
		
		adminDao.deleteAdminById(id);
		
		return "deleted sucessfully";
	}
	
	
}
