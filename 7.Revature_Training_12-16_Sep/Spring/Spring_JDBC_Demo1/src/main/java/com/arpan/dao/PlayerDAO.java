package com.arpan.dao;

import java.util.List;

import com.arpan.model.Player;

public interface PlayerDAO {
	Player addPlayer(Player player);
	Player updatePlayer(Player player);
	Player getPlayerById(int id);
	void deletePlayer(int id);
	List<Player> getAllPlayers();
	List<Player> getAllPlayersBySportsname(String sportsName);
	List<Player> getAllPlayersByCity(String city);
	List<Player> getAllPlayersByGender(String gender);
	List<Player> getAllPlayersByAge(int age);
}
