package br.com.pokedex.pokedex_api.controller;

import br.com.pokedex.pokedex_api.model.Pokemon;
import br.com.pokedex.pokedex_api.repository.PokemonRepository;
import br.com.pokedex.pokedex_api.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.data.domain.PageRequest;

import org.springframework.data.domain.Pageable;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {

    @Autowired
    private PokemonService pokemonService;
    @Autowired
    private PokemonRepository pokemonRepository;

    @PostMapping
    public ResponseEntity<Pokemon> cadastrarPokemon(@RequestBody Pokemon pokemon) {
        Pokemon pokemonCadastrado = pokemonService.cadastrarPokemon(pokemon);
        return ResponseEntity.status(HttpStatus.CREATED).body(pokemonCadastrado);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Pokemon> atualizarPokemon(@PathVariable Long id, @RequestBody Pokemon pokemon) {
        Pokemon pokemonAtualizado = pokemonService.atualizarPokemon(id, pokemon);
        return ResponseEntity.ok(pokemonAtualizado);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarPokemon(@PathVariable Long id)
    {
        if (!
        pokemonRepository.existsById(id)){
            return ResponseEntity.notFound().build();
        }
        pokemonRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
    @GetMapping("/{numero}")
    public ResponseEntity<Pokemon> getPokemonByNumero(@PathVariable Long numero) {
        Pokemon pokemon = pokemonRepository.findByNumero(numero);
        if (pokemon != null) {
            return ResponseEntity.ok(pokemon);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @GetMapping
    public ResponseEntity<List<Pokemon>> listarPokemons() {
            Page<Pokemon> pokemons = pokemonRepository.findAll(PageRequest.of(0, 10, Sort.Direction.ASC, "nome"));
            return ResponseEntity.ok(pokemons.getContent());
        }
    }

