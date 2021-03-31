package com.meli.calculadoram2.services;

import com.meli.calculadoram2.dto.*;

import java.util.HashMap;

public class CasaServiceImpl implements CasaService{

    @Override
    public int CantidadMetrosTotales(CasaDTO casaDTO) {
        int total = 0;
        for (var habitacion: casaDTO.getHabitaciones()) {
            var totalHabitacion = habitacion.getAncho() * habitacion.getLargo();
            total += totalHabitacion;
        }
        return total;
    }

    @Override
    public int ValorTotal(CasaDTO casaDTO) {
        return CantidadMetrosTotales(casaDTO) * 800;
    }

    @Override
    public HabitacionDTO HabitacionMasGrande(CasaDTO casaDTO) {
        HabitacionDTO flag = new HabitacionDTO();
        var flag2 = MetrosPorHabitacion(casaDTO);
        var max = 0;
        for(var entry:flag2.entrySet()){
            if(entry.getValue() > max){
                flag = entry.getKey();
                max = entry.getValue();
            }
        }
        return flag;
    }

    @Override
    public HashMap<HabitacionDTO, Integer> MetrosPorHabitacion(CasaDTO casaDTO) {
        var flag = new HashMap<HabitacionDTO,Integer>();
        for (var habitacion:casaDTO.getHabitaciones()){
            flag.put(habitacion,habitacion.getTamaño(habitacion));
        }
        return flag;
    }

}
