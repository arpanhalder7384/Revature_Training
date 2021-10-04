package com.arpan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.arpan.model.Player;
import com.arpan.service.PlayerSearchService;

@RestController
public class PlayerSearchController {
	
	@Autowired
	private PlayerSearchService service;
	
	@GetMapping("/players")
	public List<Player> getAllPlayers() {
		// TODO Auto-generated method stub
		return service.getAllPlayers();
	}

	@GetMapping("/players/name/{name}")
	public List<Player> getPlayerByName(@PathVariable String name) {
		// TODO Auto-generated method stub
		return service.getPlayerByName(name);
	}

	@GetMapping("/players/name/{age}")
	public List<Player> getPlayerByAge(@PathVariable int age) {
		// TODO Auto-generated method stub
		return service.getPlayerByAge(age);
	}

	@GetMapping("/players/name/{teamName}")
	public List<Player> getPlayerByTeam(@PathVariable String teamName) {
		// TODO Auto-generated method stub
		return service.getPlayerByTeamName(teamName);
	}

	@GetMapping("/players/name/{city}")
	public List<Player> getPlayerByCity(@PathVariable String city) {
		// TODO Auto-generated method stub
		return service.getPlayerByCity(city);
	}

}
