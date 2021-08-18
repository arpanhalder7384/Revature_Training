package com.arpan.dao.impl;

import com.arpan.exception.BusinessException;
import com.arpan.model.Admin;
import com.arpan.model.Customer;
import com.arpan.service.loginValidation.LoginValidationService;

import java.sql.*;
import org.apache.log4j.Logger;


import com.arpan.dao.LoginDAO;
import com.arpan.dao.dbutil.MySqlDbConnectionClass;

public class LoginDAPImpl implements LoginDAO{
	private static Logger log = Logger.getLogger(LoginDAPImpl.class);
	
	@Override
	public Admin adminLoginValidation(String uname, String pass) throws BusinessException {
		Admin admin=new Admin();
		try(Connection connection=MySqlDbConnectionClass.getConnection()){
			String sql="select  name, contact from admin where email_id=? and password=?";
//			String sql="select cus_id, name,email_id, password from customer";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, uname);
			preparedStatement.setString(2,pass);
			ResultSet resultSet=preparedStatement.executeQuery();
			if(resultSet.next()) {
				admin.setName(resultSet.getString("name"));
				admin.setContact(resultSet.getLong("contact"));
			}
			else {
				log.info("\nEntered details of Admin Username: "+uname+" With password: "+pass+" doesn't exist\n");
				return null;
			}
		}
		catch (ClassNotFoundException | SQLException e) {
			log.error(e);
			throw new BusinessException("Internal error occured contact system admin");
		}
		return admin;
	}

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

}
