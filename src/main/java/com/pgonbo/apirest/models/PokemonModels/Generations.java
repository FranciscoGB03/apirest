package com.pgonbo.apirest.models.PokemonModels;

import com.fasterxml.jackson.annotation.JsonAlias;

import lombok.Data;

@Data
public class Generations {
    @JsonAlias("generation-i")
    private GenerationOne generation_i;
    @JsonAlias("generation-ii")
    private GenerationTwo generation_ii;
    @JsonAlias("generation-iii")
    private GenerationThree generation_iii;
    @JsonAlias("generation-iv")
    private GenerationFour generation_iv;
    @JsonAlias("generation-v")
    private GenerationFive generation_v;
    @JsonAlias("generation-vi")
    private GenerationSix generation_vi;
    @JsonAlias("generation-vii")
    private GenerationSeven generation_vii;
    @JsonAlias("generation-viii")
    private GenerationEight generation_viii;

}
