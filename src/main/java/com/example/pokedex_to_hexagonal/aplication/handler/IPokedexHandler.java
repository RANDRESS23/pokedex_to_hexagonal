package com.example.pokedex_to_hexagonal.aplication.handler;

import com.example.pokedex_to_hexagonal.aplication.dto.PokedexRequest;
import com.example.pokedex_to_hexagonal.aplication.dto.PokedexResponse;

import java.util.List;

public interface IPokedexHandler {

    void savePokemonInPokedex(PokedexRequest pokedexRequest);

    List<PokedexResponse> getAllPokemonFromPokedex();

    PokedexResponse getPokemonFromPokedex(Long pokemonNumber);

    void updatePokemonInPokedex(PokedexRequest pokedexRequest);

    void deletePokemonFromPokedex(Long pokemonNumber);

}
