package org.jsp.CDA.Dao;

import java.util.List;
import java.util.Optional;
import org.jsp.CDA.entity.Department;

public interface DepartmentDao {

	

	Optional<Department> findDepartmentById(int id);


	Department saveDepartment(Department department);

	List<Department> findAllDepartment();


	void deleteDepartmentById(int id);

	
	
}
