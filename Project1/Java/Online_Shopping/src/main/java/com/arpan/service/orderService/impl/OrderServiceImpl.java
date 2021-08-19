package com.arpan.service.orderService.impl;

import java.util.List;

import com.arpan.exception.BusinessException;
import com.arpan.model.Customer;
import com.arpan.model.Product;
import com.arpan.dao.OrderDAO;
import com.arpan.dao.impl.OrderDAOImpl;
import com.arpan.service.orderService.OrderService;

public class OrderServiceImpl implements OrderService{

	@Override
	public List<Product> getOrderDetails(Customer customer) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product cancleOrder(Customer customer, Product product) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean placeOrder(int customerId,Product product) throws BusinessException {
		// TODO Auto-generated method stub
		return false;
	}

}
