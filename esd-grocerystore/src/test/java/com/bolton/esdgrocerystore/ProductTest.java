package com.bolton.esdgrocerystore;

import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.bolton.esdgrocerystore.models.Product;
import com.bolton.esdgrocerystore.repositories.ProductRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
@Rollback(false)
public class ProductTest {
	@Autowired
	private ProductRepository productRepository;
	
	@Test
	public void addOneProduct() {
		Product newProduct = new Product();
		newProduct.setProductName("Apple");
		newProduct.setProductDescription("Fruit");
		newProduct.setProductPrice(0.50);
		newProduct.setProductStock(200);
		
		Product savedProduct = productRepository.save(newProduct);
		
		assertTrue(savedProduct.getProductId() > 0);
		
		
	}

}
