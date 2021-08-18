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
