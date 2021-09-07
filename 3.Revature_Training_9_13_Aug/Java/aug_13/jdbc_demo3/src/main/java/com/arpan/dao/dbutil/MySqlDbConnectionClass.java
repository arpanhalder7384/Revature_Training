package com.arpan.dao.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlDbConnectionClass {
	
	private MySqlDbConnectionClass() {
		
	}
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException{
		Connection connection=null;
		
		//Step1- Load Driver
//		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
//			System.out.println("Driver Loaded Successfully");
//		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		try {
			//Step2- Set Connection
			String url="jdbc:mysql://localhost:3306/revature_training";
			String username="arpan";
			String password="arpan";
			connection=DriverManager.getConnection(url, username, password);
//			System.out.println("Connection established");
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		return connection;
	}
}
