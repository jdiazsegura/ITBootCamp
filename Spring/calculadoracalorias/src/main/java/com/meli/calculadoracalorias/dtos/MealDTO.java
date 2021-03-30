package com.meli.calculadoracalorias.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MealDTO {

    private String name;
    private ArrayList<IngredientDTO> ingredients;

}
