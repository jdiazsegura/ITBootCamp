package com.meli.desafiospring.repositories;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.meli.desafiospring.dtos.ProductDTO;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MockProducts {

    ProductDTO product0 = new ProductDTO(1,"Desmalezadora","Herramientas","Makita",9600,
            5,true,4);
    ProductDTO product1 = new ProductDTO(2,"Taladro","Decoracion","Black & Decker",12500,
            7,true,4);
    ProductDTO product2 = new ProductDTO(3,"Pasta","Comida","Muñeca",7215,
            10,true,3);
    ProductDTO product3 = new ProductDTO(4,"Zapatillas Deportivas","Deportes","Nike",14000,
            4,true,4);

    public List<ProductDTO> getAllTest(){
        List<ProductDTO> products = new ArrayList<>();
        products.add(product0);
        products.add(product1);
        products.add(product2);
        products.add(product3);
        return products;
    }

    public List<ProductDTO> getByCategoryTest(){
        List<ProductDTO> products = new ArrayList<>();
        products.add(product0);
        products.add(product0);
        return products;
    }

    public List<ProductDTO> loadDatabase(String name){
            File file = null;
            try {
                file = ResourceUtils.getFile("classpath:"+name);
            }catch (Exception e){
                e.printStackTrace();
            }
            ObjectMapper objectMapper = new ObjectMapper();
            TypeReference<List<ProductDTO>> typeRef = new TypeReference<List<ProductDTO>>() {};
            List<ProductDTO> priceDTOS = null;

            try {
                priceDTOS = objectMapper.readValue(file, typeRef);
            }catch (Exception e){
                e.printStackTrace();
            }

            return priceDTOS;
        }
    }
