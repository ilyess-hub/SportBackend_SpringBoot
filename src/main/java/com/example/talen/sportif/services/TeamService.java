package com.example.talen.sportif.services;

import java.util.List;

import com.example.talen.sportif.models.Team;

public interface TeamService {

	public List<Team> getAllTeams();
	
	public Team getTeamById(Long id);
	
	public void deleteTeam(Long id);
	
	public Team addTeam(Team t);
	
	public Team editTeam(Team t);
}
