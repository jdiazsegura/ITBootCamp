package com.meli.calculadoracalorias.repositories;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.meli.calculadoracalorias.dtos.IngredientDTO;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.util.List;
import java.util.Optional;


@Repository
public class IngredientsRepositoryImpl implements IngredientsRepository {

    @Override
    public IngredientDTO findIngredient(IngredientDTO ingredientDTO) {
        List<IngredientDTO> ingredientDTOS = null;
        ingredientDTOS = loadDataBase();
        IngredientDTO result = ingredientDTO;
        if (ingredientDTOS != null) {
            Optional<IngredientDTO> item = ingredientDTOS.stream()
                    .filter(ingredientDTO2 -> ingredientDTO.getName().equals(ingredientDTO2.getName()))
                    .findFirst();
            item.ifPresent(dto -> result.setCalories(dto.getCalories()));
        }
        return result;
    }

    private List<IngredientDTO> loadDataBase() {
        File file = null;
        try {
            file = ResourceUtils.getFile("classpath:food.json");
        } catch (Exception e) {
            e.printStackTrace();
        }
        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<IngredientDTO>> typeRef = new TypeReference<List<IngredientDTO>>() {
        };
        List<IngredientDTO> priceDTOS = null;

        try {
            priceDTOS = objectMapper.readValue(file, typeRef);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return priceDTOS;
    }
}
