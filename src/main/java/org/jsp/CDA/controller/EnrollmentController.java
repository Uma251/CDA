package org.jsp.CDA.controller;

import org.jsp.CDA.entity.Course;
import org.jsp.CDA.entity.Enrollment;
import org.jsp.CDA.entity.Student;
import org.jsp.CDA.service.EnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/enrollments")
public class EnrollmentController {

	
	@Autowired
	private EnrollmentService enrollmentService;
	
//	@Autowired
//	private StudentService.studentService;
//	
	
	@PostMapping("/{sid}/{cid}")
	public ResponseEntity<?> saveEnrollment(@PathVariable int sid,@PathVariable int cid){
		
		
		return enrollmentService.saveEnrollment(sid,cid);
		
	}
	
	@GetMapping
	public ResponseEntity<?> findAllEnrollments(){
		return enrollmentService.findAllEnrollments();
	}
	@GetMapping("/{id}")
	public ResponseEntity<?> findEnrollmentById(@PathVariable int id){
		return enrollmentService.findEnrollmentById(id);
	} 
	
	@GetMapping("student/{sid}")
	public ResponseEntity<?> findStudentEnrollments(@PathVariable int sid){
		
		return enrollmentService.findStudentEnrollments(sid);
	}
	
	@GetMapping("/student/course/{cid}")
	public ResponseEntity<?> findEnrollmentByCourseId(@PathVariable int cid){
		
		return enrollmentService.findEnrollmentByCourseId(cid);
	}
	
	
	
	
	
	
	
}
