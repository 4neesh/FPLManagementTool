package com.aneesh.fpl.service;

import java.util.List;

import com.aneesh.fpl.entity.Fixture;

public interface FixtureService {

    public List<Fixture> findAll();

    public Fixture findFixture(int id);
}
