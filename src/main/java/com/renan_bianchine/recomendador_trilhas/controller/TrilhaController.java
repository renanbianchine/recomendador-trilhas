package com.renan_bianchine.recomendador_trilhas.controller;


import com.renan_bianchine.recomendador_trilhas.model.Trilha;
import com.renan_bianchine.recomendador_trilhas.repository.TrilhaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/trilhas")
public class TrilhaController {
    private final TrilhaRepository repository;

    public TrilhaController(TrilhaRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Trilha cadastrarTrilha(@RequestBody Trilha novaTrilha) {
        if (repository.existsBy(novaTrilha.getNome())){
            throw new org.springframework.web.server.ResponseStatusException(
                    HttpStatus.BAD_REQUEST, "Já existe uma trilha com este nome!"
            );
        }
        return repository.save(novaTrilha);
    }

    @GetMapping
    public List<Trilha> buscarTrilhas(@RequestParam(required = false) String dificuldade) {
        if (dificuldade != null) {
            return repository.findByDificuldade(dificuldade);
        }
        return repository.findAll();
    }
}
