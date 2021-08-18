package com.arpan.main;
import java.util.*;
import org.apache.log4j.Logger;

import com.arpan.dao.LoginDAO;
import com.arpan.dao.impl.LoginDAPImpl;
import com.arpan.exception.BusinessException;
import com.arpan.model.Admin;
import com.arpan.model.Customer;
import com.arpan.model.Product;
import com.arpan.service.loginValidation.LoginValidationService;
import com.arpan.service.loginValidation.impl.LoginValidationServiceImpl;
import com.arpan.dao.ProductDAO;
import com.arpan.dao.impl.ProductDAOImpl;

public class Testing_main {

	public static void main(String[] args) {
//		LoginDAO login=new LoginDAPImpl();
//		try {
//			Customer customer=login.customerLoginValidation("test@gmail.com", "test12345@");
//			System.out.println(customer);
//		} catch (BusinessException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		ProductDAO productDAO=new ProductDAOImpl();
		Product p=new Product("Wrong Blue Jeans", 1350.00,50,"Men Dress");
		try {
			Product pnew=productDAO.addNewProduct(p);
			System.out.println(pnew);
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
