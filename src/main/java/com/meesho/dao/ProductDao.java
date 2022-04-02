package com.meesho.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.meesho.dto.OrderRequest;
import com.meesho.entity.Product;
import com.meesho.repository.ProductRepository;


@Repository
public class ProductDao {
@Autowired
ProductRepository  productrepository;
	public String addDetails(OrderRequest request) {
		productrepository.save(request.getProduct());
		return "sucess";
	}
	


}
