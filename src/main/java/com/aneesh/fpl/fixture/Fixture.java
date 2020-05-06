package com.aneesh.fpl.fixture;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.aneesh.fpl.team.Team;

@Entity
@Table(name = "fpl_fixtures")
public class Fixture {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
    private int id;
	
	@Column(name="home")
    private Team home;
	
	@Column(name="away")
    private Team away;
	
	@Column(name="gameweek")
    private int gameweek;



    public Fixture(int id, Team home, Team away, int gameWeek) {
        this.id = id;
        this.home = home;
        this.away = away;
        this.gameweek = gameWeek;
    }

    public Fixture(Team home, Team away, int gameWeek) {
        this.home = home;
        this.away = away;
        this.gameweek = gameWeek;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Team getHome() {
        return home;
    }

    public void setHome(Team home) {
        this.home = home;
    }

    public Team getAway() {
        return away;
    }

    public void setAway(Team away) {
        this.away = away;
    }

    public int getGameweek() {
        return gameweek;
    }

    public void setGameweek(int gameweek) {
        this.gameweek = gameweek;
    }
}
