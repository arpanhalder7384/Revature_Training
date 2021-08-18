package com.arpan.dao;

import java.util.*;

import com.arpan.exception.BusinessException;
import com.arpan.model.Player;

public interface PlayerDAO {
	//DAO: data access Object 
	public List<Player> getAllPlayers() throws BusinessException;
	
	public int createPlayer(Player player) throws BusinessException;
	
	public int updatePlayer(int id,long contact) throws BusinessException;
	
	public int deletePlayer(int id) throws BusinessException;
	
	public Player getDetailsOfOnePlayerById(int id) throws BusinessException;
}
