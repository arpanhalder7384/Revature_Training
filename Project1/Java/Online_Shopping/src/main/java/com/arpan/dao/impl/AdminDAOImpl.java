package com.arpan.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;

import com.arpan.dao.dbutil.MySqlDbConnectionClass;
import com.arpan.exception.BusinessException;
import com.arpan.model.Admin;
import com.arpan.model.Product;
import com.arpan.dao.AdminDAO;

public class AdminDAOImpl implements AdminDAO{
	private static Logger log = Logger.getLogger(AdminDAOImpl.class);

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
	public boolean changePassword(String email_id, String password) throws BusinessException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Admin getCustomerDetails(String email_id) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean changeContact(String email_id, Long contact) throws BusinessException {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean changeOrderStatusToShipped() throws BusinessException {
		
		return false;
	}

}