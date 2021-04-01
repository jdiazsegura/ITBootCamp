package com.meli.linktracker.controllers;

import com.meli.linktracker.dto.ErrorDTO;
import com.meli.linktracker.dto.LinkDTO;
import com.meli.linktracker.dto.ResponseDTO;
import com.meli.linktracker.services.LinkTrackerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.NullPointerException;

import java.net.URISyntaxException;
import java.net.http.HttpHeaders;
import java.util.HashMap;

@RestController
public class LinkTrackerController {

    @Autowired
    private LinkTrackerService linkTrackerService;

    //instanciar un LinkDTO y agregarlo al Hashmap. Validar URL
    @PostMapping("/")
    public ResponseEntity<ResponseDTO> createLink(@RequestBody LinkDTO url){

        return new ResponseEntity<>(linkTrackerService.createLink(url.getUrl()), HttpStatus.OK);
    }

    //Buscar en el hashmap y validar el status el link y hacer toda la logica de redireccion y aumentar el contador
    @GetMapping("/link/{linkId}")
    public ResponseEntity<HttpHeaders> redirectLink(@PathVariable Integer linkId) throws URISyntaxException {
            return new ResponseEntity<>(linkTrackerService.redirectLink(linkId), HttpStatus.SEE_OTHER);
    }

    //Buscar en el hashmap y devolver el contador
    @GetMapping("/metrics/{linkId}")
    public ResponseEntity<LinkDTO> getMetrics(@PathVariable Integer linkId){

        return new ResponseEntity<>(linkTrackerService.getMetrics(linkId), HttpStatus.OK);
    }

    //Buscar en el hashmap y cambiar el status del link
    @PostMapping("/invalidate/{linkId}")
    public ResponseEntity invalidateLink(@PathVariable Integer linkId){
        linkTrackerService.invalidateUrl(linkId);
        return null;
    }

    @GetMapping("/map")
    public ResponseEntity<HashMap> getMap(){
        return new ResponseEntity<HashMap>(linkTrackerService.getRepo(), HttpStatus.OK);
    }

    @ExceptionHandler(value={Exception.class})
    public ResponseEntity<ErrorDTO> notFoundIngredientException(Exception e){
        ErrorDTO errorDTO = new ErrorDTO("Invalid Ingredient", e.getMessage());
        return new ResponseEntity<>(errorDTO, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = {NullPointerException.class})
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String notValidUrl(Exception e){
        return e.getMessage();
    }



}
