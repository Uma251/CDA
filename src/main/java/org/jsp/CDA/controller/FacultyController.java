package org.jsp.CDA.controller;

import java.time.LocalTime;
import java.util.Optional;

import org.jsp.CDA.entity.Faculty;
import org.jsp.CDA.service.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/faculty")
public class FacultyController {
	
	@Autowired
	private FacultyService facService;
	
	@GetMapping("/{id}")
	public ResponseEntity<?> findFacultyById(@PathVariable int fid){
		
		return facService.findFacultyById(fid);
	}
	
	
	
	
	@GetMapping
	public ResponseEntity<?> findAllFaculty(){
		
		return facService.findAllFaculty();
	}
	
@PatchMapping("/{fid}/{did}")
public ResponseEntity<?> setDepartmentToFaculty(@PathVariable int fid,@PathVariable int did){
	return facService.setDepartmentToFaculty(fid,did);
}

	@PatchMapping("/time/{fid}/{officeHours}")
	public ResponseEntity<?> setTimeToFaculty(@PathVariable int fid,@PathVariable String officeHours){
		String[] split = officeHours.split(":");
		LocalTime utime = LocalTime.of(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
		return facService.setTimeToFaculty(fid,utime);
	}

	
	
	
	
}
