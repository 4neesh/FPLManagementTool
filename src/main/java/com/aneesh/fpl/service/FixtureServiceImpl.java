package com.aneesh.fpl.service;

import java.util.List;
import java.util.Optional;

import com.aneesh.fpl.dao.FixtureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aneesh.fpl.fixture.Fixture;

@Service
public class FixtureServiceImpl implements FixtureService {

    private FixtureRepository fixtureRepository;

    @Autowired
    public FixtureServiceImpl(FixtureRepository fixtureRepository) {
        fixtureRepository = fixtureRepository;
    }



    @Override
    public List<Fixture> findAll() {

        return fixtureRepository.findAll();
    }

    @Override
    public Fixture findFixture(int id) {

        Optional<Fixture> tempFixture = fixtureRepository.findById(id);
        if(tempFixture.isPresent()){
            return tempFixture.get();
        }
        return null;
    }
}
