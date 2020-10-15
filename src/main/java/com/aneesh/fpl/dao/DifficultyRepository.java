package com.aneesh.fpl.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aneesh.fpl.entity.Difficulty;

public interface DifficultyRepository extends JpaRepository<Difficulty, Integer>{

}
