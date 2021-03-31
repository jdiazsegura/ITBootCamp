package com.meli.calculadoram2.dto;

import lombok.*;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CasaDTO {

    private String nombre;
    private String direccion;
    private ArrayList<HabitacionDTO> habitaciones;
}
