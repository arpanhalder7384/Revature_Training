package com.arpan.model;

public class Ordered {
	private int order_id;
	private int cus_id;
	private int product_id;
	private String productName;
	private String status;
	private double price;
	private int product_count;
	
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public int getCus_id() {
		return cus_id;
	}
	public void setCus_id(int cus_id) {
		this.cus_id = cus_id;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
		
	public int getProduct_count() {
		return product_count;
	}
	public void setProduct_count(int product_count) {
		this.product_count = product_count;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void getOrderDetails()
	{
		System.out.printf("%-15d %-25s %-15d %-18.2f %-20s\n",this.order_id,this.productName, this.product_count,this.price, this.status);
	}
	
	@Override
	public String toString() {
		return "Ordered [order_id=" + order_id + ", cus_id=" + cus_id + ", product_id=" + product_id + ", productName="
				+ productName + ", status=" + status + "]";
	}
}
