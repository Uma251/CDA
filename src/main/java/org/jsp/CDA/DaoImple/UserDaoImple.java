package org.jsp.CDA.DaoImple;

import java.util.List;
import java.util.Optional;

import org.jsp.CDA.Dao.UserDao;
import org.jsp.CDA.Repository.UserRepository;
import org.jsp.CDA.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImple implements UserDao {

	
	@Autowired
	private UserRepository userRepo;
	
	@Override
	public User saveUser(User user) {
		
		return userRepo.save(user) ;
	}
	
	public List<User> findAllUsers(){
		
		return userRepo.findAll();
	}

	@Override
	public Optional<User> findUserById(int id) {
		// TODO Auto-generated method stub
		return userRepo.findById(id);
	}

	@Override
	public Optional<User> login(String username, String password) {
		
		return userRepo.findByUsernameAndPassword(username,password);
	}

	@Override
	public void deleteUserById(int id) {
		userRepo.deleteById(id);
		
	}

	
	
	}

	
	

