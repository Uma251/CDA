package org.jsp.CDA.serviceImple;
import java.util.List;
import java.util.Optional;
import org.jsp.CDA.Dao.CourseDao;
import org.jsp.CDA.Dao.EnrollmentDao;
import org.jsp.CDA.Dao.StudentDao;
import org.jsp.CDA.ResponseStrcture.ResponseStrcture;
import org.jsp.CDA.entity.Course;
import org.jsp.CDA.entity.Enrollment;
import org.jsp.CDA.entity.Student;
import org.jsp.CDA.exceptionClass.InvalidCourseIdException;
import org.jsp.CDA.exceptionClass.InvalidEnrollmentIdException;
import org.jsp.CDA.exceptionClass.InvalidFacultyIdException;
import org.jsp.CDA.exceptionClass.InvalidStudentIdException;
import org.jsp.CDA.exceptionClass.NoEnrollmentsFoundException;
import org.jsp.CDA.service.EnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class EnrollmentServiceImple  implements EnrollmentService{

	@Autowired
	private EnrollmentDao enrollmentDao;
	
	@Autowired
	private StudentDao studentDao;
	
	@Autowired
	private CourseDao courseDao;
	
	@Override
	public ResponseEntity<?> saveEnrollment(@RequestParam int sid,@RequestParam int cid) {
		Optional<Student> student = studentDao.findStudentById(sid);
		
		if(student.isEmpty()) {
			throw InvalidStudentIdException.builder().message("invalid id").build();

			
		}
		
		Optional<Course> course = courseDao.findCourseById(cid);
		
		if(course.isEmpty()) {
			throw InvalidCourseIdException.builder().message("invalid id").build();

			
		}
		Enrollment enrollment = new Enrollment();
		enrollment.setStudent(student.get());
		enrollment.setCourse(course.get());
		enrollmentDao.saveEnrollment(enrollment);
		
		return ResponseEntity.status(HttpStatus.OK.value()).
				body(ResponseStrcture.builder().
					httpStatus(HttpStatus.OK.value()).
					 message("Enrollment created successfully").body(enrollment).build());
		
	}
	 

	public ResponseEntity<?> findAllEnrollments(){
		List<Enrollment> list = enrollmentDao.findAllEnrollments();
		
		if(list.isEmpty()) {
			throw NoEnrollmentsFoundException.builder().message("no enrollments found").build();

			
		}
		
		return ResponseEntity.status(HttpStatus.OK.value()).
				body(ResponseStrcture.builder().
					httpStatus(HttpStatus.OK.value()).
					 message("all enrollments found successfully").body(list).build());
		
	}

	@Override
	public ResponseEntity<?> findEnrollmentById(int id) {
		 Optional<Enrollment> enrollment = enrollmentDao.findEnrollmentById(id);
		 if(enrollment.isEmpty()) {
				throw InvalidEnrollmentIdException.builder().message("invalid id").build();

			}
			
			return ResponseEntity.status(HttpStatus.OK.value()).
					body(ResponseStrcture.builder().
						httpStatus(HttpStatus.OK.value()).
						 message(" enrollment found by id successfully").body(enrollment).build());
			
	}


	@Override
	public ResponseEntity<?> findStudentEnrollments(int sid) {
		List<Enrollment> enrollmentList = enrollmentDao.findStudentEnrollments(sid);
		
		if(enrollmentList.isEmpty()) {
			throw NoEnrollmentsFoundException.builder().message("no enrollments found").build();

		}

		return ResponseEntity.status(HttpStatus.OK.value()).
				body(ResponseStrcture.builder().
					httpStatus(HttpStatus.OK.value()).
					 message(" enrollment found by id successfully").body(enrollmentList).build());
		
	}
	
	


	@Override
	public ResponseEntity<?> findEnrollmentByCourseId(int cid) {
		 
		List<Enrollment> enrollmentList = enrollmentDao. findEnrollmentByCourseId(cid);
		
		if(enrollmentList.isEmpty()) {
			throw NoEnrollmentsFoundException.builder().message("no enrollments found").build();

		}
		return ResponseEntity.status(HttpStatus.OK.value()).
				body(ResponseStrcture.builder().
					httpStatus(HttpStatus.OK.value()).
					 message(" enrollment found by id successfully").body(enrollmentList).build());
		
	}


	@Override
	public String deleteEnrollmentById(int id) {
		Optional<Enrollment> enroll = enrollmentDao.findEnrollmentById(id);
		
		if(enroll.isEmpty()) {
			throw InvalidEnrollmentIdException.builder().message("invalid id").build();

			
		}
		return null;
	}
	
	
	

	
	
	
	
}
