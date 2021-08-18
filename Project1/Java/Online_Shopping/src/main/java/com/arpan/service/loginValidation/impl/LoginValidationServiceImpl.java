package com.arpan.service.loginValidation.impl;

import com.arpan.exception.BusinessException;
import com.arpan.model.Admin;
import com.arpan.model.Customer;
import com.arpan.service.loginValidation.LoginValidationService;
import com.arpan.dao.LoginDAO;
import com.arpan.dao.impl.LoginDAPImpl;

import org.apache.log4j.Logger;


public class LoginValidationServiceImpl implements LoginValidationService{
	private static Logger log = Logger.getLogger(LoginValidationServiceImpl.class);
	private LoginDAO logindao=new LoginDAPImpl();
	@Override
	public Admin adminLoginValidation(String uname, String pass) throws BusinessException {
		Admin admin=null;
		if(uname.matches("^(.+)@(.+)$")) {
			admin=logindao.adminLoginValidation(uname, pass);
		}
		else {
			log.info("Invalid Username:"+uname+"\n");
		}
		return admin;
	}

	@Override
	public Customer customerLoginValidation(String uname, String pass) throws BusinessException {
		Customer customer=null;
		if(!uname.matches("^(.+)@(.+)$")) {
			customer=logindao.customerLoginValidation(uname, pass);
		}
		else {
			log.info("Invalid Username:"+uname+"\n");
		}
		return customer;
	}

}
