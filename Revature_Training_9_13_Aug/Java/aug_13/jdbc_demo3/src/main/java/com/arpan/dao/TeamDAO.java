package com.arpan.dao;

import java.util.*;

import com.arpan.model.Team;
import com.arpan.exception.BusinessException;

public interface TeamDAO {
	public Team createTeam(Team team) throws BusinessException;
	public List<Team> getAllTeams() throws BusinessException;
	public List<Team> getTeamsByName(String teanName) throws BusinessException;
}
