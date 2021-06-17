package com.bolton.esdgrocerystore.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bolton.esdgrocerystore.models.UserRegister;
import com.bolton.esdgrocerystore.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	
	public String validateRegisteredUser(String userEmail, String password) {
		String name=null;
		
		for (UserRegister userRegister : userRepository.findAll()) {
			if(userRegister.getUserEmail().equals(userEmail) && userRegister.getUserPassword().equals(password) ) {
				name = userRegister.getUserName();
				
			}
		}
		
		return name;
		
	}
	public UserRegister  addCustomer(UserRegister  user) {
		return this.userRepository.save(user);
	}
	@Override
	public UserRegister addUser(UserRegister user) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public UserRegister findUserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Iterable<UserRegister> findUserByName(String cName) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Iterable<UserRegister> showAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public UserRegister updateUser(UserRegister user) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public UserRegister udateUserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Object findAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
