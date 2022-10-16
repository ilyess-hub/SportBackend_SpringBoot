package com.example.talen.sportif.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Team {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TEAM_ID")
	private Long id;
	private String name;
	private Long foundation;
	private String stadium;
	
	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Team(Long id, String name, Long foundation, String stadium) {
		super();
		this.id = id;
		this.name = name;
		this.foundation = foundation;
		this.stadium = stadium;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getFoundation() {
		return foundation;
	}

	public void setFoundation(Long foundation) {
		this.foundation = foundation;
	}

	public String getStadium() {
		return stadium;
	}

	public void setStadium(String stadium) {
		this.stadium = stadium;
	}

	@Override
	public String toString() {
		return "Team [id=" + id + ", name=" + name + ", foundation=" + foundation + ", stadium=" + stadium + "]";
	}
	
	
	
	
	
	

}
