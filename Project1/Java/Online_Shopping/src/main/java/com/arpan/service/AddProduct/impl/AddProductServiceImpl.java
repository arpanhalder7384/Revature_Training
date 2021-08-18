package com.arpan.service.AddProduct.impl;

import java.util.*;
import org.apache.log4j.Logger;

import com.arpan.dao.ProductDAO;
import com.arpan.dao.impl.ProductDAOImpl;
import com.arpan.exception.BusinessException;
import com.arpan.model.Admin;
import com.arpan.model.Customer;
import com.arpan.model.Product;
import com.arpan.service.loginValidation.LoginValidationService;
import com.arpan.service.loginValidation.impl.LoginValidationServiceImpl;
import com.arpan.service.AddProduct.AddProductService;
import com.arpan.service.AddProduct.impl.AddProductServiceImpl;

public class AddProductServiceImpl implements AddProductService{

	@Override
	public Product addNewProduct(Product product) throws BusinessException {
		ProductDAO productDAO=new ProductDAOImpl();
		Product productnew=productDAO.addNewProduct(product);
		return productnew;
	}

	@Override
	public int addExistingProduct() throws BusinessException {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
