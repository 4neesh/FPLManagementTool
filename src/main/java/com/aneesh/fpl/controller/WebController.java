package com.aneesh.fpl.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.aneesh.fpl.entity.Difficulty;
import com.aneesh.fpl.entity.Fixture;
import com.aneesh.fpl.service.DifficultyService;
import com.aneesh.fpl.service.FixtureService;

@Controller
public class WebController {

	private FixtureService fixtureService;
	private DifficultyService difficultyService;

	public WebController(FixtureService fixtureService, DifficultyService difficultyService) {
		this.fixtureService = fixtureService;
		this.difficultyService = difficultyService;
	}
	
    @GetMapping("/")
    public String home() {
    	return "home";
    }
    
    @GetMapping("/all-fixtures")
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
    
    @GetMapping("/team-difficulties")
    public String showTeamDifficulties(Model model) {
    	List<Difficulty> difficultyList = difficultyService.findAll();
		
		model.addAttribute("difficultyList", difficultyList);
    	return "difficulty-page";
    }

    
    @PostMapping("/save")
	public String saveEmployee(@ModelAttribute("fixture") Fixture fixture) {
		
		fixtureService.save(fixture);
		return "redirect:/all-fixtures";
		
	}
    
    @DeleteMapping("/deleteFixture")
    public String deleteFixture(@RequestParam("fixtureId") int id) {
    	fixtureService.delete(id);
		return "redirect:/all-fixtures";

    }
}
