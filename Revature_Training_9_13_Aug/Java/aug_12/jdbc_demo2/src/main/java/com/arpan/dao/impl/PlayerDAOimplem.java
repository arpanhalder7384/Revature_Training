package com.arpan.dao.impl;

import java.sql.Connection;
import java.sql.*;
import java.sql.SQLException;
import java.util.*;

import com.arpan.model.Player;
import com.arpan.exception.BusinessException;
import com.arpan.dao.PlayerDAO;  
import com.arpan.dao.dbutil.MySqlDbConnectionClass;

public class PlayerDAOimplem implements PlayerDAO {

	@Override
	public List<Player> getAllPlayers()  throws BusinessException{
		
		List<Player> playerList=new ArrayList<>();
		
		try(Connection connection=MySqlDbConnectionClass.getConnection())
		{
			String sql="select id, name,age, gender, city,sportsName,contact from player";
			PreparedStatement preparedstatement=connection.prepareStatement(sql);
			
			ResultSet resultSet=preparedstatement.executeQuery();
			
			while(resultSet.next()) {
				Player player=new Player();
				player.setId(resultSet.getInt("id"));
				player.setName(resultSet.getString("name"));
				player.setAge(resultSet.getInt("age"));
				player.setCity(resultSet.getString("city"));
				player.setGender(resultSet.getString("gender"));
				player.setContact(resultSet.getLong("contact"));
				player.setSportsName(resultSet.getString("sportsName"));
				playerList.add(player);
//				Player player=new Player(resultSet.getInt("id"),resultSet.getInt("age"),
//						resultSet.getString("name"),resultSet.getString("city"),
//						resultSet.getString("gender"),resultSet.getString("sportsName"),resultSet.getLong("contact"));
				
//				System.out.println("ID: "+resultset.getInt("id")+"\tName: "+resultset.getString("name")
//				+"\tGender: "+resultset.getString("gender")+"\tAge: "+resultset.getInt("age")
//				+"\tCity: "+resultset.getString("city")+"\t\tSports Name: "+resultset.getString("sportsName")
//				+"\tContact: "+resultset.getLong("contact"));
			}
		}
		catch(ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal Error Occured,Please contact support");
		}
		return playerList;
	}

}
