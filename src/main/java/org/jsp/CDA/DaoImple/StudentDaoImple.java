package org.jsp.CDA.DaoImple;

import java.util.Optional;

import org.jsp.CDA.Dao.StudentDao;
import org.jsp.CDA.Repository.StudentRepo;
import org.jsp.CDA.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
@Repository
public class StudentDaoImple  implements StudentDao{

	@Autowired
	private StudentRepo studentRepo;

	@Override
	public Student saveStudent(Student student) {
		
		return studentRepo.save(student);
	}

	@Override
	public Optional<Student> findStudentById(int id) {

		return studentRepo.findById(id);
	}

//	@Override
//	public void  deleteStudentById(int id) {
//		
//		studentRepo.deleteById(id);
//	}
//	
//	
	
	
	
	
	
	
	
	
}

