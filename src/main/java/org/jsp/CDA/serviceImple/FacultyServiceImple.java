package org.jsp.CDA.serviceImple;

import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

import org.jsp.CDA.Dao.DepartmentDao;
import org.jsp.CDA.Dao.FacultyDao;
import org.jsp.CDA.ResponseStrcture.ResponseStrcture;
import org.jsp.CDA.entity.Department;
import org.jsp.CDA.entity.Faculty;
import org.jsp.CDA.exceptionClass.InvalidDepartmentIdException;
import org.jsp.CDA.exceptionClass.InvalidFacultyIdException;
import org.jsp.CDA.exceptionClass.NoFacultyFoundException;
import org.jsp.CDA.service.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
@Service
public class FacultyServiceImple implements FacultyService {

	
	@Autowired
	private FacultyDao facDao;
	
	@Autowired
	private DepartmentDao deptDao;
	
	
	
	@Override
	public ResponseEntity findAllFaculty() {
		List<Faculty> list = facDao.findAllFaculty();
		
	        if(list.isEmpty()) {
				throw NoFacultyFoundException.builder().message("no users found").build();

	        	
	        }
	            return ResponseEntity.status(HttpStatus.OK.value()).
	    				body(ResponseStrcture.builder().
	    	
	    						httpStatus(HttpStatus.OK.value()).
	
	    						message("found all faculty successfully").body(list).build());
	    		
	}
	
	
	

	@Override
	public ResponseEntity findFacultyById(int fid) {
		
		Optional<Faculty>  optional=   facDao.findFactultyById(fid);
		
	
		if(optional.isEmpty()) {
			
			throw InvalidFacultyIdException.builder().message("invalid id").build();

		}
		
		return ResponseEntity.status(HttpStatus.OK.value()).
				body(ResponseStrcture.builder().
	
						httpStatus(HttpStatus.OK.value()).

						message("find faculty by id successfully").body(optional.get()).build());
		
}




	@Override
	public ResponseEntity<?> setDepartmentToFaculty(int fid, int did) {
		
		Optional<Faculty> fac = facDao.findFactultyById(fid);
		
		if(fac.isEmpty()){
			throw InvalidFacultyIdException.builder().message("invalid id").build();

		}
		
		Optional<Department> dep = deptDao.findDepartmentById(did);
		
		if(dep.isEmpty()) {
			throw InvalidDepartmentIdException.builder().message("invalid id").build();

			
		}
		Faculty f = fac.get();
		Department d = dep.get();
		
		f.setDepartment(d);
		facDao.saveFaculty(f);
		return ResponseEntity.status(HttpStatus.OK.value()).
				body(ResponseStrcture.builder().
	
						httpStatus(HttpStatus.OK.value()).

						message("find course successfully").body(f).build());
		
		
	}




	@Override
	public ResponseEntity<?> setTimeToFaculty(int fid,LocalTime officeHours) {
		 Optional<Faculty> faculty = facDao.findFactultyById(fid);
		 if(faculty.isEmpty()) {
				throw InvalidFacultyIdException.builder().message("invalid id").build();

			 
		 }
//		 Optional<Department> department = deptDao.findDepartmentById(did);
		 Faculty f = faculty.get();
		  f.setOfficeHours(officeHours);
		  facDao.saveFaculty(f);
		  return ResponseEntity.status(HttpStatus.OK.value()).
					body(ResponseStrcture.builder().
		
							httpStatus(HttpStatus.OK.value()).

							message("set time  successfully for faculty").body(f).build());
			
	}




	@Override
	public String deleteFacultyById(int id) {
		Optional<Faculty> faculty = facDao.findFactultyById(id);
		if(faculty.isEmpty()) {
				throw InvalidFacultyIdException.builder().message("invalid id").build();

		}
		
		return null;
	}




	
	
	
	
	
	}
	
	


