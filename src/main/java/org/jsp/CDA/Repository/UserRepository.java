package org.jsp.CDA.Repository;

import java.util.Optional;

import org.jsp.CDA.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

	Optional<User> findByUsernameAndPassword(String username, String password);

	
	
	
}
