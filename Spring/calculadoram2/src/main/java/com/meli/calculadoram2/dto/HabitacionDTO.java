package com.meli.calculadoram2.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HabitacionDTO {

    private String nombre;
    private int ancho;
    private int largo;

    public int getTamaño(HabitacionDTO habitacionDTO){
        return ancho * largo;
    }
}
