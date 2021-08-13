package com.Player_main_method;

import java.util.*;

import com.arpan.model.Player;
import com.arpan.dao.PlayerDAO;
import com.arpan.dao.impl.*;
import com.arpan.dao.impl.PlayerDAOimplem;
import com.arpan.exception.BusinessException;
public class PlayerMain {

	public static void main(String[] args) {
		PlayerDAO playerdao=new PlayerDAOimplem();
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
