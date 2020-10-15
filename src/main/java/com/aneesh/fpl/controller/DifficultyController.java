package com.aneesh.fpl.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aneesh.fpl.entity.Difficulty;
import com.aneesh.fpl.service.DifficultyService;

@RestController
public class DifficultyController {

	private DifficultyService service;
	
	public DifficultyController(DifficultyService service) {
		this.service = service;
	}
	
	@PostMapping("/add-difficulty")
	public String addDifficulty(@RequestBody Difficulty difficulty) {
		
		service.save(difficulty);
		return difficulty.toString();
	}
	
	@GetMapping("/get-difficulties")
	public List<Difficulty> getDifficulties(){
		return service.findAll();
	}
}
