package com.meesho.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.meesho.dto.OrderRequest;


import com.meesho.service.ProductService;
@RestController
@RequestMapping("/products")
public class ProductController {
@Autowired
ProductService productservice;

@PostMapping("/add")
public String addDetails(@RequestBody OrderRequest request) {
	return productservice.addDetails(request);
} 



} 









