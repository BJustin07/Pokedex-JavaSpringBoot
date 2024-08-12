package com.example.pokedexjavaspringboot.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PokedexService {

    private static final String url = "https://pokeapi.co/api/v2/pokemon/";

    @Autowired
    private RestTemplate restTemplate;

    public Object getPokemonDetails(int id) {
        try{
            ResponseEntity<String> response = restTemplate.getForEntity(url + id, String.class);
            return response.getBody();
        }
        catch(Exception e){
            System.out.println("Sometthing went wrong");
        }
        return null;
    }
}
