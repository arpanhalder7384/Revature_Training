package com.arpan.main;

import java.util.*;

import com.arpan.model.Player;
import com.arpan.model.Team;
import com.arpan.dao.PlayerDAO;
import com.arpan.dao.TeamDAO;
import com.arpan.dao.PlayerSearchDAO;
import com.arpan.dao.impl.PlayerDAOimplem;
import com.arpan.dao.impl.TeamDAOimplem;
import com.arpan.dao.impl.PlayerSearchDAOImplem;
import com.arpan.exception.BusinessException;

public class TestIng_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TeamDAO teamDAO = new TeamDAOimplem();
		PlayerSearchDAO playersearchDAO=new PlayerSearchDAOImplem();
//		Team t1 = new Team("CSK");
//		
//		try {
//			t1=teamDAO.createTeam(t1);
//			if(t1.getId()!=0) {
//				System.out.println("Team Created successfully with below details");
//				System.out.println(t1);
//			}
//		} catch (BusinessException e) {
//			System.out.println(e);
//		}
		
//		try {
//			List<Team> teamList=teamDAO.getAllTeams();
//			if(teamList!=null && teamList.size()>0) {
//				System.out.println("\n\nTotal we have "+teamList.size()+" no of teams in Team table... Below are the details");
//				for(Team t:teamList) {
//					System.out.println(t);
//				}
//			}
//		} catch (BusinessException e) {
//			System.out.println(e.getMessage());
//		}
		
//		try {
//			List<Team> teamList=teamDAO.getTeamsByName("CSK");
//			if(teamList.size()!=0)
//			{
//				System.out.println("Team Found");
//			}
//			for(Team t:teamList) {
//				System.out.println(t);
//			}
//		} catch (BusinessException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		try {
			Player p=playersearchDAO.getPlayerById(101);
			System.out.println(p);
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
