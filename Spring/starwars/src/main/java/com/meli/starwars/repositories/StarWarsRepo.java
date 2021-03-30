package com.meli.starwars.repositories;

import com.meli.starwars.dtos.CharacterDTO;

import java.util.List;

public interface StarWarsRepo {

    List<CharacterDTO> findCharacter(String name);
}
