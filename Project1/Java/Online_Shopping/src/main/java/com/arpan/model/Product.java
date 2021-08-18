package com.arpan.model;

public class Product {
	private int product_id;
	private String product_name;
	private Double product_price;
	private int product_count;
	private String product_type;
	
	public Product() {
		
	}
	
	public Product(String product_name, Double product_price, int product_count, String product_type) {
		super();
		this.product_name = product_name;
		this.product_price = product_price;
		this.product_count = product_count;
		this.product_type = product_type;
	}

	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public Double getProduct_price() {
		return product_price;
	}
	public void setProduct_price(Double product_price) {
		this.product_price = product_price;
	}
	public int getProduct_count() {
		return product_count;
	}
	public void setProduct_count(int product_count) {
		this.product_count = product_count;
	}
	public String getProduct_type() {
		return product_type;
	}
	public void setProduct_type(String product_type) {
		this.product_type = product_type;
	}

	@Override
	public String toString() {
		return "Product [product_id=" + product_id + ", product_name=" + product_name + ", product_price="
				+ product_price + ", product_count=" + product_count + ", product_type=" + product_type + "]";
	}

		
}