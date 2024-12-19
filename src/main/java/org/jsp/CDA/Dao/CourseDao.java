package org.jsp.CDA.Dao;

import java.util.List;
import java.util.Optional;
import org.jsp.CDA.entity.Course;

public interface CourseDao {
	
	Course saveCourse(Course course);

	Optional<Course> findCourseById(int id);

	List<Course> findAllCourse();

	void   deleteCourseById(int id);

	
	
	
}
