package com.arpan_main;

import java.util.*;

import com.arpan.model.Player;
import com.arpan.dao.PlayerDAO;
import com.arpan.dao.impl.*;
import com.arpan.dao.impl.PlayerDAOimplem;
import com.arpan.exception.BusinessException;

public class PlayerMain {

	public static void main(String[] args) {
		PlayerDAO playerdao=new PlayerDAOimplem();
		
		System.out.println("\nPlayer List:");
		try {
			List<Player> playerList=playerdao.getAllPlayers();
			for(Player player:playerList) {
				System.out.println(player);
			}
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("\nCode to insert 1 new player in database:");
		try {
			Player player=new Player(101,"Virat", 35, "M","Delhi","Cricket",1230456789);
			if(playerdao.createPlayer(player)==1)
			{
				System.out.println("Player with below details is inserted");
				
			}
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("\nPlayer List:");
		try {
			List<Player> playerList=playerdao.getAllPlayers();
			for(Player player:playerList) {
				System.out.println(player);
			}
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
		
		Player player1=new Player();
		try {
			player1=playerdao.getDetailsOfOnePlayerById(101);
			System.out.println(player1);
		}catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("\nCode to delete of a player details:");
		try {
			System.out.println("Details ");
			if(playerdao.deletePlayer(101)==1) {
				System.out.println("Deletails of Player with id=101 is deteted.");
			}
		}
		catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("\nCode to update contact details of a player:");
		try {
			if(playerdao.updatePlayer(100,1234567890)==1) {
				System.out.println("Update Succesfully");
			}
		}
		catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("\nPlayer List:");
		try {
			List<Player> playerList=playerdao.getAllPlayers();
			for(Player player:playerList) {
				System.out.println(player);
			}
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
