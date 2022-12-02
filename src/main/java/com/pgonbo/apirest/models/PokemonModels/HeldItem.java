package com.pgonbo.apirest.models.PokemonModels;

import java.util.List;

import lombok.Data;

@Data
public class HeldItem {
    private Item item;
    private List<VersionDetails> version_details;
}
