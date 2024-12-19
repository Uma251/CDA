package org.jsp.CDA.DaoImple;

import java.util.List;
import java.util.Optional;

import org.jsp.CDA.Dao.EnrollmentDao;
import org.jsp.CDA.Repository.EnrollmentRepository;
import org.jsp.CDA.entity.Enrollment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class EnrollmentDaoImple implements EnrollmentDao {

	@Autowired
	private EnrollmentRepository enrollmentRepo;
	
	@Override
	public Enrollment saveEnrollment(Enrollment enrollment) {
		// TODO Auto-generated method stub
		return enrollmentRepo.save(enrollment);
	}

	public List<Enrollment> findAllEnrollments() {
		
		return enrollmentRepo.findAll();
	}

	@Override
	public Optional<Enrollment> findEnrollmentById(int id) {
		
		return enrollmentRepo.findById(id);
	}

	@Override
	public List<Enrollment> findStudentEnrollments(int sid) {
		
		return  enrollmentRepo.findStudentEnrollments(sid);
	}

	@Override
	public List<Enrollment> findEnrollmentByCourseId(int cid) {
		
		return  enrollmentRepo.findEnrollmentByCourseId(cid);
	}

	@Override
	public void deleteEnrollmentById(int id) {
	enrollmentRepo.deleteById(id);
		
	}
	
	
	
	
	
	
	
	
}

