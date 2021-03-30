package com.meli.starwars.services;

import com.meli.starwars.dtos.CharacterDTO;

import java.util.ArrayList;

public interface FindService {

    ArrayList<CharacterDTO> findCharacter(String name);
}
