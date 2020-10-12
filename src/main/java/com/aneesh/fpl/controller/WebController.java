package com.aneesh.fpl.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.aneesh.fpl.entity.Fixture;
import com.aneesh.fpl.service.FixtureService;

@Controller
public class WebController {

	private FixtureService fixtureService;
	
	public WebController(FixtureService fixtureService) {
		this.fixtureService = fixtureService;
	}
	
    @GetMapping("/")
    public String home() {
    	return "/home";
    }
    
    @GetMapping("/allFixtures")
	public String getEmployees(Model model){
		List<Fixture> fixturesList = fixtureService.findAll();
		
		model.addAttribute("fixtures", fixturesList);
		return "/fixturePage";
	}
}
