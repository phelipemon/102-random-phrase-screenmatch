package br.com.alura.screenmatch_random_frases.service;

import br.com.alura.screenmatch_random_frases.models.Frase;
import br.com.alura.screenmatch_random_frases.models.FraseDTO;
import br.com.alura.screenmatch_random_frases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {

    @Autowired
    FraseRepository repository;

    public FraseDTO obterFrase() {
        Frase frase = repository.obterFraseAleatoria();
        return new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonagem(), frase.getPoster());
    }
}
