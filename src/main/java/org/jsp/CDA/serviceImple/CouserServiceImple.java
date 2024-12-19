package org.jsp.CDA.serviceImple;

import java.util.List;
import java.util.Optional;

import org.jsp.CDA.Dao.CourseDao;
import org.jsp.CDA.Dao.DepartmentDao;
import org.jsp.CDA.Dao.FacultyDao;
import org.jsp.CDA.ResponseStrcture.ResponseStrcture;
import org.jsp.CDA.entity.Course;
import org.jsp.CDA.entity.Department;
import org.jsp.CDA.entity.Faculty;
import org.jsp.CDA.exceptionClass.InvalidCourseIdException;
import org.jsp.CDA.exceptionClass.InvalidDepartmentIdException;
import org.jsp.CDA.exceptionClass.InvalidFacultyIdException;
import org.jsp.CDA.exceptionClass.NoCourseFoundException;
import org.jsp.CDA.exceptionClass.NoEnrollmentsFoundException;
import org.jsp.CDA.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
@Service
public class CouserServiceImple  implements CourseService{

	@Autowired
	private CourseDao courseDao;
	
	@Autowired
	private FacultyDao facDao;
	
	@Autowired
	private DepartmentDao deptDao;
	
	@Override
	public ResponseEntity<?> saveCourse(Course course) {
	 
		course = courseDao.saveCourse(course);
		
		return ResponseEntity.status(HttpStatus.OK.value()).
				body(ResponseStrcture.builder().
					httpStatus(HttpStatus.OK.value()).
					 message("course created successfully").body(course).build());
		
	}

	@Override
	public ResponseEntity<?> findCourseById(int id) {
	 Optional<Course> course = courseDao.findCourseById(id);
	 
	 if(course.isEmpty()) {
		 
		 throw InvalidCourseIdException.builder().message("invalid id").build();
	 }
	
	return ResponseEntity.status(HttpStatus.OK.value()).
			body(ResponseStrcture.builder().
				httpStatus(HttpStatus.OK.value()).
				 message("found course by id successfully").body(course.get()).build());
	
	}

	@Override
	public ResponseEntity<?> findAllCourse() {
	
		List<Course> list = courseDao.findAllCourse();
		
		if(list.isEmpty()) {
			 throw NoCourseFoundException.builder().message("invalid id").build();

			
		}
		return ResponseEntity.status(HttpStatus.OK.value()).
				body(ResponseStrcture.builder().
					httpStatus(HttpStatus.OK.value()).
					 message("all courses found successfully").body(list).build());
		
		}

	public ResponseEntity<?> assignCourseToFaculty(int fid, int cid) {
		
		            Optional<Faculty>   optional1   =facDao.findFactultyById(fid);
	
		            if(optional1.isEmpty()) {
		    			throw InvalidFacultyIdException.builder().message("invalid id").build();

		            	
		            }
		             Optional<Course> optional2 = courseDao.findCourseById(cid);
		            
		             
		             if(optional2.isEmpty()) {
		            	 
			    			throw InvalidCourseIdException.builder().message("invalid id").build();

		             }
		             
		             Faculty faculty = optional1.get();
		             Course course = optional2.get();
		             
		            course.setFaculty(faculty);
		            
		              courseDao.saveCourse(course);
		            
		            return ResponseEntity.status(HttpStatus.OK.value()).
		    				body(ResponseStrcture.builder().
		    					httpStatus(HttpStatus.OK.value()).
		    					 message("faculty assigned to course successfully").body(course).build());
		    	
		            
		    		}

	@Override
	public ResponseEntity<?> setDepartmentToCourse(int cid, int did) {

		Optional<Course> optional1 = courseDao.findCourseById(cid);
		if(optional1.isEmpty()) {
			
			throw InvalidCourseIdException.builder().message("invalid id").build();

			
		}
		Optional<Department> optional2 = deptDao.findDepartmentById(did);
		if(optional2.isEmpty()) {
			
			throw InvalidDepartmentIdException.builder().message("invalid id").build();

		}
		
		Course c = optional1.get();
		Department d = optional2.get();
		
		c.setDepartment(d);
		courseDao.saveCourse(c);
		 return ResponseEntity.status(HttpStatus.OK.value()).
 				body(ResponseStrcture.builder().
 					httpStatus(HttpStatus.OK.value()).
 					 message("department assigned to course sucssfully").body(c).build());
 	
         
		
	}

	@Override
	public String deleteCourseById(int id) {
		Optional<Course> c = courseDao.findCourseById(id);
		if(c.isEmpty()) {
			throw InvalidCourseIdException.builder().message("invalid id").build();
			
		}
		Course course = c.get();
		
		return "course deleted sucessfully";
	
	}
	
	
	
	
	
	
	
	
	}

		
	
	
	




	
	

