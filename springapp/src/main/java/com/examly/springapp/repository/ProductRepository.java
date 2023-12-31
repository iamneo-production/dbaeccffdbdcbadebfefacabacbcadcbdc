package com.examly.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.model.ProductModel;

@Repository
public interface ProductRepository extends JpaRepository<ProductModel, String> {

}
