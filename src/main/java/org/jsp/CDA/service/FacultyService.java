package org.jsp.CDA.service;

import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

import org.jsp.CDA.entity.Faculty;
import org.springframework.http.ResponseEntity;

public interface FacultyService {

	ResponseEntity<List<?>> findAllFaculty();

	ResponseEntity<?> findFacultyById(int fid);

	ResponseEntity<?> setDepartmentToFaculty(int fid, int did);


	ResponseEntity<?> setTimeToFaculty(int fid, LocalTime officeHours);

	String deleteFacultyById(int id);

	
	
	
	
	
	
	
	
}

