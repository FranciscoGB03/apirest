package com.pgonbo.apirest.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.pgonbo.apirest.models.PokemonModels.Especies;
import com.pgonbo.apirest.models.PokemonModels.Forms;
import com.pgonbo.apirest.models.PokemonModels.GameIndex;
import com.pgonbo.apirest.models.PokemonModels.GeneralAbility;
import com.pgonbo.apirest.models.PokemonModels.GeneralMoves;
import com.pgonbo.apirest.models.PokemonModels.GeneralStat;
import com.pgonbo.apirest.models.PokemonModels.GeneralType;
import com.pgonbo.apirest.models.PokemonModels.HeldItem;
import com.pgonbo.apirest.models.PokemonModels.Sprites;

import lombok.Data;

@Data
public class Pokemon {
    private int id;
    private int base_experience;
    private int height;
    private int weight;
    @JsonAlias("is_default")
    private boolean por_defecto;
    private int order;
    private String name;
    private String location_area_encounters;
    private List<Forms> forms;
    private List<GeneralAbility> abilities;
    private List<GameIndex> game_indices;
    private Especies species;
    private List<HeldItem> held_items;
    private List<GeneralType> types;
    private List<GeneralMoves> moves;
    private Sprites sprites;
    private List<GeneralStat> stats;
}
