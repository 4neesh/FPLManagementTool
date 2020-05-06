package com.aneesh.fpl.service;

import com.aneesh.fpl.fixture.Fixture;

import java.util.List;

public interface FixtureService {

    public List<Fixture> findAll();

    public Fixture findTeam(int id);
}
