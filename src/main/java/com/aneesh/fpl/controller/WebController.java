package com.aneesh.fpl.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    	return "home";
    }
    
    @GetMapping("/allFixtures")
	public String getEmployees(Model model){
		List<Fixture> fixturesList = fixtureService.findAll();
		
		model.addAttribute("fixtures", fixturesList);
		return "fixturePage";
	}
    
    @GetMapping("/updateFixture")
	public String showFormForUpdate(@RequestParam("fixtureId") int id,
									Model model) {
		Fixture fixtureToUpdate = fixtureService.findFixture(id);
		model.addAttribute("fixture", fixtureToUpdate);
		return "updateFixture";
	}

    
    @PostMapping("/save")
	public String saveEmployee(@ModelAttribute("fixture") Fixture fixture) {
		
		fixtureService.save(fixture);
		return "redirect:/allFixtures";
		
	}
}
