package br.com.alura.screenmatch_random_frases.controller;

import br.com.alura.screenmatch_random_frases.models.FraseDTO;
import br.com.alura.screenmatch_random_frases.repository.FraseRepository;
import br.com.alura.screenmatch_random_frases.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/series")
public class FraseController {

    @Autowired
    FraseService service;

    @GetMapping("/frases")
    public FraseDTO obterFrase(){
        return service.obterFrase();
    }

}
