package com.pgonbo.apirest.controllers.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.pgonbo.apirest.controllers.PokemonController;
import com.pgonbo.apirest.models.Pokemon;

@RestController
public class PokemonControllerImpl implements PokemonController {

    private final RestTemplate restTemplate;

    @Autowired
    public PokemonControllerImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Pokemon getPokemon() {
        String url = "https://pokeapi.co/api/v2/pokemon/ditto";
        Pokemon pokemon = restTemplate.getForObject(url, Pokemon.class);
        return pokemon;
    }

}
