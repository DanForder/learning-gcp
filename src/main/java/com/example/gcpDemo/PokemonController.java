package com.example.gcpDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PokemonController {
    @Autowired
    PokemonRepository pokemonRepository;

    @GetMapping("/pokemon")
    public List<Pokemon> getPokemon() {
        return pokemonRepository.findAll();
    }

    @PostMapping("/pokemon")
    public String addPokemon(@RequestBody Pokemon pokemon) {
        pokemonRepository.save(pokemon);
        return "Successfully added pokemon: " + pokemon.getName();
    }

    @DeleteMapping("/pokemon/{id}")
    public String deletePokemon(@PathVariable Integer id) {
        Pokemon pokemonToDelete = pokemonRepository.findById(id).orElse(null);
        if (pokemonToDelete != null) {
            pokemonRepository.delete(pokemonToDelete);
            return "Deleted pokemon with id of: " + id;
        }
        return "No pokemon found with id of: " + id;
    }
}
