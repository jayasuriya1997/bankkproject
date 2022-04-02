package com.meesho.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meesho.dao.ProductDao;
import com.meesho.dto.OrderRequest;
import com.meesho.entity.Product;


@Service
public class ProductService {
@Autowired
ProductDao productdao;
	public String addDetails(OrderRequest request) {
	
		return productdao.addDetails(request) ;
	}


}
