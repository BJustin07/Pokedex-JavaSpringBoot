package com.example.pokedexjavaspringboot.controller;

import com.example.pokedexjavaspringboot.service.PokedexService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PokedexController  {

    private final PokedexService pokedexService;
    public PokedexController(PokedexService pokedexService) {
        this.pokedexService = pokedexService;
    }


    @GetMapping("/pokemon/{id}")
    public ResponseEntity<?> getPokemonDetails(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(pokedexService.getPokemonDetails(id));
    }
}
