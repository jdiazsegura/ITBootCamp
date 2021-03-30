package com.meli.calculadoracalorias.controllers;

import com.meli.calculadoracalorias.dtos.IngredientDTO;
import com.meli.calculadoracalorias.dtos.MealDTO;
import com.meli.calculadoracalorias.services.CalculateServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;
import java.util.HashMap;

@RestController
@RequestMapping("calculate")
public class CalculateService {

    @Autowired
    private CalculateServiceImpl calculateService;

    @PostMapping("/totalcalories")
    public Double calculate(@RequestBody MealDTO mealDTO) {
        return (calculateService.findTotalCaloriesMeal(mealDTO));
    }

    @PostMapping("/byingredient")
    public HashMap<String,Double> findCaloriesByIngredient(@RequestBody MealDTO mealDTO){
        return (calculateService.findCaloriesByIngredient(mealDTO));
    }

    @PostMapping("/mostcalories")
    public IngredientDTO findMostCaloriesIngredient(@RequestBody MealDTO mealDTO) {
        return (calculateService.findMostCaloriesIngredient(mealDTO));
    }

}
