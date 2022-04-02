package com.meesho.dto;

import com.meesho.entity.Product;

public class OrderRequest {

	private Product product;

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
}
