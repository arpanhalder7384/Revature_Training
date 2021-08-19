package com.arpan.dao.impl;

import com.arpan.exception.BusinessException;
import com.arpan.model.Admin;
import com.arpan.model.Customer;
import com.arpan.model.Product;
import com.arpan.model.Ordered;
import com.arpan.service.productService.ProductService;
import com.arpan.service.productService.impl.ProductServiceImpl;
import com.mysql.cj.protocol.Resultset;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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
			String sqll="Select no_of_item from cart where cus_id=? and product_id=?";
			PreparedStatement preparedStatement0=connection.prepareStatement(sqll);
			preparedStatement0.setInt(1, customerId);
			preparedStatement0.setInt(2, product.getProduct_id());
			ResultSet resultSet=preparedStatement0.executeQuery();
			int count=0;
			if(resultSet.next())
			{
				count=resultSet.getInt("no_of_item");
			}
			String sql="insert into ordered(cus_id,product_id,status, product_count) values(?,?,?,?)";
			PreparedStatement preparedStatement=connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			preparedStatement.setInt(1,customerId);
			preparedStatement.setInt(2,product.getProduct_id());
			preparedStatement.setString(3, "Order Placed");	
			preparedStatement.setInt(4, count);
			
			int c=preparedStatement.executeUpdate();
			
			String sql2="delete from cart where cus_id=? and product_id=?";
			PreparedStatement preparedStatement2=connection.prepareStatement(sql2);
			preparedStatement2.setInt(1, customerId);
			preparedStatement2.setInt(2, product.getProduct_id());
			int i=preparedStatement2.executeUpdate();
			
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
	public List<Ordered> getOrderDetails(Customer customer) throws BusinessException {
		List<Ordered> orderedList=new ArrayList<>();
		try(Connection connection=MySqlDbConnectionClass.getConnection()){
			String sql="select order_id,product_name,o.product_count, product_price, status from ordered o join product p where cus_id=? and p.product_id=o.product_id";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, customer.getCus_id());
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next())
			{
				Ordered ordered=new Ordered();
				ordered.setOrder_id(resultSet.getInt("order_id"));
				ordered.setProductName(resultSet.getString("product_name"));
				ordered.setProduct_count(resultSet.getInt("product_count"));
				ordered.setPrice(resultSet.getDouble("product_price")*resultSet.getInt("product_count"));
				ordered.setStatus(resultSet.getString("status"));
				orderedList.add(ordered);
			}
			if(orderedList.size()==0)
			{
				return null;
			}
//			for(Ordered o:orderedList)
//			{
//				System.out.println(o);
//			}
			return orderedList;
		}catch (ClassNotFoundException | SQLException e) {
			log.error(e);
			throw new BusinessException("Internal error occured contact sysadmin");
		}
		
	}

	@Override
	public Product cancleOrder(Customer customer, Product product) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int noOfNewPlacedOrder() throws BusinessException {
		try (Connection connection = MySqlDbConnectionClass.getConnection()) {
			String sql="select count(*) count from ordered where status=\"Order Placed\"";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			int no=0;
			if(resultSet.next())
			{
				no=resultSet.getInt("count");
			}
			return no;
		}
		catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal Error occured contact sysadmin");
		}
	}

	@Override
	public List<Ordered> getAllNewPlacedOrder() throws BusinessException {
		List<Ordered> orderedList=new ArrayList<>();
		try (Connection connection = MySqlDbConnectionClass.getConnection()) {
			String sql="select  order_id,product_name,o.product_count, product_price, status from ordered o join product p where status=\"Order Placed\" and o.product_id=p.product_id";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next())
			{
				Ordered ordered=new Ordered();
				ordered.setOrder_id(resultSet.getInt("order_id"));
				ordered.setProductName(resultSet.getString("product_name"));
				ordered.setProduct_count(resultSet.getInt("product_count"));
				ordered.setPrice(resultSet.getDouble("product_price")*resultSet.getInt("product_count"));
				ordered.setStatus(resultSet.getString("status"));
				orderedList.add(ordered);
			}
			if(orderedList.size()==0)
			{
				return null;
			}
			return orderedList;
		}
		catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal Error occured contact sysadmin");
		}
	}

	

}
