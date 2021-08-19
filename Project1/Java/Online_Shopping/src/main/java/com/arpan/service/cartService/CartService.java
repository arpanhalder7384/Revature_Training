package com.arpan.service.cartService;

import java.util.List;

import com.arpan.exception.BusinessException;
import com.arpan.model.Customer;
import com.arpan.model.Product;

public interface CartService {
	public boolean addToCart(Product product, int product_quantity, int customer_id) throws BusinessException;
	public boolean romoveItemFromCart(String product_name, Customer customer) throws BusinessException;
	public List<Product> getCartDetails(Customer customer) throws BusinessException;
}
