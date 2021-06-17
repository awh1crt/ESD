package com.bolton.esdgrocerystore.services;

import org.springframework.stereotype.Service;

import com.bolton.esdgrocerystore.models.CartItem;
import com.bolton.esdgrocerystore.models.UserRegister;

@Service
public interface CartItemService {
	
	Iterable<CartItem> findByCustomer(UserRegister user);

}
