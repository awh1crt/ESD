package com.bolton.esdgrocerystore.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bolton.esdgrocerystore.models.CartItem;
import com.bolton.esdgrocerystore.models.UserRegister;
import com.bolton.esdgrocerystore.repositories.CartItemRepository;

@Service
public class CartItemServiceImp implements CartItemService {

	@Autowired
	private CartItemRepository cartItemRepository;

	@Override
	public List<CartItem> findByCustomer(UserRegister user) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
