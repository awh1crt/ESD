package com.bolton.esdgrocerystore.services;

import org.springframework.stereotype.Service;

import com.bolton.esdgrocerystore.models.UserRegister;

@Service
public interface UserService {
	
	UserRegister addUser(UserRegister user);
	
	UserRegister findUserById(int id);
	
	Iterable<UserRegister> findUserByName(String cName);
	
	Iterable<UserRegister> showAllUsers();
	
	void deleteById(int id);
	
	UserRegister updateUser(UserRegister user);
	
	UserRegister udateUserById(int id);
	
	Object findAll();

	String validateRegisteredUser(String userEmail, String password);
}
