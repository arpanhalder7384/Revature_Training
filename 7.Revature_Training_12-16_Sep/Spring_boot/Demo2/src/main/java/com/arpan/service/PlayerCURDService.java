package com.arpan.service;

import com.arpan.model.Player;

public interface PlayerCURDService {
	Player addPlayer(Player player);
	Player updatePlayer(Player player);
	Player getPlayerById(int id);
	void deletePlayer(int id);
}
