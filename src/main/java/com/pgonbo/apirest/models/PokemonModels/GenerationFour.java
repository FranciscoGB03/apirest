package com.pgonbo.apirest.models.PokemonModels;

import com.fasterxml.jackson.annotation.JsonAlias;

import lombok.Data;

@Data
public class GenerationFour {
    @JsonAlias("diamond-pearl")
    private DiamondPearl diamondPearl;
    @JsonAlias("heartgold-soulsilver")
    private HeartGoldSoulSilver heartGoldSoulSilver;

    private Platinum platinum;

}
