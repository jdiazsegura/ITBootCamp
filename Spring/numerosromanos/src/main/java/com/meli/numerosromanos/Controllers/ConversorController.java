package com.meli.numerosromanos.Controllers;

import com.meli.numerosromanos.Entity.Conversor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConversorController {

    @GetMapping("/convertir/{numero}")
    public String convertir(@PathVariable(value = "numero") int numero){
        return Conversor.convertirANumerosRomanos(numero);
    }
}
