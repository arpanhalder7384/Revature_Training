package com.arpan.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arpan.model.Player;
import com.arpan.repository.PlayerRepository;
import com.arpan.service.PlayerCURDService;

@Service
public class PlayerCURDServiceImpl implements PlayerCURDService{
	
	@Autowired
	private PlayerRepository repository;

	@Override
	public Player addPlayer(Player player) {
		// TODO Auto-generated method stub
		return repository.save(player);
	}

	@Override
	public Player updatePlayer(Player player) {
		// TODO Auto-generated method stub
		return repository.save(player);
	}

	@Override
	public Player getPlayerById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}

	@Override
	public void deletePlayer(int id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);		
	}

}
