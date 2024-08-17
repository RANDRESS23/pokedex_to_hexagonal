package com.example.pokedex_to_hexagonal.aplication.dto;

import com.example.pokedex_to_hexagonal.domain.model.Type;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PokedexRequest {
    private Long number;
    private String name;
    private Type types;
    private String photo;
}
