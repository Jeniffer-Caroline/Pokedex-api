package br.com.pokedex.pokedex_api.repository;

import br.com.pokedex.pokedex_api.model.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PokemonRepository extends JpaRepository<Pokemon, Long> {
    Pokemon findByNumero(Long numero);
}