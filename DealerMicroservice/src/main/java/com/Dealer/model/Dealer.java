package com.Dealer.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Dealer")
public class Dealer {
	@Id
	private String id;
	
	public Dealer() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String dealer_name;
	private String dealer_email;
	private String dealer_contactNo;
	private String password;
	public Dealer(String id, String dealer_name, String dealer_email, String dealer_contactNo, String password) {
		super();
		this.id = id;
		this.dealer_name = dealer_name;
		this.dealer_email = dealer_email;
		this.dealer_contactNo = dealer_contactNo;
		this.password = password;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDealer_name() {
		return dealer_name;
	}
	public void setDealer_name(String dealer_name) {
		this.dealer_name = dealer_name;
	}
	public String getDealer_email() {
		return dealer_email;
	}
	public void setDealer_email(String dealer_email) {
		this.dealer_email = dealer_email;
	}
	public String getDealer_contactNo() {
		return dealer_contactNo;
	}
	public void setDealer_contactNo(String dealer_contactNo) {
		this.dealer_contactNo = dealer_contactNo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
