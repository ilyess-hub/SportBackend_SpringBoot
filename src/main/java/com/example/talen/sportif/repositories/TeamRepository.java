package com.example.talen.sportif.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.talen.sportif.models.Team;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {

}
