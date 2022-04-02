package com.meesho.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meesho.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}

