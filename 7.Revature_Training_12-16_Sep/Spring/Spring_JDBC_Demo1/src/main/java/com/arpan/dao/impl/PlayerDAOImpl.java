package com.arpan.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.arpan.dao.PlayerDAO;
import com.arpan.dao.mapper.PlayerRowMapper;
import com.arpan.model.Player;

public class PlayerDAOImpl implements PlayerDAO{
	
	private JdbcTemplate template;
	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.template=new JdbcTemplate(dataSource);
	}

	@Override
	public Player addPlayer(Player player) {
		String sql="insert into player(id,name,age,city,gender,sportsName,contact,teamId) values (?,?,?,?,?,?,?,?)";
		template.update(sql,player.getId(),player.getName(),player.getAge(),player.getCity(),player.getGender(),player.getSportsName(),player.getContact(),player.getTeamId());
		System.out.println("Player added Successfully");
		return player;
	}

	@Override
	public Player updatePlayer(Player player) {
		return null;
	}

	@Override
	public Player getPlayerById(int id) {
		String sql="select id,name,age,city,gender,sportsName,teamId from player where id=?";
		Player player=template.queryForObject(sql,new Object[] {id},new PlayerRowMapper());
		return player;
	}

	@Override
	public void deletePlayer(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Player> getAllPlayers() {
		// TODO Auto-generated method stub
		String sql="select id,name,age,city,gender,sportsName, contact, teamId from player";
		List<Player> playerList=template.query(sql,new PlayerRowMapper());
		return playerList;
	}

	@Override
	public List<Player> getAllPlayersBySportsname(String sportsName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getAllPlayersByCity(String city) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getAllPlayersByGender(String gender) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getAllPlayersByAge(int age) {
		// TODO Auto-generated method stub
		return null;
	}

}
