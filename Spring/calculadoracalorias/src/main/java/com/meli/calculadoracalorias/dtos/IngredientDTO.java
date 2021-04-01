package com.meli.calculadoracalorias.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IngredientDTO {

    private String name;
    private Double weight;
    private Double calories;
}
