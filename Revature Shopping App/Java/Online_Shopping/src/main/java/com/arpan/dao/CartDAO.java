package com.arpan.dao;

import java.util.*;

import com.arpan.model.Customer;
import com.arpan.model.Product;
import com.arpan.exception.BusinessException;

public interface CartDAO {
	public boolean addToCart(Product product, int product_quantity, int customer_id) throws BusinessException;
	public boolean romoveItemFromCart(String product_name, Customer customer) throws BusinessException;
	public List<Product> getCartDetails(Customer customer) throws BusinessException;
} 
