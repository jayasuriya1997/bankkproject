package com.meesho.entity;

import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class PrabuProducts {
@Id
	private int rno;
     private int id;
 	private String cname;
    private String caddress;
	public int getRno() {
		return rno;
	}
	public int getId() {
		return id;
	}
	public String getCname() {
		return cname;
	}
	public String getCaddress() {
		return caddress;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}
    
    
    
    
}
