package com.meli.calculadoracalorias.controllers;

import com.meli.calculadoracalorias.dtos.IngredientDTO;
import com.meli.calculadoracalorias.dtos.MealDTO;
import com.meli.calculadoracalorias.services.CalculateServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.HashMap;

@RestController
@RequestMapping("calculate")
public class CalculateController {

    @Autowired
    private CalculateServiceImpl calculateService;

    @PostMapping("/totalcalories")
    public ResponseEntity<MealDTO> calculate(@RequestBody MealDTO mealDTO) {
        MealDTO flag = new MealDTO();
        var flag2 = new IngredientDTO();
        try {
            flag = calculateService.findTotalCaloriesMeal(mealDTO);
            for (var ingredient : mealDTO.getIngredients()) {
                if (ingredient.getCalories() == null) {
                    throw new NullPointerException();
                }
            }
            return new ResponseEntity<>(flag, HttpStatus.OK);
        } catch (NullPointerException e) {
            return new ResponseEntity<>(flag,HttpStatus.NOT_FOUND);

        }
    }

    @PostMapping("/byingredient")
    public HashMap<String, Double> findCaloriesByIngredient(@RequestBody MealDTO mealDTO) {
        return (calculateService.findCaloriesByIngredient(mealDTO));
    }

    @PostMapping("/mostcalories")
    public IngredientDTO findMostCaloriesIngredient(@RequestBody MealDTO mealDTO) {
        IngredientDTO flag = null;
        try {
            flag = calculateService.findMostCaloriesIngredient(mealDTO);
            return flag;
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        return flag;
    }

}
