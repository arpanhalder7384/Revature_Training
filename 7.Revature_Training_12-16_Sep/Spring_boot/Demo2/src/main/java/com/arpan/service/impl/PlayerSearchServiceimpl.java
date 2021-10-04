package com.arpan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arpan.model.Player;
import com.arpan.repository.PlayerRepository;
import com.arpan.service.PlayerSearchService;

@Service
public class PlayerSearchServiceimpl implements PlayerSearchService{

	@Autowired
	private PlayerRepository repository;
	
	@Override
	public List<Player> getAllPlayers() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public List<Player> getPlayerByName(String name) {
		// TODO Auto-generated method stub
		return repository.findByName(name);
	}

	@Override
	public List<Player> getPlayerByAge(int age) {
		// TODO Auto-generated method stub
		return repository.findByAge(age);
	}

	@Override
	public List<Player> getPlayerByTeamName(String teamName) {
		// TODO Auto-generated method stub
		return repository.findByTeamName(teamName);
	}

	@Override
	public List<Player> getPlayerByCity(String city) {
		// TODO Auto-generated method stub
		return repository.findByCity(city);
	}

}
