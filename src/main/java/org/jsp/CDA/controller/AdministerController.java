package org.jsp.CDA.controller;

import org.jsp.CDA.service.AdministatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdministerController {

	@Autowired
	private AdministatorService adminService;
	
	
	@PatchMapping("/{did}/{aid}")
	public ResponseEntity<?> assignAdminToDepartment(@PathVariable int did,@PathVariable int  aid){
		return adminService.assignAdminToDepartment(did,aid);
	}
	
	
	@DeleteMapping("/{id}")
	public String deleteAdminById(@PathVariable int id){
		

			return adminService.deleteAdminById(id);
		}
	}

