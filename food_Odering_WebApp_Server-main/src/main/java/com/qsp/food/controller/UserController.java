package com.qsp.food.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qsp.food.dto.User;
import com.qsp.food.service.UserService;
import com.qsp.food.util.ResponceStructure;

@RestController
@CrossOrigin("https://food-odering-web-app-client.vercel.app/")
//@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService service;
	
	@PostMapping("/saveUser")
	public User saveUser(@RequestBody User user) {
		return service.saveUser(user);
	}

	@GetMapping("/getUserById/{id}")
	public User getUser(@PathVariable int id) {
		return service.getUser(id);
	}
	@DeleteMapping("/deleteUserById/{id}")
	public User deleteUserById(@PathVariable int id) {
		return service.deleteUserById(id);
	}
	@PutMapping("/updateUser/{id}")
	public User updateUser(@RequestBody User user ,@PathVariable int id) {
		return service.updateUser(user,id);
	}

	@GetMapping("/getAllUser")
	public List<User> getAllUser() {
		return service.getAllUser();
	}
	
	@GetMapping("/logIn/{email}/{password}")
	public User logInUser(@PathVariable String email,@PathVariable String password) {
		return service.logInUser(email,password);
		
	}
	@GetMapping("/getUserByEmail/{email}")
	public User getuserByEmail(@PathVariable String email) {
		return service.getuserByEmail(email);
	}
	@GetMapping("/getByName/{name}")
	public User getUserByName(@PathVariable String name) {
		return service.getUserByName(name);
	}
}
