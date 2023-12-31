package com.examly.springapp.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.model.CartModel;

@Repository
public interface CartRepository extends JpaRepository<CartModel, String> {
	
//	List<CartModel> findByAllUserId(String userId);
	List<CartModel> findByUserId(String userId);
	
}
