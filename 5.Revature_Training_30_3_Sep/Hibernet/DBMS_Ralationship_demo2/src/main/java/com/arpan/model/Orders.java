package com.arpan.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Orders {
	
	@Id
	private String orderId;
	private double totalBilll;
	
	@ManyToOne
	@JoinColumn(name="customerId")
	private Customer customer;
	public Orders() {
		
	}
	public Orders(String orderId, double totalBilll) {
		super();
		this.orderId = orderId;
		this.totalBilll = totalBilll;
	}
	public String getOrderId() {
		return orderId;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public double getTotalBilll() {
		return totalBilll;
	}
	public void setTotalBilll(double totalBilll) {
		this.totalBilll = totalBilll;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", totalBilll=" + totalBilll + "]";
	}
	
	
}
