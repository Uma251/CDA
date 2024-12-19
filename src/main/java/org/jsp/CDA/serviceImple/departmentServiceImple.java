package org.jsp.CDA.serviceImple;

import java.util.List;
import java.util.Optional;

import org.jsp.CDA.Dao.DepartmentDao;
import org.jsp.CDA.ResponseStrcture.ResponseStrcture;
import org.jsp.CDA.entity.Department;
import org.jsp.CDA.exceptionClass.InvalidDepartmentIdException;
import org.jsp.CDA.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
@Service
public class departmentServiceImple  implements DepartmentService{

	
	@Autowired
	private DepartmentDao departmentDao;
	
	@Override
	public ResponseEntity<?> saveDepartment(Department department) {
		
		
	department = departmentDao.saveDepartment(department);
	
	return ResponseEntity.status(HttpStatus.OK.value()).
			body(ResponseStrcture.builder().
				httpStatus(HttpStatus.OK.value()).
				 message("department created successfully").body(department).build());
	
	}
	
	@Override
	public ResponseEntity<?> findDepartmentById(int id) {
		
		Optional<Department> department = departmentDao.findDepartmentById(id);
		
		if(department.isEmpty()) {
			
			throw InvalidDepartmentIdException.builder().message("invalid id").build();
		}
		
		return ResponseEntity.status(HttpStatus.OK.value()).
				body(ResponseStrcture.builder().
					httpStatus(HttpStatus.OK.value()).
					 message("found department successfully").body(department.get()).build());
		
	}

	@Override
	public ResponseEntity<?> findAllDepartment() {
		// TODO Auto-generated method stub
		List<Department>  list= departmentDao.findAllDepartment();
		
		return ResponseEntity.status(HttpStatus.OK.value()).
				body(ResponseStrcture.builder().
					httpStatus(HttpStatus.OK.value()).
					 message("finding all department successfully").body(list).build());
		
	}

	@Override
	public String deleteDepartmentById(int id) {
		Optional<Department> dept = departmentDao.findDepartmentById(id);
		
		return null;
	}
	
	

}
