package com.meli.getdiploma.controllers;

import com.meli.getdiploma.dtos.DiplomaDTO;
import com.meli.getdiploma.dtos.StudentDTO;
import com.meli.getdiploma.services.DiplomaService;
import com.meli.getdiploma.services.DiplomaServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/diploma")
public class DiplomaController {

    DiplomaService diplomaService = new DiplomaServiceImpl();

    @PostMapping("/newdiploma")
    public DiplomaDTO generateDiploma(@RequestBody StudentDTO studentDTO){
        return diplomaService.generateDiploma(studentDTO);
    }
}
