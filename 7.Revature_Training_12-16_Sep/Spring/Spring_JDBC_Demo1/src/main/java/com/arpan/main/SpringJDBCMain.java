package com.arpan.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.arpan.dao.PlayerDAO;
import com.arpan.model.Player;

public class SpringJDBCMain {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-jdbc-beans.xml");
		PlayerDAO playerDAO=(PlayerDAO) context.getBean("playerDAO");
//		playerDAO.addPlayer(new Player(110,"Virat Koheli",34,"M","Delhi","Cricket",4785957412L,1));
		List<Player> playerList=playerDAO.getAllPlayers();
		for(Player p:playerList) {
			System.out.println(p);
		}
	}

}
