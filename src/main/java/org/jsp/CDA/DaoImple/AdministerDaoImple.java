package org.jsp.CDA.DaoImple;

import java.util.Optional;

import org.jsp.CDA.Dao.AdministerDao;
import org.jsp.CDA.Repository.AdministerRepository;
import org.jsp.CDA.entity.Administrator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AdministerDaoImple implements AdministerDao {

	@Autowired
	private AdministerRepository adminRepo;

	@Override
	public Administrator saveAdminister(Administrator administrator) {
		// TODO Auto-generated method stub
		return adminRepo.save(administrator);
	}

	@Override
	public Optional<Administrator> findAdminById(int aid) {
		
		return adminRepo.findById(aid);
	}

	@Override
	public void deleteAdminById(int id) {
		adminRepo.deleteById(id);
		
	}
	
	
	
}
