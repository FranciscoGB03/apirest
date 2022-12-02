package com.pgonbo.apirest.models.PokemonModels;

import com.fasterxml.jackson.annotation.JsonAlias;

import lombok.Data;

@Data
public class Other {
    private DreamWorld dream_world;
    private Home home;
    @JsonAlias("official-artwork")
    private OfficialArtWork officialartwork;
}
