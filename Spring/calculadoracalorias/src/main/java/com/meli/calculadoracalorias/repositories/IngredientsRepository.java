package com.meli.calculadoracalorias.repositories;

import com.meli.calculadoracalorias.dtos.IngredientDTO;

public interface IngredientsRepository {

    IngredientDTO findIngredient(IngredientDTO ingredientDTO);
}
