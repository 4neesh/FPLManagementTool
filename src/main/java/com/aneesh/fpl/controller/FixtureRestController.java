package com.aneesh.fpl.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aneesh.fpl.entity.Fixture;
import com.aneesh.fpl.service.FixtureService;

@RestController
public class FixtureRestController {

    private FixtureService fixtureService;

    public FixtureRestController(FixtureService theFixtureService){
        fixtureService = theFixtureService;
    }

    private List<Fixture> fixtures;


    @GetMapping("/getFixture/{id}")
    public Fixture getFixture(@PathVariable int id ) {
    	return fixtureService.findFixture(id);
    }

    @GetMapping("/getFixtures")
    public List<Fixture> getFixures(){
        fixtures = fixtureService.findAll();
        return fixtures;
    }
    
    @PostMapping("/addFixture")
    public String addFixture(@RequestBody Fixture fixture) {
    	fixtureService.save(fixture);
    	return fixture.toString();
    }
}
