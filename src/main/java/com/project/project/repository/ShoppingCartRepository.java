package com.project.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.project.model.ShoppingCart;

public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Integer>{

}
