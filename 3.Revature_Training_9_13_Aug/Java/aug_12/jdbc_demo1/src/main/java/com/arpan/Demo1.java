package com.arpan;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection=null;
		
		try {
			//Step1- Load Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded Successfully");
			
			//Step2- Set Connection
			String url="jdbc:mysql://localhost:3306/revature_training";
			String username="arpan";
			String password="arpan";
			connection=DriverManager.getConnection(url, username, password);
			System.out.println("Connection established");
			
			//Step3- Create Statement
			Statement statement=connection.createStatement();
			String sql="select id, name,age, gender, city,sportsName,contact from player";
			
			//Step4- Execute query
			ResultSet resultset=statement.executeQuery(sql);
			System.out.println("Query executed successfully");
			
			//Step5- Process Result
			while(resultset.next())
			{
				System.out.println("ID: "+resultset.getInt("id")+"\tName: "+resultset.getString("name")
						+"\tGender: "+resultset.getString("gender")+"\tAge: "+resultset.getInt("age")
						+"\tCity: "+resultset.getString("city")+"\t\tSports Name: "+resultset.getString("sportsName")
						+"\tContact: "+resultset.getLong("contact"));
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				//Step6- Close Connection
				connection.close();
				System.out.println("Connection Closed");
			} catch (SQLException e) {
				System.out.println(e);
			}
		}
	}

}
