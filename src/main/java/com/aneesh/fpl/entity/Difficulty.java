package com.aneesh.fpl.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="team_difficulty")
public class Difficulty {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
    private int id;
	

	@Column(name="Team")
	private String team;
	
	@Column(name="Home")
	private int home;
	

	@Column(name="Away")
	private int away;


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		this.team = team;
	}


	public int getHome() {
		return home;
	}


	public void setHome(int home) {
		this.home = home;
	}


	public int getAway() {
		return away;
	}


	public void setAway(int away) {
		this.away = away;
	}


	public int getId() {
		return id;
	}


	@Override
	public String toString() {
		return "Difficulty [id=" + id + ", team=" + team + ", home=" + home + ", away=" + away + "]";
	}
	
}
