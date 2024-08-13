package com.qsp.food.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.qsp.food.dto.User;
import com.qsp.food.repo.UserRepo;
import com.qsp.food.util.ResponceStructure;

@Repository
public class UserDao {
	@Autowired
	private UserRepo repo;

	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return repo.save(user);
	}

	public User getUser(int id) {
		Optional<User>optional=repo.findById(id);
		if(optional.isPresent()) {
			
			return optional.get();
		}
		return null;
		
	}

	public User deleteUserById(int id) {
		// TODO Auto-generated method stub
		Optional<User>optional=repo.findById(id);
		if(optional.isPresent()) {
			
			User user=optional.get();
			repo.delete(user);
			return user;
		}
		return null;
	}

	public User updateUser(User user, int id) {
		Optional<User>optional=repo.findById(id);
		if(optional.isPresent()) {
			
			
			user.setId(id);
			repo.save(user);
			return user;
		}
		return null;
	}

	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	public User logInUser(String email, String password) {
		
		User result = repo.findUserByEmail(email);
		if(result.getPassword().equals(password)) {
			
		}
		
		
		
		return null;
	}

	public User getuserByEmail(String email) {
		// TODO Auto-generated method stub
		return repo.findUserByEmail(email);
	}

	public User getUserByName(String name) {
		// TODO Auto-generated method stub
		return repo.findUserByName(name);
	}

}
