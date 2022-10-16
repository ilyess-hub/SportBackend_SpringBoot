package com.example.talen.sportif.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.talen.sportif.models.Stadium;
import com.example.talen.sportif.models.Team;
import com.example.talen.sportif.repositories.StadiumRepository;
import com.example.talen.sportif.services.TeamService;

@RestController
@RequestMapping("api/teams")
@CrossOrigin(origins = "*")
public class TeamController {

	@Autowired
	private TeamService teamService;
	

	
	@GetMapping
	private List<Team> getAllTeams(){
		
		return teamService.getAllTeams();
	}
	
	@GetMapping("/{id}")
	private Team getTeamById(@PathVariable Long id){
		return teamService.getTeamById(id);
	}
	
	@PostMapping
	private Team addTeam(@RequestBody Team team) {
		return teamService.addTeam(team);
	}
	
	
	@DeleteMapping("/{id}")
	private void deleteTeam(@PathVariable Long id) {
		teamService.deleteTeam(id);
	}
	
	@PutMapping("/{id}")
	private Team editTeam(@RequestBody Team team) {
		return teamService.editTeam(team);
	}
}
