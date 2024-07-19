package br.com.alura.screenmatch_random_frases.repository;

import br.com.alura.screenmatch_random_frases.models.Frase;
import br.com.alura.screenmatch_random_frases.models.FraseDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface FraseRepository extends JpaRepository<Frase, Long> {

    @Query("SELECT f FROM Frase f ORDER BY RANDOM() LIMIT 1")
    Frase obterFraseAleatoria();
}
