package com.example.pokedex_to_hexagonal.infrastructure.input.rest;

import com.example.pokedex_to_hexagonal.aplication.dto.PokedexRequest;
import com.example.pokedex_to_hexagonal.aplication.dto.PokedexResponse;
import com.example.pokedex_to_hexagonal.aplication.handler.IPokedexHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pokedex")
@RequiredArgsConstructor
public class PokemonRestController {
    private final IPokedexHandler pokedexHandler;

//    @Operation(summary = "Add a new pokemon")
//    @ApiResponses(value = {
//            @ApiResponse(responseCode = "201", description = "Pokemon created", content = @Content),
//            @ApiResponse(responseCode = "409", description = "Pokemon already exists", content = @Content)
//    })
    @PostMapping("/")
    public ResponseEntity<Void> savePokemonInPokedex(@RequestBody PokedexRequest pokedexRequest) {
        pokedexHandler.savePokemonInPokedex(pokedexRequest);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

//    @Operation(summary = "Get all the pokemons")
//    @ApiResponses(value = {
//            @ApiResponse(responseCode = "200", description = "All pokemons returned",
//                    content = @Content(mediaType = "application/json",
//                            array = @ArraySchema(schema = @Schema(implementation = PokedexResponse.class)))),
//            @ApiResponse(responseCode = "404", description = "No data found", content = @Content)
//    })
    @GetMapping("/")
    public ResponseEntity<List<PokedexResponse>> getAllPokemonFromPokedex() {
        return ResponseEntity.ok(pokedexHandler.getAllPokemonFromPokedex());
    }

//    @Operation(summary = "Get a pokemon by their Number")
//    @ApiResponses(value = {
//            @ApiResponse(responseCode = "200", description = "Pokemon found",
//                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = PokedexResponse.class))),
//            @ApiResponse(responseCode = "404", description = "Pokemon not found", content = @Content)
//    })
    @GetMapping("/{number}")
    public ResponseEntity<PokedexResponse> getPokemonFromPokedex(@PathVariable(name = "number") Long pokemonNumber) {
        return ResponseEntity.ok(pokedexHandler.getPokemonFromPokedex(pokemonNumber));
    }

//    @Operation(summary = "Update an existing pokemon")
//    @ApiResponses(value = {
//            @ApiResponse(responseCode = "200", description = "Pokemon updated", content = @Content),
//            @ApiResponse(responseCode = "404", description = "Pokemon not found", content = @Content)
//    })
    @PutMapping("/")
    public ResponseEntity<Void> updatePokemonInPokedex(@RequestBody PokedexRequest pokedexRequest) {
        pokedexHandler.updatePokemonInPokedex(pokedexRequest);
        return ResponseEntity.noContent().build();
    }

//    @Operation(summary = "Delete a pokemon by their Number")
//    @ApiResponses(value = {
//            @ApiResponse(responseCode = "200", description = "Pokemon deleted", content = @Content),
//            @ApiResponse(responseCode = "404", description = "Pokemon not found", content = @Content)
//    })
    @DeleteMapping("/{pokemonNumber}")
    public ResponseEntity<Void> deletePokemonFromPokedex(@PathVariable Long pokemonNumber) {
        pokedexHandler.deletePokemonFromPokedex(pokemonNumber);
        return ResponseEntity.noContent().build();
    }
}
