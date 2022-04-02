package com.meesho.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private Long sonum;
	private String cname;
	private String pname;
	private String deliverytype;
	private String orderdate;
	public Long getSonum() {
		return sonum;
	}
	public String getCname() {
		return cname;
	}
	public String getPname() {
		return pname;
	}
	
		
	public void setSonum(Long sonum) {
		this.sonum = sonum;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}


public String getDeliverytype() {
		return deliverytype;
	}
	public void setDeliverytype(String deliverytype) {
		this.deliverytype = deliverytype;
	}

public String getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(String orderdate) {
		this.orderdate = orderdate;
	}

@OneToMany(targetEntity =PrabuProducts.class,cascade = CascadeType.ALL )
@JoinColumn(name = "pp_fk",referencedColumnName = "id")
private List<PrabuProducts> ppr;






}
