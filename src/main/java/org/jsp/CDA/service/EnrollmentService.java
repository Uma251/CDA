package org.jsp.CDA.service;

import org.jsp.CDA.entity.Enrollment;
import org.springframework.http.ResponseEntity;

public interface EnrollmentService {


	ResponseEntity<?> findAllEnrollments();



	ResponseEntity<?> saveEnrollment(int sid, int cid);


	ResponseEntity<?> findEnrollmentById(int id);



	ResponseEntity<?> findStudentEnrollments(int sid);



	ResponseEntity<?> findEnrollmentByCourseId(int cid);



	String deleteEnrollmentById(int id);

	
	
	
	
	
	
}
