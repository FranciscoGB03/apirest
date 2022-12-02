package com.pgonbo.apirest.models.PokemonModels;

import com.fasterxml.jackson.annotation.JsonAlias;

import lombok.Data;

@Data
public class GenerationOne {
    @JsonAlias("red-blue")
    private RedBlue redblue;
    private Yellow yellow;

}
