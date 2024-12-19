package org.jsp.CDA.service;

import org.jsp.CDA.entity.Student;
import org.springframework.http.ResponseEntity;

public interface StudentService {


	ResponseEntity<?> saveStudent(Student student);

	ResponseEntity<?> findStudentById(int id);

	ResponseEntity<?> setStudentYear(int id, String year);

	ResponseEntity<?> setDepartmentToStudent(int sid, int did);

	//String deleteStudentById(int id);

	
	
	
	
	
}
