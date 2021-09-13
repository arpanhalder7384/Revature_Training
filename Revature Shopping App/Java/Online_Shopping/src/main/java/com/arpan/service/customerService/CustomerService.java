package com.arpan.service.customerService;

import com.arpan.exception.BusinessException;

import com.arpan.model.Customer;
import com.arpan.exception.BusinessException;

public interface CustomerService {
	public Customer customerLoginValidation(String uname,String pass) throws BusinessException;
	public Customer createNewCustomer(Customer customer) throws BusinessException;
	public boolean changeOrderStatusToReceived(int orderId) throws BusinessException;
}
