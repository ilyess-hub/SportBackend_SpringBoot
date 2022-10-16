package com.example.talen.sportif.models;

import java.io.Serializable;

public class StadiumId  implements Serializable{

	private String stadiumName;
	private String stadiumFoundation;

	public StadiumId(String stadiumName, String stadiumFoundation) {
		super();
		this.stadiumName = stadiumName;
		this.stadiumFoundation = stadiumFoundation;
	}

	public StadiumId() {
		super();
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
	
	


}
