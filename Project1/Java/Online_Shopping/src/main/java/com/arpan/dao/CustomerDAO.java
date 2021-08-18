package com.arpan.dao;

import com.arpan.model.Customer;
import com.arpan.exception.BusinessException;

public interface CustomerDAO {
	public Customer createNewCustomer(Customer customer) throws BusinessException;
	public boolean changePassword(String email_id,String password) throws BusinessException;
	public Customer getCustomerDetails(String email_id) throws BusinessException;
	public boolean changeContact(String email_id,Long contact) throws BusinessException;
}
