package com.pgonbo.apirest.models.PokemonModels;

import java.util.List;

import lombok.Data;

@Data
public class GeneralMoves {
    private Move move;
    private List<VersionGroupDetail> version_group_details;
}
