package com.example.talen.sportif.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.talen.sportif.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	Boolean existsByEmail(String email);
	Optional<User> findByEmail(String email);
}
