package com.arpan.dao;

import java.util.*;

import com.arpan.exception.BusinessException;
import com.arpan.model.Admin;
import com.arpan.model.Customer;
import com.arpan.model.Product;
import com.arpan.service.productService.ProductService;
import com.arpan.service.productService.impl.ProductServiceImpl;

public interface ProductDAO {
	public Product addNewProduct(Product product) throws BusinessException;
	public Product getProductDetails() throws BusinessException;
	public List<Product> getAllProduct() throws BusinessException;
	public int addExistingProduct() throws BusinessException;
}
