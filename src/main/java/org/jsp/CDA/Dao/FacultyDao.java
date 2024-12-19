package org.jsp.CDA.Dao;

import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

import org.jsp.CDA.entity.Course;
import org.jsp.CDA.entity.Faculty;
import org.springframework.http.ResponseEntity;

public interface FacultyDao {


	Faculty saveFaculty(Faculty faculty);

	Optional<Faculty> findFactultyById(int fid);

	List<Faculty> findAllFaculty();


	Faculty setTimeToFaculty(int fid,LocalTime officeHours);

	void deleteFacultyById(int id);
	
	
	
	
}
