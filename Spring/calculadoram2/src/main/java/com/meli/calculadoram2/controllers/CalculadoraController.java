package com.meli.calculadoram2.controllers;

import com.meli.calculadoram2.dto.CasaDTO;
import com.meli.calculadoram2.dto.HabitacionDTO;
import com.meli.calculadoram2.services.CasaServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/calcular")
public class CalculadoraController {

    CasaServiceImpl calculateService = new CasaServiceImpl();

    @PostMapping("/metrostotales")
    public int metrosTotales(@RequestBody CasaDTO house){
        return calculateService.CantidadMetrosTotales(house);
    }

    @PostMapping("/valortotal")
    public int valorTotal(@RequestBody CasaDTO casaDTO){
        return calculateService.ValorTotal(casaDTO);
    }

    @PostMapping("/masgrande")
    public HabitacionDTO habitacionMasGrande(@RequestBody CasaDTO casaDTO){
        return calculateService.HabitacionMasGrande(casaDTO);
    }

    @PostMapping("/metroshabitacion")
    public HashMap<HabitacionDTO,Integer> metrosPorHabitacion(@RequestBody CasaDTO casaDTO){
        return calculateService.MetrosPorHabitacion(casaDTO);
    }
}
