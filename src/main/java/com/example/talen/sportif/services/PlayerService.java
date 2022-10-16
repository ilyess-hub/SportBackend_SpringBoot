package com.example.talen.sportif.services;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.example.talen.sportif.models.Player;

public interface PlayerService {
	public List<Player> getAllPlayers();

	public Player getPlayerById(Long id);

	public void deletePlayer(Long id);

	public Player addPlayer(Player t);

	public Player editPlayer(Player t);

	public List<Player> findPlayersByTeamId(Long teamId, Pageable pageable);
}
