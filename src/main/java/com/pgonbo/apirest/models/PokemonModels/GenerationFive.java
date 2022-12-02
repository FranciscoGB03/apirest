package com.pgonbo.apirest.models.PokemonModels;

import com.fasterxml.jackson.annotation.JsonAlias;

import lombok.Data;

@Data
public class GenerationFive {
    @JsonAlias("black-white")
    private BlackWhite blackWhite;

}
