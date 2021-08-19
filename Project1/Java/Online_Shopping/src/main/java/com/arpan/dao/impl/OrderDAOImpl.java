package com.arpan.dao.impl;

import com.arpan.exception.BusinessException;
import com.arpan.model.Admin;
import com.arpan.model.Customer;
import com.arpan.model.Product;
import com.arpan.service.productService.ProductService;
import com.arpan.service.productService.impl.ProductServiceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.apache.log4j.Logger;

import com.arpan.dao.OrderDAO;
import com.arpan.dao.dbutil.MySqlDbConnectionClass;

public class OrderDAOImpl implements OrderDAO{
	private static Logger log = Logger.getLogger(OrderDAOImpl.class);
	
	@Override
	public boolean placeOrder(int customerId, Product product) throws BusinessException {
		boolean t=false;
		try(Connection connection=MySqlDbConnectionClass.getConnection()){
			String sql="insert into ordered(cus_id,product_id,status) values(?,?,?)";
			PreparedStatement preparedStatement=connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			preparedStatement.setInt(1,customerId);
			preparedStatement.setInt(2,product.getProduct_id());
			preparedStatement.setString(3, "Order Placed");		
			
			int c=preparedStatement.executeUpdate();
			if(c==1)
			{
				return true;
			}
		}
		catch (ClassNotFoundException | SQLException e) {
			log.error(e);
			throw new BusinessException("Internal error occured contact sysadmin");
		}
		return t;
	}

	@Override
	public List<Product> getOrderDetails(Customer customer) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product cancleOrder(Customer customer, Product product) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	

}
