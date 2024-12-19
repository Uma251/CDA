package org.jsp.CDA.Dao;

import java.util.List;
import java.util.Optional;

import org.jsp.CDA.entity.Enrollment;

public interface EnrollmentDao {

	Enrollment saveEnrollment(Enrollment enrollment);
	
	List<Enrollment> findAllEnrollments();

	Optional<Enrollment> findEnrollmentById(int id);

	List<Enrollment> findStudentEnrollments(int sid);

	List<Enrollment> findEnrollmentByCourseId(int cid);

	void deleteEnrollmentById(int id);
	
	
	
}

