package org.jsp.CDA.DaoImple;

import java.util.List;
import java.util.Optional;

import org.jsp.CDA.Dao.DepartmentDao;
import org.jsp.CDA.Repository.DepartmentRepository;
import org.jsp.CDA.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
@Repository
public class DepartmentDaoImple  implements DepartmentDao{

	
	@Autowired
	private DepartmentRepository departmentRepo;
	
	@Override
	public Department saveDepartment(Department department) {
		// TODO Auto-generated method stub
		return departmentRepo.save(department);
	}

	@Override
	public Optional<Department> findDepartmentById(int id) {
		// TODO Auto-generated method stub
		return departmentRepo.findById(id);
	}

	@Override
	public List<Department> findAllDepartment() {
		// TODO Auto-generated method stub
		return departmentRepo.findAll();
	}

	
	
	public void deleteDepartmentById( int id) {
		 departmentRepo.deleteById(id);
	}
	
	
	
}
