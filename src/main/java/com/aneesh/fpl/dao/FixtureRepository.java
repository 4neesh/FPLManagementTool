package com.aneesh.fpl.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aneesh.fpl.entity.Fixture;

public interface FixtureRepository extends JpaRepository<Fixture, Integer> {

}
