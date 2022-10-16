package com.example.talen.sportif.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.talen.sportif.models.Player;
import com.example.talen.sportif.repositories.PlayerRepository;
import com.example.talen.sportif.services.PlayerService;

@Service
public class PlayerServiceImpl implements PlayerService {
	
	@Autowired
	private PlayerRepository playerRepository;
	
	@Override
	public List<Player> getAllPlayers() {
		// TODO Auto-generated method stub
		return playerRepository.findAll();
	}

	@Override
	public Player getPlayerById(Long id) {
		// TODO Auto-generated method stub
		Optional<Player> t = playerRepository.findById(id);
		return t.isPresent() ? t.get() : null;
	}

	@Override
	public void deletePlayer(Long id) {
		// TODO Auto-generated method stub
		playerRepository.deleteById(id);
		
	}

	@Override
	public Player addPlayer(Player p) {
		// TODO Auto-generated method stub
		return playerRepository.save(p);
	}

	@Override
	public Player editPlayer(Player p) {
		// TODO Auto-generated method stub
		return playerRepository.save(p);
	}

	@Override
	public List<Player> findPlayersByTeamId(Long teamId, Pageable pageable) {
		// TODO Auto-generated method stub
		return playerRepository.findPlayersByTeamId(teamId, pageable);
	}
	
	
	
	
}
