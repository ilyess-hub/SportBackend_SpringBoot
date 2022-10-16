package com.example.talen.sportif.controllers;

import java.util.List;
import java.util.Optional;

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

import com.example.talen.sportif.models.Player;
import com.example.talen.sportif.models.Stadium;
import com.example.talen.sportif.models.StadiumId;
import com.example.talen.sportif.models.Team;
import com.example.talen.sportif.repositories.StadiumRepository;
import com.example.talen.sportif.services.PlayerService;
import com.example.talen.sportif.services.TeamService;

@RestController
@RequestMapping("api/players")
@CrossOrigin()
public class PlayerController {

	@Autowired
	private PlayerService playerService;

	@Autowired
	private TeamService teamService;

	
	@GetMapping
	private List<Player> getAllplayers() {

		return playerService.getAllPlayers();
	}

	@GetMapping("/{id}")
	private Player getplayerById(@PathVariable Long id) {
		return playerService.getPlayerById(id);
	}

	@PostMapping("/{teamId}")
	private Player addplayer(@RequestBody Player player, @PathVariable Long teamId) {
		Team findedTeam = teamService.getTeamById(teamId);
		player.setTeam(findedTeam);
		return playerService.addPlayer(player);
	}

	@DeleteMapping("/{id}")
	private void deleteplayer(@PathVariable Long id) {
		playerService.deletePlayer(id);
	}

	@PutMapping("/{id}")
	private Player editplayer(@RequestBody Player player) {
		return playerService.editPlayer(player);
	}

	@GetMapping("/allTeamPlayers/{teamId}")
	private List<Player> getAllTeamPlayers(@PathVariable Long teamId) {
		return playerService.findPlayersByTeamId(teamId, null);
	}
}
