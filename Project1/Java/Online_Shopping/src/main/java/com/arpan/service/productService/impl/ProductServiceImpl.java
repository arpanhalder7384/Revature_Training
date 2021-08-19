package com.arpan.service.productService.impl;

import java.util.*;
import org.apache.log4j.Logger;

import com.arpan.dao.ProductDAO;
import com.arpan.dao.impl.ProductDAOImpl;
import com.arpan.exception.BusinessException;
import com.arpan.model.Admin;
import com.arpan.model.Customer;
import com.arpan.model.Product;
import com.arpan.service.productService.ProductService;

public class ProductServiceImpl implements ProductService{
	
	@Override
	public Product getProductDetails() throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAllProduct() throws BusinessException {
		ProductDAO productDAO=new ProductDAOImpl();
		List<Product> productList=productDAO.getAllProduct();
		return productList;
	}

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
