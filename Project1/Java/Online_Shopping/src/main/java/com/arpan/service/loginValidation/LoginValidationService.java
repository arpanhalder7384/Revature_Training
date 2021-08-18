package com.arpan.service.loginValidation;

import com.arpan.model.Admin;
import com.arpan.model.Customer;
import com.arpan.exception.BusinessException;

public interface LoginValidationService {
	public Admin adminLoginValidation(String uname,String pass) throws BusinessException;
	public Customer customerLoginValidation(String uname,String pass) throws BusinessException;
}
