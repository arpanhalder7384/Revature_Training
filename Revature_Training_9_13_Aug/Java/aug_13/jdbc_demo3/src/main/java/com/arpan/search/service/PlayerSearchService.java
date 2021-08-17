package com.arpan.search.service;

import java.util.*;

import com.arpan.model.Player;
import com.arpan.exception.BusinessException;

public interface PlayerSearchService 
{
	public Player getPlayerById(int id) throws BusinessException;
	public Player getPlayerByContact(long contact) throws BusinessException;
	public List<Player> getPlayersByName(String name) throws BusinessException;
	public List<Player> getPlayersByTeamName(String teamName) throws BusinessException;
	public List<Player> getPlayersByAge(int age) throws BusinessException;
	public List<Player> getPlayersBySportsName(String sportsName) throws BusinessException;
	public List<Player> getPlayersByCity(String city) throws BusinessException;
	public List<Player> getPlayersByGender(String gender) throws BusinessException;
}
