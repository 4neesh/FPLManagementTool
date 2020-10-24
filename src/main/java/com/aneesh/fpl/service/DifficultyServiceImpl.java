package com.aneesh.fpl.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aneesh.fpl.dao.DifficultyRepository;
import com.aneesh.fpl.entity.Difficulty;

@Service
public class DifficultyServiceImpl implements DifficultyService {

	private DifficultyRepository repository;
	
	private static Map<String, Integer> homeMap = new HashMap<>();
	private static Map<String, Integer> awayMap = new HashMap<>();

	@Autowired
	public DifficultyServiceImpl(DifficultyRepository repository) {
		this.repository = repository;
	}
	
	@Override
	public List<Difficulty> findAll() {
		
		List<Difficulty> difficultyList = repository.findAll();
		for(Difficulty d : difficultyList) {
			homeMap.put(d.getTeam(),d.getHome());
			awayMap.put(d.getTeam(),d.getAway());

		}
		
		return difficultyList;
	}

	@Override
	public Difficulty findDifficulty(int id) {
		Optional<Difficulty> difficulty = repository.findById(id);
		if(difficulty.isPresent()) {
			return difficulty.get();
		}
		return null;
	}

	@Override
	public void save(Difficulty difficulty) {
		
		if(!homeMap.containsKey(difficulty.getTeam())) {
			homeMap.put(difficulty.getTeam(), difficulty.getHome());
		}
		if(!awayMap.containsKey(difficulty.getTeam())) {
			awayMap.put(difficulty.getTeam(), difficulty.getAway());
		}
		
		
		repository.save(difficulty);
	}
	@Override
	public Map<String, Integer> getHomeMap() {
		return homeMap;
	}
	@Override
	public Map<String, Integer> getAwayMap() {
		return awayMap;
	}

}
