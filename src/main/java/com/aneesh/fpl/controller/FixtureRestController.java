package com.aneesh.fpl.controller;

import com.aneesh.fpl.fixture.Fixture;
import com.aneesh.fpl.service.FixtureService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FixtureRestController {

    private FixtureService fixtureService;

    public FixtureRestController(FixtureService theFixtureService){
        fixtureService = theFixtureService;
    }

    private List<Fixture> fixtures;

    @GetMapping("/test")
    public String sayHi(){
        return "HELLO";
    }

    @GetMapping("/fixtureRest")
    public List<Fixture> getFixures(){
        fixtures = fixtureService.findAll();
        return fixtures;
    }
}
