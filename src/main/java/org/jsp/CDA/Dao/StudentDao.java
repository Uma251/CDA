package org.jsp.CDA.Dao;

import java.util.Optional;

import org.jsp.CDA.Repository.StudentRepository;
import org.jsp.CDA.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

public interface StudentDao {

	
	
	Student saveStudent(Student student);

	Optional<Student> findStudentById(int id);

 // void deleteStudentById(int id);
	

}