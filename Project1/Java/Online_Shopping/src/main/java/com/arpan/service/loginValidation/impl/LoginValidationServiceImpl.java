package com.arpan.service.loginValidation.impl;

import com.arpan.exception.BusinessException;
import com.arpan.model.Admin;
import com.arpan.model.Customer;
import com.arpan.service.loginValidation.LoginValidationService;


public class LoginValidationServiceImpl implements LoginValidationService{

	@Override
	public Admin adminLoginValidation(String uname, String pass) throws BusinessException {
		return null;
	}

	@Override
	public Customer customerLoginValidation(String uname, String pass) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

}
