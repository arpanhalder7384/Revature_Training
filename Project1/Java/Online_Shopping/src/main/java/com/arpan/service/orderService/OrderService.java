package com.arpan.service.orderService;

import java.util.List;

import com.arpan.exception.BusinessException;
import com.arpan.model.Customer;
import com.arpan.model.Product;

public interface OrderService {
	public boolean placeOrder(int customerId,Product product) throws BusinessException;
	public List<Product> getOrderDetails(Customer customer) throws BusinessException;	
	public Product cancleOrder(Customer customer, Product product) throws BusinessException;
}
