package com.bolton.esdgrocerystore;

import static org.junit.Assert.assertTrue;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.bolton.esdgrocerystore.models.CartItem;
import com.bolton.esdgrocerystore.models.Product;
import com.bolton.esdgrocerystore.models.UserRegister;
import com.bolton.esdgrocerystore.repositories.CartItemRepository;
import com.bolton.esdgrocerystore.repositories.ProductRepository;
import com.bolton.esdgrocerystore.repositories.UserRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
@Rollback(false)
public class CartTest {
	
	@Autowired
	private CartItemRepository cartItemRepository;
	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private EntityManager entityManager;
	
	
	@Test
	public void addOneCartItem() {
		
		Product product = entityManager.find(Product.class, 3);
		UserRegister user = entityManager.find(UserRegister.class, 4);
		System.out.println(product);
		System.out.println(user);
		
		CartItem newCartItem = new CartItem();
		newCartItem.setProduct(product);
		newCartItem.setCustomer(user);
		newCartItem.setQuantity(1);
		
		System.out.println(newCartItem);
		
		cartItemRepository.save(newCartItem);
		
		assertTrue(newCartItem.getCartItemId() > 0);
		
		
		
		
	}

}
