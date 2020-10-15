package com.aneesh.fpl.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.aneesh.fpl.dao.DifficultyRepository;
import com.aneesh.fpl.entity.Difficulty;

@Service
public class DifficultyServiceImpl implements DifficultyService {

	private DifficultyRepository repository;
	
	public DifficultyServiceImpl(DifficultyRepository repository) {
		this.repository = repository;
	}
	@Override
	public List<Difficulty> findAll() {
		return repository.findAll();
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

		repository.save(difficulty);
	}

}
