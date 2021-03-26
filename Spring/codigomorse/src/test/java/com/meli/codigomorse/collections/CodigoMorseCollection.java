package com.meli.codigomorse.collections;

import com.meli.codigomorse.entity.CodigoMorse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CodigoMorseCollection {

    @GetMapping("/convertir/{cadena}")
    public String convertir(@PathVariable(value="cadena") String cadena){
        var flag = new CodigoMorse();
        return flag.convertir(cadena);
    }
}
