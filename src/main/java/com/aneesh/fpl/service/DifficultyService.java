package com.aneesh.fpl.service;

import java.util.List;

import com.aneesh.fpl.entity.Difficulty;

public interface DifficultyService {
	
    public List<Difficulty> findAll();

    public Difficulty findDifficulty(int id);
    
    public void save(Difficulty difficulty);

}
