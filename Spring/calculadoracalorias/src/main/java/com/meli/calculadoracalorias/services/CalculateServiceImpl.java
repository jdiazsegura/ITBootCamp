package com.meli.calculadoracalorias.services;

import com.meli.calculadoracalorias.dtos.IngredientDTO;
import com.meli.calculadoracalorias.dtos.MealDTO;
import com.meli.calculadoracalorias.repositories.IngredientsRepository;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class CalculateServiceImpl implements CalculateService{

    private IngredientsRepository ingredientsRepository;

    public CalculateServiceImpl(IngredientsRepository ingredientsRepository){
        this.ingredientsRepository = ingredientsRepository;
    }

    @Override
    public MealDTO findTotalCaloriesMeal(MealDTO mealDTO) {
        IngredientDTO breakpoint = new IngredientDTO();
        var totalCalories = 0.0;
        try {
            for (var ingredient : mealDTO.getIngredients()) {
                var flag = ingredientsRepository.findIngredient(ingredient);
                mealDTO.setTotalCalories( totalCalories += flag.getCalories() * flag.getWeight());
            }
        }
        catch(NullPointerException e){
            return mealDTO;
            }
        return mealDTO;
    }

    @Override
    public HashMap<String, Double> findCaloriesByIngredient(MealDTO mealDTO) {
        HashMap<String,Double> caloriesHashMap = new HashMap<>();
        for (var ingredient: mealDTO.getIngredients()) {
            var flag = ingredientsRepository.findIngredient(ingredient);
            caloriesHashMap.put(flag.getName(), flag.getCalories());
        }
        return caloriesHashMap;
    }

    @Override
    public IngredientDTO findMostCaloriesIngredient(MealDTO mealDTO) {
        double mostCalories = 0.0;
        IngredientDTO ingredientFlag = null;
        for (var ingredient: mealDTO.getIngredients()) {
            var flag = ingredientsRepository.findIngredient(ingredient);
            if (flag.getCalories() > mostCalories){
                mostCalories = flag.getCalories();
                ingredientFlag = flag;
            }
        }
        return ingredientFlag;
    }
}
