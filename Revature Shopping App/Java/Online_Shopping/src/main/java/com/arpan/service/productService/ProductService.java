package com.arpan.service.productService;

import java.util.*;
import org.apache.log4j.Logger;

import com.arpan.exception.BusinessException;
import com.arpan.model.Admin;
import com.arpan.model.Customer;
import com.arpan.model.Product;
import com.arpan.service.productService.impl.ProductServiceImpl;


public interface ProductService {
	public Product addNewProduct(Product product) throws BusinessException;
	public int addExistingProduct() throws BusinessException;
	public Product getProductDetails() throws BusinessException;
	public List<Product> getAllProduct() throws BusinessException;
}
