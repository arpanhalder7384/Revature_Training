package com.arpan.service.orderService.impl;

import java.util.List;

import com.arpan.model.Ordered;

import com.arpan.exception.BusinessException;
import com.arpan.model.Customer;
import com.arpan.model.Product;
import com.arpan.dao.OrderDAO;
import com.arpan.dao.impl.OrderDAOImpl;
import com.arpan.service.orderService.OrderService;

public class OrderServiceImpl implements OrderService{

	@Override
	public List<Ordered> getOrderDetails(Customer customer) throws BusinessException {
		OrderDAO orderDAO=new OrderDAOImpl();
		List<Ordered> orderedList=orderDAO.getOrderDetails(customer);
		return orderedList;
	}

	@Override
	public Product cancleOrder(Customer customer, Product product) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean placeOrder(int customerId,Product product) throws BusinessException {
		OrderDAO orderDAO=new OrderDAOImpl();
		boolean t=orderDAO.placeOrder(customerId, product);
		return t;
	}

	@Override
	public int noOfNewPlacedOrder() throws BusinessException {
		OrderDAO orderDAO=new OrderDAOImpl();
		int no=orderDAO.noOfNewPlacedOrder();
		return no;
	}

	@Override
	public List<Ordered> getAllNewPlacedOrder() throws BusinessException {
		OrderDAO orderDAO=new OrderDAOImpl();
		List<Ordered> orderedList=orderDAO.getAllNewPlacedOrder();
		return orderedList;
	}

	@Override
	public int noOfShippedOrder() throws BusinessException {
		OrderDAO orderDAO=new OrderDAOImpl();
		int no=orderDAO.noOfShippedOrder();
		return no;
	}

	@Override
	public List<Ordered> getAllShippedOrderDetails() throws BusinessException {
		OrderDAO orderDAO=new OrderDAOImpl();
		List<Ordered> orderedList=orderDAO.getAllShippedOrderDetails();
		return orderedList;
	}

}
