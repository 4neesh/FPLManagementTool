package com.aneesh.fpl.controller;


import com.aneesh.fpl.service.FixtureService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ManagerController {

    private FixtureService fixtureService;

    public ManagerController(FixtureService fixtureService){
        this.fixtureService = fixtureService;
    }

    @GetMapping("/fixtures")
    public String getFixturePage(){

        return "fixturePage";
    }

}
