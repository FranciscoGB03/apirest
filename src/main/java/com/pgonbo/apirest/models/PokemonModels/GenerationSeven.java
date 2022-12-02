package com.pgonbo.apirest.models.PokemonModels;

import com.fasterxml.jackson.annotation.JsonAlias;

import lombok.Data;

@Data
public class GenerationSeven {
    private Icons icons;
    @JsonAlias("ultra-sun-ultra-moon")
    private UltraSunUltraMoon ultra_sun_ultra_moon;

}
