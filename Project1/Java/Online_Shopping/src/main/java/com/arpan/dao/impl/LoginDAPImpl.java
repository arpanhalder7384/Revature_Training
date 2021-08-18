package com.arpan.dao.impl;

import com.arpan.exception.BusinessException;
import com.arpan.model.Admin;
import com.arpan.model.Customer;
import com.arpan.service.loginValidation.LoginValidationService;
import com.arpan.dao.LoginDAO;

public class LoginDAPImpl implements LoginDAO{

	@Override
	public Admin adminLoginValidation(String uname, String pass) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer customerLoginValidation(String uname, String pass) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

}
