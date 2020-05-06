package com.aneesh.fpl.controller;


import com.aneesh.fpl.fixture.Fixture;
import com.aneesh.fpl.service.FixtureService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class ManagerController {

    private FixtureService fixtureService;

    public ManagerController(FixtureService fixtureService){
        this.fixtureService = fixtureService;
    }

    @GetMapping("/fixtures")
    public String getFixturePage(Model model){

        List<Fixture> fixtureList = fixtureService.findAll();
        model.addAttribute("fixture", fixtureList);
        System.out.println(fixtureList);
        return "fixturePage";
    }

}
