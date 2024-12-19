package org.jsp.CDA.Repository;
import java.time.LocalTime;

import org.jsp.CDA.entity.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FacultyRepository  extends JpaRepository<Faculty, Integer>{

	//@Query("UPDATE Faculty f SET f.officeHours = :time WHERE f.department.id = :did")
	@Query("select f from Faculty f where f.id=:fid")
	Faculty setTimeToFaculty(int fid,  LocalTime officeHours);

	
	
}
