package org.jsp.CDA.service;

import org.springframework.http.ResponseEntity;

public interface AdministatorService {

	ResponseEntity<?> assignAdminToDepartment(int did, int aid);

	String deleteAdminById(int id);

	
	
	
}
