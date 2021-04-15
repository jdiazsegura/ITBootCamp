package com.meli.starwars.repositories;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.meli.starwars.dtos.*;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class StarWarsRepoImpl implements StarWarsRepo{

    @Override
    public List<CharacterDTO> findCharacter(String name) {
        List<CharacterDTO> CharacterDTOS = null;
        CharacterDTOS = loadDataBase();
        List<CharacterDTO> result = new ArrayList<>();
        if (CharacterDTOS != null) {
            for (var character : CharacterDTOS) {
                if (character.getName().contains(name)) {
                    result.add(character);
                }
            }
        }
        return result;
    }

    private List<CharacterDTO> loadDataBase() {
        File file = null;
        try {
            file = ResourceUtils.getFile("classpath:starwars.json");
        }catch (Exception e){
            e.printStackTrace();
        }
        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<CharacterDTO>> typeRef = new TypeReference<List<CharacterDTO>>() {};
        List<CharacterDTO> priceDTOS = null;

        try {
            priceDTOS = objectMapper.readValue(file, typeRef);

        }catch (Exception e){
            e.printStackTrace();
        }

        return priceDTOS;
    }
}
