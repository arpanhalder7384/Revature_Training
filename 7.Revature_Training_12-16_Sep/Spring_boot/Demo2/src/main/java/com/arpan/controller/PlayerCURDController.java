package com.arpan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.arpan.model.Player;
import com.arpan.service.PlayerCURDService;

@RestController
public class PlayerCURDController {
	
	@Autowired
	private PlayerCURDService service;
	
	@PostMapping("/player")
	public Player addPlayer(@RequestBody Player player) {
		return service.addPlayer(player);
	}

	@PutMapping("/player")
	public Player updatePlayer(@RequestBody Player player) {
		return service.updatePlayer(player);
	}
	@GetMapping("/player/{id}")
	public Player getPlayer(@PathVariable int id) {
		return service.getPlayerById(id);
	}

	@DeleteMapping("/player/{id}")
	public void deletePlayer(@PathVariable int id) {
		service.deletePlayer(id);
	}
}
