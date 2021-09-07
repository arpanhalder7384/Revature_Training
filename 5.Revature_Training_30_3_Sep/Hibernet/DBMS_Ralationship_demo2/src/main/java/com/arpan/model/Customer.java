package com.arpan.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table
public class Customer {
	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
	private int customerId;
	private String customerName;
	@OneToMany(mappedBy="customer")
	private List<Orders> orderList=new ArrayList<>();
	
	public Customer() {
		
	}

	public Customer( String customerName, List<Orders> orderList) {
		super();
		this.customerName = customerName;
		this.orderList = orderList;
	}
	public Customer( int id,String customerName) {
		super();
		this.customerId=id;
		this.customerName = customerName;
	}
	public Customer( int id,String customerName, List<Orders> orderList) {
		super();
		this.customerId=id;
		this.customerName = customerName;
		this.orderList = orderList;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public List<Orders> getOrderList() {
		return orderList;
	}

	public void setOrderList(List<Orders> orderList) {
		this.orderList = orderList;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", orderList=" + orderList
				+ "]";
	}
}
