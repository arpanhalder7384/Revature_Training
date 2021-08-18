package com.arpan.dao;

import com.arpan.model.Customer;
import com.arpan.exception.BusinessException;

public interface CustomerDAO {
	public Customer customersLoginValidation(String n,String p) throws BusinessException;
}
