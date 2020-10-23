package com.aneesh.fpl.service;

import java.util.List;
import java.util.Map;

import com.aneesh.fpl.entity.Difficulty;

public interface DifficultyService {
	
    public List<Difficulty> findAll();

    public Difficulty findDifficulty(int id);
    
    public void save(Difficulty difficulty);
    
    public Map<String, Integer> getHomeMap();

    public Map<String, Integer> getAwayMap();

    
}
