package com.example.talen.sportif.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(StadiumId.class)
public class Stadium {

	@Id
	@Column(length = 50)
	private String stadiumName;
	@Id
	@Column(length = 50)
	private String stadiumFoundation;

	private String capacity;

	private Stadium() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Stadium(String stadiumName, String stadiumFoundation, String capacity) {
		super();
		this.stadiumName = stadiumName;
		this.stadiumFoundation = stadiumFoundation;
		this.capacity = capacity;
	}

	/**
	 * @return the stadiumName
	 */
	public String getStadiumName() {
		return stadiumName;
	}

	/**
	 * @param stadiumName the stadiumName to set
	 */
	public void setStadiumName(String stadiumName) {
		this.stadiumName = stadiumName;
	}

	/**
	 * @return the stadiumFoundation
	 */
	public String getStadiumFoundation() {
		return stadiumFoundation;
	}

	/**
	 * @param stadiumFoundation the stadiumFoundation to set
	 */
	public void setStadiumFoundation(String stadiumFoundation) {
		this.stadiumFoundation = stadiumFoundation;
	}

	/**
	 * @return the capacity
	 */
	public String getCapacity() {
		return capacity;
	}

	/**
	 * @param capacity the capacity to set
	 */
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Stadium [stadiumName=" + stadiumName + ", stadiumFoundation=" + stadiumFoundation + ", capacity="
				+ capacity + "]";
	}

}
