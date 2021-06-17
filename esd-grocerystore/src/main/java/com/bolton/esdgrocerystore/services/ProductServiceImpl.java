package com.bolton.esdgrocerystore.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.bolton.esdgrocerystore.models.Product;
import com.bolton.esdgrocerystore.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	private ProductRepository productRepository;
	
	public ProductServiceImpl (ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	@Override
	public Product addProduct(Product product) {
		return this.productRepository.save(product);
	}
	

	@Override
	public Product findProductById(int id) {
		Optional<Product> product = productRepository.findById(id);
		Product foundProduct = new Product(product.get().getProductName(), product.get().getProductDescription(), product.get().getProductPrice(), id);
		return foundProduct;
	}

	@Override
	public Iterable<Product> findByProductName(String pName) {
		return this.productRepository.findByNameIgnoreCase(pName);
	}

	@Override
	public Iterable<Product> showAllProducts() {
		Iterable<Product> products = productRepository.findAll();
		return products;
	}

	@Override
	public void deleteById(int id) {
		Optional<Product> product = productRepository.findById(id);
		productRepository.delete(product.get());
	}

	
	@Override
	public void updateProduct(Product product) {
		Optional<Product> updateProduct = productRepository.findById(product.getProductId());
		updateProduct.get().setProductName(product.getProductName());
		
		productRepository.save(updateProduct.get());
	}

	@Override
	public Product updateProduct(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product updateProduct(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product updateProduct() {
		// TODO Auto-generated method stub
		return null;
	}

}
