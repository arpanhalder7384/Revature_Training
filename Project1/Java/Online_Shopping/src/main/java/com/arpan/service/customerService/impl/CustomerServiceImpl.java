package com.arpan.service.customerService.impl;

import org.apache.log4j.Logger;

import com.arpan.dao.AdminDAO;
import com.arpan.dao.CustomerDAO;
import com.arpan.dao.impl.AdminDAOImpl;
import com.arpan.dao.impl.CustomerDAOImpl;
import com.arpan.exception.BusinessException;
import com.arpan.model.Admin;
import com.arpan.model.Customer;
import com.arpan.service.customerService.CustomerService;

public class CustomerServiceImpl implements CustomerService{
	private static Logger log = Logger.getLogger(CustomerServiceImpl.class);
	@Override
	public Customer customerLoginValidation(String uname, String pass) throws BusinessException {
		CustomerDAO customerDAO=new CustomerDAOImpl();
		Customer customernew=null;
		if(uname.matches("^(.+)@(.+)$")) {
			customernew=customerDAO.customerLoginValidation(uname, pass);
		}
		else {
			log.info("Invalid Username:"+uname+"\n");
		}
		return customernew;
	}
	@Override
	public Customer createNewCustomer(Customer customer) throws BusinessException {
		CustomerDAO customerDAO=new CustomerDAOImpl();
		Customer customernew=null;
		customernew=customerDAO.createNewCustomer(customer);
		return customernew;
	}
	@Override
	public boolean changeOrderStatusToReceived(int orderId) throws BusinessException {
		CustomerDAO customerDAO=new CustomerDAOImpl();
		boolean b =customerDAO.changeOrderStatusToReceived(orderId);
		return b;
	}

}
