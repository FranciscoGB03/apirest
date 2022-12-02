package com.pgonbo.apirest.models.PokemonModels;

import lombok.Data;

@Data
public class GeneralStat {
    private int base_stat;
    private int effort;
    private Stat stat;
}
