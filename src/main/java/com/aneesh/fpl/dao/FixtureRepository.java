package com.aneesh.fpl.dao;

import com.aneesh.fpl.fixture.Fixture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FixtureRepository extends JpaRepository<Fixture, Integer> {

}
