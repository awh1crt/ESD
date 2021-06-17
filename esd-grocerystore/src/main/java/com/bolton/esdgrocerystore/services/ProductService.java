package com.bolton.esdgrocerystore.services;

import org.springframework.stereotype.Service;

import com.bolton.esdgrocerystore.models.Product;

@Service
public interface ProductService {
	
	Product addProduct(Product product);
	
	Product findProductById(int id);
	
	
	
	Iterable<Product> findByProductName(String pName);
	
	Iterable<Product> showAllProducts();
	
	void  deleteById(int id);
	
	void updateProduct(Product product);

	Product updateProduct(Integer id);

	Product updateProduct(int id);

	Product updateProduct();
	
	

}
