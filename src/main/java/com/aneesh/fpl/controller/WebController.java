package com.aneesh.fpl.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
		difficultyService.findAll();
		Map<String, Integer> homeMap = difficultyService.getHomeMap();
		Map<String, Integer> awayMap = difficultyService.getAwayMap();

		model.addAttribute("fixtures", fixturesList);
		model.addAttribute("homeMap", homeMap);
		model.addAttribute("awayMap", awayMap);

		return "fixturePage";
	}
    
    @GetMapping("/updateFixture")
	public String showFormForUpdate(@RequestParam("fixtureId") int id,
									Model model) {
		Fixture fixtureToUpdate = fixtureService.findFixture(id);
		model.addAttribute("fixture", fixtureToUpdate);
		return "updateFixture";
	}
    
    @GetMapping("/add-fixture")
  	public String showFormForAdd(Model model) {
    	Fixture fixture = new Fixture();
  		model.addAttribute("fixture", fixture);
  		return "add-fixture";
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
    
    @GetMapping("/delete-fixture")
    public String deleteFixture(@RequestParam("fixtureId") int id) {
    	System.out.println("delete");
    	fixtureService.delete(id);
		return "redirect:/all-fixtures";

    }
    
    
}
