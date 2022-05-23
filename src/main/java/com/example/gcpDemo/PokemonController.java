package com.example.gcpDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PokemonController {
    @Autowired
    PokemonRepository pokemonRepository;

    @GetMapping("/pokemon")
    public List<Pokemon> getPokemon(){
        return pokemonRepository.findAll();
    }

    @PostMapping("/pokemon")
    public String addPokemon(@RequestBody Pokemon pokemon){
        pokemonRepository.save(pokemon);
        return "Successfully added pokemon: " + pokemon.getName();
    }

}
