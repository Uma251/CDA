package org.jsp.CDA.serviceImple;
import java.util.Optional;

import org.jsp.CDA.Dao.DepartmentDao;
import org.jsp.CDA.Dao.StudentDao;
import org.jsp.CDA.Dao.UserDao;
import org.jsp.CDA.ResponseStrcture.ResponseStrcture;
import org.jsp.CDA.entity.Course;
import org.jsp.CDA.entity.Department;
import org.jsp.CDA.entity.Student;
import org.jsp.CDA.exceptionClass.InvalidCourseIdException;
import org.jsp.CDA.exceptionClass.InvalidDepartmentIdException;
import org.jsp.CDA.exceptionClass.InvalidStudentIdException;
import org.jsp.CDA.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
@Service
public class StudentServiceImple implements StudentService{

	
	@Autowired
	private StudentDao studentDao;

	@Autowired
	private DepartmentDao deptDao;

	@Override
	public ResponseEntity<?> saveStudent(Student student) {
		
		student = studentDao.saveStudent(student);
		
		return ResponseEntity.status(HttpStatus.OK.value()).
				body(ResponseStrcture.builder().
					httpStatus(HttpStatus.OK.value()).
					 message("student created successfully").body(student).build());
		
	}
	
	@Override
	public ResponseEntity<?> findStudentById(int id) {
	 Optional<Student> student = studentDao.findStudentById(id);
	 
	 if(student.isEmpty()) {
		 
		 throw InvalidStudentIdException.builder().message("invalid id").build();
	 }
	
	return ResponseEntity.status(HttpStatus.OK.value()).
			body(ResponseStrcture.builder().
				httpStatus(HttpStatus.OK.value()).
				 message("find student by id successfully").body(student.get()).build());
	
	}

	@Override
	public ResponseEntity<?> setStudentYear(int id, String year) {
		
		Optional<Student> student = studentDao.findStudentById(id);
		
		if(student.isEmpty()) {
			throw InvalidStudentIdException.builder().message("invalid id").build();
		}
		Student s=  student.get();
		s.setYear(year);
		studentDao.saveStudent(s);
		return ResponseEntity.status(HttpStatus.OK.value()).
				body(ResponseStrcture.builder().
					httpStatus(HttpStatus.OK.value()).
					 message("student year  updated successfully").body(s).build());
		
		
		
	}

	@Override
	public ResponseEntity<?> setDepartmentToStudent(int sid, int did) {
		         Optional<Student>  student   =studentDao.findStudentById(sid);
		         if(student.isEmpty()) {
		        	 
		 			throw InvalidStudentIdException.builder().message("invalid id").build();

		         }
		         Optional<Department> department = deptDao.findDepartmentById(did);
		
		if(department.isEmpty()) {
			
			throw InvalidDepartmentIdException.builder().message("invalid id").build();

		}
		Student s = student.get();
		Department d= department.get();
		
		s.setDepartment(d);
		  studentDao.saveStudent(s);
		return ResponseEntity.status(HttpStatus.OK.value()).
				body(ResponseStrcture.builder().
					httpStatus(HttpStatus.OK.value()).
					 message("department updated to student successfully").body(s).build());
		
	}

//	@Override
//	public String   deleteStudentById(int id) {
//		Optional<Student> s = studentDao.findStudentById(id);
//		
//		if(s.isEmpty()) {
//			
//		}
//		Student student = s.get();
//		
//		studentDao.deleteStudentById(id);
//	
//	
//	return "deleted successfully";
//	
//	}
//	

	

	
	
}
