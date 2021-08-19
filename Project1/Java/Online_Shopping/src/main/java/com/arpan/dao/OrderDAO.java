package com.arpan.dao;

import java.util.*;

import com.arpan.model.Customer;
import com.arpan.model.Product;
import com.arpan.exception.BusinessException;

public interface OrderDAO {
	public boolean placeOrder(int customerId,Product product) throws BusinessException;
	public List<Product> getOrderDetails(Customer customer) throws BusinessException;	
	public Product cancleOrder(Customer customer, Product product) throws BusinessException;
}
