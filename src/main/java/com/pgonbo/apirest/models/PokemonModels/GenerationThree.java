package com.pgonbo.apirest.models.PokemonModels;

import com.fasterxml.jackson.annotation.JsonAlias;

import lombok.Data;

@Data
public class GenerationThree {
    private Emerald emerald;
    @JsonAlias("firered-leafgreen")
    private FireredLeafGreen fireredLeafGreen;
    @JsonAlias("ruby-sapphire")
    private RubySapphire rubySapphire;

}
