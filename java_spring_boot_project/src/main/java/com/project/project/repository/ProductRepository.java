package com.project.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.project.model.Product;

public interface ProductRepository extends JpaRepository<Product, String>{

}
