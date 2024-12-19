package org.jsp.CDA.DaoImple;

import java.util.List;
import java.util.Optional;

import org.jsp.CDA.Dao.CourseDao;
import org.jsp.CDA.Repository.CourseRepository;
import org.jsp.CDA.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CourseDaoImple implements CourseDao {

	
	@Autowired
	private CourseRepository courseRepo;
	
	
	@Override
	public Course saveCourse(Course course) {
		
		return  courseRepo.save(course);
	}


	@Override
	public Optional<Course> findCourseById(int id) {
		// TODO Auto-generated method stub
		return courseRepo.findById(id);
	}


	@Override
	public List<Course> findAllCourse() {
		
		return courseRepo.findAll();
	}


	@Override
	public void deleteCourseById(int id) {
		
		 courseRepo.deleteById(id);;
	}
	
	
	
	

	
}
