package org.jsp.CDA.service;

import org.jsp.CDA.entity.Course;
import org.springframework.http.ResponseEntity;

public interface CourseService {



	ResponseEntity<?> saveCourse(Course course);

	ResponseEntity<?> findCourseById(int id);

	ResponseEntity<?> findAllCourse();

	

	ResponseEntity<?> assignCourseToFaculty(int fid, int cid);

	ResponseEntity<?> setDepartmentToCourse(int cid, int did);

	String deleteCourseById(int id);

	
	
	
	
}
