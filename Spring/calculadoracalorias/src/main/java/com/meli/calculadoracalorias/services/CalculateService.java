package com.meli.calculadoracalorias.services;

import com.meli.calculadoracalorias.dtos.IngredientDTO;
import com.meli.calculadoracalorias.dtos.MealDTO;

import java.util.HashMap;

public interface CalculateService {

    Object findTotalCaloriesMeal(MealDTO mealDTO);

    HashMap<String, Double> findCaloriesByIngredient(MealDTO mealDTO);

    IngredientDTO findMostCaloriesIngredient(MealDTO mealDTO);
}
