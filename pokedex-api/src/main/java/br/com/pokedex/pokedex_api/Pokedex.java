package br.com.pokedex.pokedex_api;


import java.util.ArrayList;
import java.util.List;

public class Pokedex {
    private Long id;
    private String nome;
    private List<Pokemon> pokemons;

    public Pokedex(Long id, String nome) {
        this.id = id;
        this.nome = nome;
        this.pokemons = new ArrayList<>();
    }

    public void adicionarPokemon(Pokemon pokemon) {
        this.pokemons.add(pokemon);
    }

    public void removerPokemon(Pokemon pokemon) {
        this.pokemons.remove(pokemon);
    }

    public Pokemon getPokemon(String nome) {
        return this.pokemons.stream()
                .filter(pokemon -> pokemon.getNome().equals(nome))
                .findFirst()
                .orElse(null);
    }

    public List<Pokemon> getPokemons() {
        return this.pokemons;
    }
}