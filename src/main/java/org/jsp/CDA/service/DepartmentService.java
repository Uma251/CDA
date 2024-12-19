package org.jsp.CDA.service;


import org.jsp.CDA.entity.Department;
import org.springframework.http.ResponseEntity;

public interface DepartmentService {
	

	ResponseEntity<?> findDepartmentById(int id);

	ResponseEntity<?> findAllDepartment();

	ResponseEntity<?> saveDepartment(Department department);

	String deleteDepartmentById(int id);
	
	

}
