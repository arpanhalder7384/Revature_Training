package com.arpan.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import org.apache.log4j.Logger;

import com.arpan.dao.CartDAO;
import com.arpan.dao.dbutil.MySqlDbConnectionClass;
import com.arpan.exception.BusinessException;
import com.arpan.main.Main_Shopping;
import com.arpan.model.Customer;
import com.arpan.model.Product;

public class CartDAOImpl implements CartDAO{
	private static Logger log = Logger.getLogger(CartDAOImpl.class);
	
	@Override
	public boolean addToCart(Product product, int product_quantity, int customer_id) throws BusinessException {
		boolean t= false;
		try (Connection connection = MySqlDbConnectionClass.getConnection()) {
			if(product_quantity>product.getProduct_count())
			{
				log.info("The number of availability of "+product.getProduct_name() +" is "+product.getProduct_count()
				+ "\nPlease enter no of product less than or euqal to "+product.getProduct_count()+"\n");
			}
			String sql="insert into cart(product_id,cus_id,no_of_item,price) values(?,?,?,?)";
			PreparedStatement preparedstatement=connection.prepareStatement(sql);
			preparedstatement.setInt(1, product.getProduct_id());
			preparedstatement.setInt(2, customer_id);
			preparedstatement.setInt(3, product_quantity);
			preparedstatement.setDouble(4, product.getProduct_price()*product_quantity);
			int c=preparedstatement.executeUpdate();
			if(c==1)
			{
				/*
				 * Write Code to Maintain Product Count
				 */
				
				return true;
			}
			else {
				return false;
			}
		}catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal Error occured contact sysadmin");			
		}
	}

	@Override
	public boolean romoveItemFromCart(String product_name, Customer customer) throws BusinessException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Product> getCartDetails(Customer customer) throws BusinessException {
		List<Product> productList=new ArrayList<>();
		try (Connection connection = MySqlDbConnectionClass.getConnection()) {
			String sql="select p.product_id, product_name, no_of_item, price from cart c join product p where c.cus_id=? and c.product_id=p.product_id";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, customer.getCus_id());
			ResultSet resultSet=preparedStatement.executeQuery();
			int i=0;
			while(resultSet.next())
			{
				i++;
				Product product=new Product();
				product.setSerialno(i);
				product.setProduct_id(resultSet.getInt("product_id"));
				product.setProduct_name(resultSet.getString("product_name"));
				product.setProduct_count(resultSet.getInt("no_of_item"));
				product.setProduct_price(resultSet.getDouble("price"));
				productList.add(product);
			}
		}
		catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal Error occured contact sysadmin");			
		}
		return productList;
	}

	

}
