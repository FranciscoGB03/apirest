package com.pgonbo.apirest.models.PokemonModels;

import lombok.Data;

@Data
public class GeneralAbility {

    private Ability ability;
    private boolean is_hidden;
    private int slot;

}
