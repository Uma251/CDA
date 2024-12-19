package org.jsp.CDA.service;

import org.jsp.CDA.DTO.Authantication;
import org.jsp.CDA.entity.User;
import org.springframework.http.ResponseEntity;

public interface UserService {

	ResponseEntity<?> saveUser(User user);

	ResponseEntity<?> findAllUsers();

	ResponseEntity<?> findUserById(int id);


	ResponseEntity<?> login(Authantication auth);

	String deletUserById(int id);

	//ResponseEntity<?> updateStudentYear(int id, String year);

	
	
}
