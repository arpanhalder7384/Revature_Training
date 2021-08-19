package com.arpan.main;
import java.util.*;
import org.apache.log4j.Logger;


import com.arpan.exception.BusinessException;
import com.arpan.model.Admin;
import com.arpan.model.Customer;
import com.arpan.model.Product;
import com.arpan.dao.ProductDAO;
import com.arpan.dao.impl.ProductDAOImpl;
import com.arpan.dao.CustomerDAO;
import com.arpan.dao.impl.CustomerDAOImpl;
import com.arpan.dao.CartDAO;
import com.arpan.dao.impl.CartDAOImpl;
import com.arpan.dao.OrderDAO;
import com.arpan.dao.impl.OrderDAOImpl;

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
		
//		ProductDAO productDAO=new ProductDAOImpl();
//		Product p=new Product("Wrong Blue Jeans", 1350.00,50,"Men Dress");
//		try {
//			Product pnew=productDAO.addNewProduct(p);
//			System.out.println(pnew);
//		} catch (BusinessException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		CustomerDAO customerDAO=new CustomerDAOImpl();
//		Customer customer=new Customer(12,"test test","test",7485149809L,"test");
//		try {
//			customer=customerDAO.createNewCustomer(customer);
//			
//		} catch (BusinessException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		ProductDAO productDAO=new ProductDAOImpl();
//		try {
//			List<Product> listProduct=productDAO.getAllProduct();
//			System.out.printf("%-30s %-15s %-15s %-15s\n","Product Name","Price","Available","Product Type");
//			System.out.println("----------------------------------------------------------------------------");
//			for(Product p:listProduct)
//			{
//				p.getProductDetails();
//			}
//		} catch (BusinessException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		CartDAO cartDAO=new CartDAOImpl();
//		Product product=new Product("Samsung M31",17000.00,10,"Mobile");
//		product.setProduct_id(1);
//		try {
//			boolean t=cartDAO.addToCart(product, 2, 101);
//			if(t==true)
//			{
//				System.out.println("Product is in cart");
//			}
//		} catch (BusinessException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		CartDAO cartDAO=new CartDAOImpl();
//		try {
//			List<Product> productList=cartDAO.getCartDetails(customer);
//			for(Product p:productList)
//			{
//				p.getProductDetailsByCart();
//			}
//		} catch (BusinessException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		OrderDAO orderDAO=new OrderDAOImpl();
		Product product=new Product("sss", 1000.0, 2, "sss");
		product.setProduct_id(5);
		try {
			boolean t=orderDAO.placeOrder(100, product);
			if(t==true)
			{
				System.out.println("Order Placed");
			}
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
