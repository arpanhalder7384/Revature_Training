package com.arpan.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.*;
import org.apache.log4j.Logger;

import com.arpan.dao.CustomerDAO;
import com.arpan.dao.dbutil.MySqlDbConnectionClass;
import com.arpan.exception.BusinessException;
import com.arpan.main.Main_Shopping;
import com.arpan.model.Customer;
import com.arpan.model.Product;

public class CustomerDAOImpl implements CustomerDAO{
	private static Logger log = Logger.getLogger(CustomerDAOImpl.class);
	
	@Override
	public Customer customerLoginValidation(String uname, String pass) throws BusinessException {
		Customer customer=new Customer();
		try(Connection connection=MySqlDbConnectionClass.getConnection()){
			String sql="select cus_id, name, email_id, contact from customer where email_id=? and password=?";
//			String sql="select cus_id, name,email_id, password from customer";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, uname);
			preparedStatement.setString(2,pass);
			ResultSet resultSet=preparedStatement.executeQuery();
			if(resultSet.next()) {
				customer.setCus_id((resultSet.getInt("cus_id")));
				customer.setName(resultSet.getString("name"));
				customer.setEmail_id(resultSet.getString("email_id"));
				customer.setContact(resultSet.getLong("contact"));
			}
			else {
				log.info("\nEntered details of customer Username: "+uname+" With password: "+pass+" doesn't exist\n");
				return null;
			}
		}
		catch (ClassNotFoundException | SQLException e) {
			log.error(e);
			throw new BusinessException("Internal error occured contact system admin");
		}
		return customer;
	}
	
	@Override
	public Customer createNewCustomer(Customer customer) throws BusinessException {
		try (Connection connection = MySqlDbConnectionClass.getConnection()) {
			String sql="insert into customer(email_id,name, password, contact) values(?,?,?,?) ";
			PreparedStatement  preparedStatement =connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			preparedStatement.setString(1,customer.getEmail_id());
			preparedStatement.setString(2, customer.getName());
			preparedStatement.setString(3,customer.getPassword());
			preparedStatement.setLong(4, customer.getContact());
			
			int c=preparedStatement.executeUpdate();
			if(c==1)
			{
				ResultSet resultSet=preparedStatement.getGeneratedKeys();
				if(resultSet.next())
				{
					customer.setCus_id(resultSet.getInt(1));
				}
				log.info("\nCustomer Created Succesfully");
			}
		}
		catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal Error occured contact sysadmin");
		}
		return customer;
	}

	@Override
	public boolean changePassword(String email_id, String password) throws BusinessException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Customer getCustomerDetails(String email_id) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean changeContact(String email_id, Long contact) throws BusinessException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Product> changeOrderStatusToReceived() throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean changeOrderStatusToReceived(int orderId) throws BusinessException {
		try (Connection connection = MySqlDbConnectionClass.getConnection()) {
			String sql="update ordered set status=\"Order Received\" where order_id=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1,orderId);
			int c=preparedStatement.executeUpdate();
			if(c>0)
			{
				log.info("OrderID: "+orderId+ " is Received");
				return true;
			}
		}
		catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal Error occured contact sysadmin");
		}
		return false;
	}
}
