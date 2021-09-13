package com.arpan.dao;

import java.util.*;

import com.arpan.model.Customer;
import com.arpan.model.Product;
import com.arpan.model.Ordered;
import com.arpan.exception.BusinessException;

public interface OrderDAO {
	public int noOfShippedOrder() throws BusinessException;
	public List<Ordered> getAllShippedOrderDetails() throws BusinessException;
	public int noOfNewPlacedOrder() throws BusinessException;
	public List<Ordered> getAllNewPlacedOrder() throws BusinessException;
	public boolean placeOrder(int customerId,Product product) throws BusinessException;
	public List<Ordered> getOrderDetails(Customer customer) throws BusinessException;	
	public Product cancleOrder(Customer customer, Product product) throws BusinessException;
}
