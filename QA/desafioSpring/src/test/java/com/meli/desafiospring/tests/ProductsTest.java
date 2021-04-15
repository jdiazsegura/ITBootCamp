package com.meli.desafiospring.tests;

import com.meli.desafiospring.dtos.ProductDTO;
import com.meli.desafiospring.exceptions.CategoryNotFoundException;
import com.meli.desafiospring.exceptions.ProductNotFoundException;
import com.meli.desafiospring.repositories.MockProducts;
import com.meli.desafiospring.repositories.ProductsRepo;
import com.meli.desafiospring.services.ProductServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
@EnableWebMvc
public class ProductsTest {

    @Mock
    private ProductsRepo productsRepo;

    @InjectMocks
    private ProductServiceImpl productService;



    @Test
    public void shouldGetAllProducts() throws CategoryNotFoundException, ProductNotFoundException {
        List<ProductDTO> mockAllProductList = new MockProducts().getAllTest();

        when(productsRepo.findAll()).thenReturn(mockAllProductList);
        var responseTest = productService.getMethod(new HashMap<>());

        assertNotNull(responseTest);
        assertEquals(4,responseTest.size());
    }

    @Test
    public void shouldGetAllProductsByCategories() throws CategoryNotFoundException, ProductNotFoundException {

        List<ProductDTO> mockByCategoryList = new MockProducts().getByCategoryTest();

        when(productsRepo.filterByCategory(any(),any())).thenReturn(mockByCategoryList);
        var mockHashMap = new HashMap<String,String>();
        mockHashMap.put("category","Herramientas");

        var responseTest = productService.getMethod(mockHashMap);
        assertEquals(responseTest,mockByCategoryList);
    }

}
