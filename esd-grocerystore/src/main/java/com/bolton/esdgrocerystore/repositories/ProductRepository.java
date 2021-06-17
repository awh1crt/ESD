package com.bolton.esdgrocerystore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bolton.esdgrocerystore.models.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {
	//@Query("select p from Product p where upper (p.productName) like concat ('%', upper(:name),'%')")
	@Query("select p from Product p where lower(p.productName) like lower(concat('%',:name, '%')) or lower(p.productName) like lower(concat('%',:name, '%'))")
	//Iterable<Student> findByNameIgnoreCase(String title);
	Iterable<Product> findByNameIgnoreCase(String name);
		
	
}
