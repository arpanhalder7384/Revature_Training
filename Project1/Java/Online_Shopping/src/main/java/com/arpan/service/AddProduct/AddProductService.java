package com.arpan.service.AddProduct;

import java.util.*;
import org.apache.log4j.Logger;

import com.arpan.exception.BusinessException;
import com.arpan.model.Admin;
import com.arpan.model.Customer;
import com.arpan.model.Product;
import com.arpan.service.loginValidation.LoginValidationService;
import com.arpan.service.loginValidation.impl.LoginValidationServiceImpl;
import com.arpan.service.AddProduct.AddProductService;
import com.arpan.service.AddProduct.impl.AddProductServiceImpl;

public interface AddProductService {
	public Product addNewProduct(Product product) throws BusinessException;
	public int addExistingProduct() throws BusinessException;
}
