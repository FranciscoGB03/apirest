package com.pgonbo.apirest.models.PokemonModels;

import com.fasterxml.jackson.annotation.JsonAlias;

import lombok.Data;

@Data
public class GenerationSix {
    @JsonAlias("omegaruby-alphasapphire")
    private OmegaRuby omegaruby_alphasapphire;
    @JsonAlias("x-y")
    private XY x_y;
}
