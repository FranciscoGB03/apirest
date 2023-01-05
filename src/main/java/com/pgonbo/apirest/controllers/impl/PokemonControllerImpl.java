package com.pgonbo.apirest.controllers.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.pgonbo.apirest.controllers.PokemonController;
import com.pgonbo.apirest.models.Pokemon;

@RestController
public class PokemonControllerImpl implements PokemonController {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public Pokemon getPokemon() {
        String url = "https://pokeapi.co/api/v2/pokemon/ditto";
        Pokemon pokemon = restTemplate.getForObject(url, Pokemon.class);
        return pokemon;
        // Otra alternativa con Object
        // Object object=restTemplate.getForObject(url, Object.class);
        // return object;
    }
}
