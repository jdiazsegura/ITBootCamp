package com.meli.calculadoram2.services;

import com.meli.calculadoram2.dto.CasaDTO;
import com.meli.calculadoram2.dto.HabitacionDTO;

import java.util.HashMap;

public interface CasaService {

    int CantidadMetrosTotales(CasaDTO casaDTO);

    int ValorTotal(CasaDTO casaDTO);

    HabitacionDTO HabitacionMasGrande(CasaDTO casaDTO);

    HashMap<HabitacionDTO,Integer> MetrosPorHabitacion(CasaDTO casaDTO);
}
