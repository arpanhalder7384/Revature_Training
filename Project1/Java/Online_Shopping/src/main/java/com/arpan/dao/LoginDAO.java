package com.arpan.dao;

import com.arpan.exception.BusinessException;
import com.arpan.model.Admin;
import com.arpan.model.Customer;

public interface LoginDAO {
	public Admin adminLoginValidation(String uname,String pass) throws BusinessException;
	public Customer customerLoginValidation(String uname,String pass) throws BusinessException;
}
