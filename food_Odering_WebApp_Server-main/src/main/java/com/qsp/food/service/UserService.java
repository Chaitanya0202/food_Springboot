package com.qsp.food.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.qsp.food.dao.UserDao;
import com.qsp.food.dto.User;
import com.qsp.food.repo.UserRepo;
import com.qsp.food.util.ResponceStructure;



@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	

	
	ResponceStructure<User>structure=new ResponceStructure<User>();
	
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return userDao.saveUser(user);
	}

	public User getUser(int id) {
		// TODO Auto-generated method stub
		return userDao.getUser(id);
	}

	public User deleteUserById(int id) {
		// TODO Auto-generated method stub
		return userDao.deleteUserById(id);
	}

	public User updateUser(User user, int id) {
		// TODO Auto-generated method stub
		return userDao.updateUser(user,id);
	}

	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userDao.getAllUser();
	}

	public User logInUser(String email, String password) {
		// TODO Auto-generated method stub
		return userDao.logInUser(email,password);
	}

	public User getuserByEmail(String email) {
//		MedOrder medOrder=mDao.getMedOrderById(id);
		
		
			return userDao.getuserByEmail(email);
			

		
	}

	public User getUserByName(String name) {
		// TODO Auto-generated method stub
		return userDao.getUserByName(name);
	}

}
