package com.pgonbo.apirest.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pgonbo.apirest.models.Pokemon;

@RequestMapping("/pokemon")
public interface PokemonController {

    @GetMapping()
    public Pokemon getPokemon();

}
