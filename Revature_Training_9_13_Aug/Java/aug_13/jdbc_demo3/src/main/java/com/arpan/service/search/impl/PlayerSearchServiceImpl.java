package com.arpan.service.search.impl;

import java.util.*;

import com.arpan.exception.BusinessException;
import com.arpan.model.Player;
import com.arpan.service.search.PlayerSearchService;
import com.arpan.dao.PlayerSearchDAO;
import com.arpan.dao.impl.PlayerSearchDAOImplem;

public class PlayerSearchServiceImpl implements PlayerSearchService{
	private PlayerSearchDAO playersearchDAO=new PlayerSearchDAOImplem();
	@Override
	public Player getPlayerById(int id) throws BusinessException {
		Player player=null;
		if(id<100 || id>1000)
		{
			throw new BusinessException("Invalid Player id: "+id);
		}
		else {
			player=playersearchDAO.getPlayerById(id);			
		}
		return player;
	}

	@Override
	public Player getPlayerByContact(long contact) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getPlayersByName(String name) throws BusinessException {
		return null;
	}

	@Override
	public List<Player> getPlayersByTeamName(String teamName) throws BusinessException {
		List<Player> playerList=null;
		if(teamName.matches("[a-zA-Z]{2,10}")) {
			//code here to DAO
			playerList=playersearchDAO.getPlayersByTeamName(teamName);
		}else {
			throw new BusinessException("Invalid team name : "+teamName);
		}
		return playerList;
	}

	@Override
	public List<Player> getPlayersByAge(int age) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getPlayersBySportsName(String sportsName) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getPlayersByCity(String city) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getPlayersByGender(String gender) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

}
