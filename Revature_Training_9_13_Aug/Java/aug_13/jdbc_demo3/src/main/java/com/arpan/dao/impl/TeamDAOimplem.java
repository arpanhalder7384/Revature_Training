package com.arpan.dao.impl;

import java.sql.*;
import java.util.*;

import com.arpan.dao.dbutil.MySqlDbConnectionClass;
import com.arpan.model.Team;
import com.arpan.model.Player;
import com.arpan.exception.BusinessException;
import com.arpan.dao.TeamDAO;

public class TeamDAOimplem implements TeamDAO{

	@Override
	public Team createTeam(Team team) throws BusinessException {
		try (Connection connection = MySqlDbConnectionClass.getConnection()) {
			String sql="insert into team(teamName) values(?)";
			PreparedStatement  preparedStatement =connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			preparedStatement.setString(1, team.getTeamName());

			int c=preparedStatement.executeUpdate();
			if(c==1) {
				ResultSet resultSet=preparedStatement.getGeneratedKeys();
				if(resultSet.next()) {
					team.setId(resultSet.getInt(1));
				}
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal Error occured contact sysadmin");
		}

		return team;
	}

	@Override
	public List<Team> getAllTeams() throws BusinessException {
		List<Team> teamList=new ArrayList<>();
		try (Connection connection = MySqlDbConnectionClass.getConnection()) {
			String sql="select id,teamName from team";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				Team team=new Team();
				team.setId(resultSet.getInt("id"));
				team.setTeamName(resultSet.getString("teamName"));
				teamList.add(team);
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal Error occured contact sysadmin");
		}
		return teamList;
	}

	@Override
	public List<Team> getTeamsByName(String teamName) throws BusinessException {
		List<Team> teamList=new ArrayList<>();
		try (Connection connection = MySqlDbConnectionClass.getConnection()) {
			String sql="select id,teamName from team where teamName=?";;
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, teamName);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				Team team=new Team();
				team.setId(resultSet.getInt("id"));
				team.setTeamName(resultSet.getString("teamName"));
				teamList.add(team);
			}

		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal Error occured contact sysadmin");
		}
		return teamList;
	}
}
