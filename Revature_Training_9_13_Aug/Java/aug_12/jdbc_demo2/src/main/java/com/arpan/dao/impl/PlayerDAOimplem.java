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

	@Override
	public int createPlayer(Player player) throws BusinessException {
		int c=0;
		try(Connection connection=MySqlDbConnectionClass.getConnection()){
			String sql="insert into player(id,name,age,gender,city, sportsName,contact) values(?,?,?,?,?,?,?)";
			PreparedStatement preparedstatement=connection.prepareStatement(sql);
			preparedstatement.setInt(1, player.getId());
			preparedstatement.setString(2,player.getName());
			preparedstatement.setInt(3, player.getAge());
			preparedstatement.setString(4, player.getGender());
			preparedstatement.setString(5, player.getCity());
			preparedstatement.setString(6,player.getSportsName());
			preparedstatement.setDouble(7, player.getContact());
			
			c=preparedstatement.executeUpdate();
		}
		catch(ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal Error Occured,Please contact support");
		}
		return c;
	}

	@Override
	public int updatePlayer(int id, long contact) throws BusinessException {
		int c=0;
		try(Connection connection=MySqlDbConnectionClass.getConnection()){
			String sql="update player set contact=? where id=?";
			PreparedStatement preparedstatement=connection.prepareStatement(sql);
			preparedstatement.setLong(1, contact);
			preparedstatement.setInt(2, id);
			c=preparedstatement.executeUpdate();
		}
		catch(ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal Error Occured,Please contact support");
		}
		return c;
	}

	@Override
	public int deletePlayer(int id) throws BusinessException {
		int c=0;
		try(Connection connection=MySqlDbConnectionClass.getConnection()){
			String sql="delete from player where id=?";
			PreparedStatement preparedstatement=connection.prepareStatement(sql);
			preparedstatement.setInt(1, id);
			c=preparedstatement.executeUpdate();
		}
		catch(ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal Error Occured,Please contact support");
		}
		return c;
	}

	@Override
	public Player getDetailsOfOnePlayerById(int id) throws BusinessException {
		Player player=new Player();
		try(Connection connection=MySqlDbConnectionClass.getConnection())
		{
			String sql="select id, name,age, gender, city,sportsName,contact from player where id=?";
			PreparedStatement preparedstatement=connection.prepareStatement(sql);
			preparedstatement.setInt(1, id);

			ResultSet resultSet=preparedstatement.executeQuery();
			resultSet.next();
			player.setId(resultSet.getInt("id"));
			player.setName(resultSet.getString("name"));
			player.setAge(resultSet.getInt("age"));
			player.setCity(resultSet.getString("city"));
			player.setGender(resultSet.getString("gender"));
			player.setContact(resultSet.getLong("contact"));
			player.setSportsName(resultSet.getString("sportsName"));
		}

		catch(ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal Error Occured,Please contact support");
		}
		return player;

	}

}
