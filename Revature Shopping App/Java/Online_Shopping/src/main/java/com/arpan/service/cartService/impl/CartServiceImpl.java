package com.arpan.service.cartService.impl;

import java.util.List;

import org.apache.log4j.Logger;

import com.arpan.exception.BusinessException;
import com.arpan.main.Main_Shopping;
import com.arpan.model.Customer;
import com.arpan.model.Product;
import com.arpan.service.cartService.CartService;
import com.arpan.dao.CartDAO;
import com.arpan.dao.impl.CartDAOImpl;
import com.arpan.dao.impl.CustomerDAOImpl;

public class CartServiceImpl implements CartService
{
	private static Logger log = Logger.getLogger(CartServiceImpl.class);
	@Override
	public boolean addToCart(Product product, int product_quantity, int customer_id) throws BusinessException {
		if(product_quantity<=0)
		{
			log.info("product quantity is not Zero or negative");
			return false;
		}
		else {
			CartDAO cartDAO=new CartDAOImpl();
			boolean t=cartDAO.addToCart(product, product_quantity, customer_id);
			return t;
		}
	}

	@Override
	public boolean romoveItemFromCart(String product_name, Customer customer) throws BusinessException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Product> getCartDetails(Customer customer) throws BusinessException {
		List<Product> productList=null;
		CartDAO cartDAO=new CartDAOImpl();
		productList=cartDAO.getCartDetails(customer);
		return productList;
	}

}
