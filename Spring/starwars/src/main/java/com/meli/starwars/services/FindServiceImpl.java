package com.meli.starwars.services;

import com.meli.starwars.dtos.CharacterDTO;
import com.meli.starwars.repositories.StarWarsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class FindServiceImpl implements FindService{

    @Autowired
    private StarWarsRepo starWarsRepo;

    public FindServiceImpl(StarWarsRepo starWarsRepo) {
        this.starWarsRepo = starWarsRepo;
    }

    @Override
    public ArrayList<CharacterDTO> findCharacter(String name) {
        var flag = starWarsRepo.findCharacter(name);
        return (ArrayList<CharacterDTO>) flag;
    }
}
