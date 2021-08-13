package com.arpan.dao;

import com.arpan.exception.BusinessException;
import java.util.*;

import com.arpan.model.Player;

public interface PlayerDAO {
	//DAO: data access Object 
	public List<Player> getAllPlayers() throws BusinessException;
}
