package com.bolton.esdgrocerystore.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.bolton.esdgrocerystore.models.CartItem;
import com.bolton.esdgrocerystore.models.UserRegister;

public interface CartItemRepository extends CrudRepository<CartItem, Integer>{
	
	public List<CartItem> findByCustomer(UserRegister customer);
}
