package com.arpan.service;

import java.util.List;

import com.arpan.model.Player;

public interface PlayerSearchService {
	List<Player> getAllPlayers();
	List<Player> getPlayerByName(String name);
	List<Player> getPlayerByAge(int age);
	List<Player> getPlayerByTeamName(String teamName);
	List<Player> getPlayerByCity(String city);
}
