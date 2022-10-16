package com.example.talen.sportif.repositories;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.talen.sportif.models.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
	List<Player> findByTeamId(Integer teamId);

	@Query("SELECT p FROM Player p WHERE p.name=:pName")
	List<Player> findPlayerWithName(String pName);
	
	List<Player> findPlayersByTeamId(Long teamId, Pageable pageable);
}
