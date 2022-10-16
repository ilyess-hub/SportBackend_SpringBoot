package com.example.talen.sportif.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Player {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PLAYER_ID")
	private Long id;
	private String name;
	private String position;
	private Integer age;
	private Integer nbr;

	@ManyToOne
	@JoinColumn(name = "TEAM_ID", nullable = true)
//	@OnDelete(action = OnDeleteAction.CASCADE)
	private Team team;

	private Player() {
		super();
		// TODO Auto-generated constructor stub
	}

	private Player(Long id, String name, String position, Integer age, Integer nbr) {
		super();
		this.id = id;
		this.name = name;
		this.position = position;
		this.age = age;
		this.nbr = nbr;
	}
	
	

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * @param position the position to set
	 */
	public void setPosition(String position) {
		this.position = position;
	}

	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	/**
	 * @return the nbr
	 */
	public Integer getNbr() {
		return nbr;
	}

	/**
	 * @param nbr the nbr to set
	 */
	public void setNbr(Integer nbr) {
		this.nbr = nbr;
	}

	/**
	 * @return the team
	 */
	public Team getTeam() {
		return team;
	}

	/**
	 * @param team the team to set
	 */
	public void setTeam(Team team) {
		this.team = team;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", position=" + position + ", age=" + age + ", nbr=" + nbr + "]";
	}

}
