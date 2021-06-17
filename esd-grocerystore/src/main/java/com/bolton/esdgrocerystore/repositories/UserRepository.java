package com.bolton.esdgrocerystore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bolton.esdgrocerystore.models.UserRegister;

@Repository
public interface UserRepository extends CrudRepository<UserRegister, Integer>{

}
