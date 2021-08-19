package com.arpan.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import org.apache.log4j.Logger;

import com.arpan.exception.BusinessException;
import com.arpan.main.Main_Shopping;
import com.arpan.model.Admin;
import com.arpan.model.Customer;
import com.arpan.model.Product;
import com.arpan.service.productService.ProductService;
import com.arpan.service.productService.impl.ProductServiceImpl;
import com.arpan.dao.ProductDAO;
import com.arpan.dao.dbutil.MySqlDbConnectionClass;

public class ProductDAOImpl implements  ProductDAO{
	private static Logger log = Logger.getLogger(ProductDAOImpl.class);

	@Override
	public Product addNewProduct(Product product) throws BusinessException {
		try(Connection connection=MySqlDbConnectionClass.getConnection()){
			String sqltest="select product_name from product where product_name=?";
			PreparedStatement preparedstatementtest=connection.prepareStatement(sqltest);
			preparedstatementtest.setString(1,product.getProduct_name());
			ResultSet resultset=preparedstatementtest.executeQuery();
			if(resultset.next())
			{
				return null;
			}
			String sql="insert into product(product_name,product_price,product_count,product_type) values(?,?,?,?)";
			PreparedStatement preparedStatement=connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			preparedStatement.setString(1, product.getProduct_name());
			preparedStatement.setDouble(2, product.getProduct_price());
			preparedStatement.setInt(3, product.getProduct_count());
			preparedStatement.setString(4, product.getProduct_type());
			int c=preparedStatement.executeUpdate();
			if(c==1) {
				ResultSet resultSet=preparedStatement.getGeneratedKeys();
				if(resultSet.next()) {
					product.setProduct_id(resultSet.getInt(1));
				}
			}

		}
		catch (ClassNotFoundException | SQLException e) {
			log.error(e);
			throw new BusinessException("Internal error occured contact sysadmin");
		}
		return product;
	}

	@Override
	public Product getProductDetails() throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAllProduct() throws BusinessException {
		List<Product> productList=new ArrayList<>();
		try (Connection connection = MySqlDbConnectionClass.getConnection()) {
			String sql="select product_id,product_name, product_price,product_count, product_type from product";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next())
			{
				Product product=new Product();
				product.setProduct_id(resultSet.getInt("product_id"));
				product.setProduct_name(resultSet.getString("product_name"));
				product.setProduct_count(resultSet.getInt("product_count"));
				product.setProduct_price(resultSet.getDouble("product_price"));
				product.setProduct_type(resultSet.getString("product_type"));
				productList.add(product);
			}
		}
		catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal Error occured contact sysadmin");
		}
		if(productList.size()==0)
		{
			return null;
		}
		return productList;
	}

	@Override
	public int addExistingProduct() throws BusinessException {
		// TODO Auto-generated method stub
		return 0;
	}
}
