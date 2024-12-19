package org.jsp.CDA.Repository;

import org.jsp.CDA.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo  extends JpaRepository<Student, Integer>{

	
}
