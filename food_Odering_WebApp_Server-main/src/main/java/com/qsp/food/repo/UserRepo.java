package com.qsp.food.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.qsp.food.dto.User;


public interface UserRepo extends JpaRepository<User, Integer>{

	User findUserByEmail(String email);

	User findUserByName(String name);

}
