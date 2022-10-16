package com.example.talen.sportif.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.talen.sportif.models.Team;
import com.example.talen.sportif.repositories.TeamRepository;
import com.example.talen.sportif.services.TeamService;

@Service
public class TeamServiceImpl implements TeamService {

	@Autowired
	private TeamRepository teamRepo;
	
	@Override
	public List<Team> getAllTeams() {
		// TODO Auto-generated method stub
		return teamRepo.findAll();
	}

	@Override
	public Team getTeamById(Long id) {
		// TODO Auto-generated method stub
		Optional<Team> t = teamRepo.findById(id);
		return t.isPresent() ? t.get() : null;
	}

	@Override
	public void deleteTeam(Long id) {
		// TODO Auto-generated method stub
		teamRepo.deleteById(id);
		
	}

	@Override
	public Team addTeam(Team t) {
		// TODO Auto-generated method stub
		return teamRepo.save(t);
	}

	@Override
	public Team editTeam(Team t) {
		// TODO Auto-generated method stub
		return teamRepo.save(t);
	}

}
