package org.jsp.CDA.Dao;

import java.util.Optional;

import org.jsp.CDA.entity.Administrator;

public interface AdministerDao {

	Administrator saveAdminister(Administrator administrator);

	Optional<Administrator> findAdminById(int aid);

	void deleteAdminById(int id);
	
	
	
	

}
