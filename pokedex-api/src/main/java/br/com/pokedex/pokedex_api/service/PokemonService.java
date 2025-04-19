package br.com.pokedex.pokedex_api.service;

import br.com.pokedex.pokedex_api.repository.PokemonRepository;
import br.com.pokedex.pokedex_api.model.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PokemonService {
    @Autowired
     private PokemonRepository pokemonRepository;

    public Pokemon
    cadastrarPokemon(Pokemon pokemon){
        return pokemonRepository.save(pokemon);
    }

    public Pokemon atualizarPokemon(Long id, Pokemon pokemon){
        Optional<Pokemon> pokemonExistente = pokemonRepository.findById(id);
        if (pokemonExistente.isPresent()) {
            Pokemon pokemonAtualizado = pokemonExistente.get();
            pokemonAtualizado.setNome(pokemon.getNome());
            pokemonAtualizado.setDescricao(pokemon.getDescricao());
            pokemonAtualizado.setImagem(pokemon.getImagem());
            pokemonAtualizado.setTipo(pokemon.getTipo());
            pokemonAtualizado.setCategoria(pokemon.getCategoria());
            pokemonAtualizado.setAreaHabita(pokemon.getAreaHabita());
            pokemonAtualizado.setAltura(pokemon.getAltura());
            pokemonAtualizado.setPeso(pokemon.getPeso());
            return pokemonRepository.save(pokemonAtualizado);
        }else{
            throw new RuntimeException("Pokémon não encontrado");
        }

    }
}
