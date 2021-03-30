package com.meli.starwars.controllers;

import com.meli.starwars.dtos.CharacterDTO;
import com.meli.starwars.services.FindService;
import com.meli.starwars.services.FindServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/starwars")
public class FindController {

    @Autowired
    private FindService findService;

    @PostMapping("/charsbyname")
    public ArrayList<CharacterDTO> findCharacter(@RequestBody CharacterDTO characterDTO) {
        return findService.findCharacter(characterDTO.getName());
    }
}
