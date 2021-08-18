package com.arpan.dao;

import java.util.*;

import com.arpan.exception.BusinessException;
import com.arpan.model.Admin;
import com.arpan.model.Customer;
import com.arpan.model.Product;
import com.arpan.service.loginValidation.LoginValidationService;
import com.arpan.service.loginValidation.impl.LoginValidationServiceImpl;
import com.arpan.service.AddProduct.AddProductService;
import com.arpan.service.AddProduct.impl.AddProductServiceImpl;

public interface ProductDAO {
	public Product addNewProduct(Product product) throws BusinessException;
	public int getProductDetails() throws BusinessException;
	public List<Product> getAllProduct() throws BusinessException;
}
