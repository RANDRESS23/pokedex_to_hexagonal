package com.example.pokedex_to_hexagonal.aplication.dto;

import com.example.pokedex_to_hexagonal.domain.model.Type;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PokedexResponse {
    private Long number;
    private String name;
    private TypeDto types;
    private String photo;
}
