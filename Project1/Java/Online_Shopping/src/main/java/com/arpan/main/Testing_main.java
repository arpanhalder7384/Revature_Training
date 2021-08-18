package com.arpan.main;
import java.util.*;
import org.apache.log4j.Logger;

import com.arpan.dao.LoginDAO;
import com.arpan.dao.impl.LoginDAPImpl;
import com.arpan.exception.BusinessException;
import com.arpan.model.Admin;
import com.arpan.model.Customer;
import com.arpan.service.loginValidation.LoginValidationService;
import com.arpan.service.loginValidation.impl.LoginValidationServiceImpl;

public class Testing_main {

	public static void main(String[] args) {
		LoginDAO login=new LoginDAPImpl();
		try {
			Customer customer=login.customerLoginValidation("test@gmail.com", "test12345@");
			System.out.println(customer);
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
