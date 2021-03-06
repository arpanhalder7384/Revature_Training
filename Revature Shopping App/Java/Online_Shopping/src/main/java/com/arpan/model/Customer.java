package com.arpan.model;

public class Customer {
	@Override
	public String toString() {
		return "Customer [cus_id=" + cus_id + ", name=" + name + ", email_id=" + email_id + ", contact=" + contact
				+ "]";
	}
	int cus_id;
	String name;
	String email_id;
	long contact;
	private String password;
	
	public Customer() {
		
	}
	public Customer(String name, String email_id, long contact) {
		super();
		this.name = name;
		this.email_id = email_id;
		this.contact = contact;
	}
	
	
	public Customer(String name, String email_id, long contact, String password) {
		super();
		this.name = name;
		this.email_id = email_id;
		this.contact = contact;
		this.password = password;
	}
	public Customer(int cus_id, String name, String email_id, long contact, String password) {
		super();
		this.cus_id = cus_id;
		this.name = name;
		this.email_id = email_id;
		this.contact = contact;
		this.password = password;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getCus_id() {
		return cus_id;
	}
	public void setCus_id(int cus_id) {
		this.cus_id = cus_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	
}
