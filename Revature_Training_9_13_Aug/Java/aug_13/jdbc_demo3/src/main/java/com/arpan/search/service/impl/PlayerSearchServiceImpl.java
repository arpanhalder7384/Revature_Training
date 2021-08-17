package com.arpan.search.service.impl;

import java.util.*;

import com.arpan.model.Player;
import com.arpan.exception.BusinessException;
import com.arpan.search.service.PlayerSearchService;

public class PlayerSearchServiceImpl implements PlayerSearchService{

	@Override
	public Player getPlayerById(int id) throws BusinessException {
		Player player=null;
		if(id<100 || id>1000)
		{
			throw new BusinessException("Invalid Player id: "+id);
		}
		else {
			
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getPlayersByTeamName(String teamName) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
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
