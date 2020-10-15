package com.aneesh.fpl.service;

import java.util.List;
import java.util.Optional;

import com.aneesh.fpl.dao.FixtureRepository;
import com.aneesh.fpl.entity.Fixture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FixtureServiceImpl implements FixtureService {

    private FixtureRepository fixtureRepository;

    @Autowired
    public FixtureServiceImpl(FixtureRepository theFixtureRepository) {
        fixtureRepository = theFixtureRepository;
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
    
    public void save(Fixture fixture) {
    	fixtureRepository.save(fixture);
    }



	@Override
	public void delete(int id) {
fixtureRepository.deleteById(id);		
	}
}
