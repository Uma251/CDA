package org.jsp.CDA.Dao;

import java.util.List;
import java.util.Optional;

import org.jsp.CDA.entity.User;

public interface UserDao {

	User saveUser(User user);

	List<User> findAllUsers();

	Optional<User> findUserById(int id);

	Optional<User> login(String username, String password);

	void deleteUserById(int id);

	
	
	
}

