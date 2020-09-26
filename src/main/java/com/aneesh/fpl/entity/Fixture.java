package com.aneesh.fpl.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fixtures")
public class Fixture {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
    private int id;
	
	@Column(name="home")
    private String home;
	
	@Column(name="away")
    private String away;
	
	@Column(name="gameweek")
    private int gameweek;


    public Fixture() {
    }

    public Fixture(int id, String home, String away, int gameWeek) {
        this.id = id;
        this.home = home;
        this.away = away;
        this.gameweek = gameWeek;
    }

    public Fixture(String home, String away, int gameWeek) {
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

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getAway() {
        return away;
    }

    public void setAway(String away) {
        this.away = away;
    }



    public int getGameweek() {
        return gameweek;
    }

    public void setGameweek(int gameweek) {
        this.gameweek = gameweek;
    }

    @Override
    public String toString() {
        return "Fixture{" +
                "id=" + id +
                ", home=" + home +
                ", away=" + away +
                ", gameweek=" + gameweek +
                '}';
    }

}
