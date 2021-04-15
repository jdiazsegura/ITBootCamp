package com.meli.desafiospring.repositories;

import com.meli.desafiospring.dtos.ProductDTO;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

public class ProductsRepoImplTest {

    @InjectMocks
    private ProductsRepoImpl productsRepo;

    @BeforeEach
    void inti(){
        List<ProductDTO> mockAllProductsList = new MockProducts().getAllTest();
    }

    @Test
    void findAll()  {
        List<ProductDTO> mockAllProductsList = new MockProducts().loadDatabase("allProducts.json");
        var responseTest = productsRepo.findAll();

        assertNotNull(responseTest);
        assertEquals(mockAllProductsList,responseTest);
    }


    @org.junit.jupiter.api.Test
    void findByCategory() {
        //TODO
    }

    @org.junit.jupiter.api.Test
    void findByProductName() {
    }

    @org.junit.jupiter.api.Test
    void findByBrand() {
    }

    @org.junit.jupiter.api.Test
    void findByPrice() {
    }

    @org.junit.jupiter.api.Test
    void findByFreeShipping() {
    }

    @org.junit.jupiter.api.Test
    void findByPrestige() {
    }

    @org.junit.jupiter.api.Test
    void findById() {
    }

    @org.junit.jupiter.api.Test
    void filterByCategory() {
    }

    @org.junit.jupiter.api.Test
    void filterByFreeShipping() {
    }

    @org.junit.jupiter.api.Test
    void filterByBrand() {
    }

    @org.junit.jupiter.api.Test
    void filterByPrice() {
    }

    @org.junit.jupiter.api.Test
    void filterByPrestige() {
    }

    @org.junit.jupiter.api.Test
    void filterByName() {
    }

    @org.junit.jupiter.api.Test
    void sortAlphAsc() {
    }

    @org.junit.jupiter.api.Test
    void sortAlphDesc() {
    }

    @org.junit.jupiter.api.Test
    void sortByPriceAsc() {
    }

    @org.junit.jupiter.api.Test
    void sortByPriceDesc() {
    }

    @org.junit.jupiter.api.Test
    void normaliceProducts() {
    }

    @org.junit.jupiter.api.Test
    void normalicePayProducts() {
    }

    @org.junit.jupiter.api.Test
    void stockAvailable() {
    }
}