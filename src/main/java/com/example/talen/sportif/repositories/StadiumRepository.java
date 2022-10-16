package com.example.talen.sportif.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.talen.sportif.models.Stadium;
import com.example.talen.sportif.models.StadiumId;

public interface StadiumRepository extends JpaRepository<Stadium, StadiumId> {

	List<Stadium> findByStadiumFoundation(String stadiumFoundation);
	List<Stadium> findByStadiumName(String stadiumName);
}
