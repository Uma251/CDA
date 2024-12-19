package org.jsp.CDA.controller;

import org.jsp.CDA.entity.Student;
import org.jsp.CDA.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@PostMapping
	public ResponseEntity<?> saveStudent(@RequestBody Student student){
		return studentService.saveStudent(student);
	}
	@GetMapping("/{id}")
public ResponseEntity<?> findStudentById(@PathVariable int id){
		
		return studentService.findStudentById(id);
		
	}
	@PatchMapping("/year/{sid}/{year}")
public ResponseEntity<?> setStudentYear(@PathVariable int sid ,@PathVariable String year){
		
		
		return studentService.setStudentYear(sid,year);
		
		
	}

	@PatchMapping("/{sid}/{did}")
	public ResponseEntity<?> setDepartmentToStudent(@PathVariable int sid,@PathVariable int did){
		
		
		return studentService.setDepartmentToStudent(sid,did);
	}
	
	
//	@DeleteMapping("/{id}")
//	public String deleteStudentById(@RequestParam int id){
//		return studentService.deleteStudentById(id);
//		
//	}
	
	
	
}
