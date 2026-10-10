package com.renan_bianchine.recomendador_trilhas.repository;

import com.renan_bianchine.recomendador_trilhas.model.Trilha;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TrilhaRepository  extends JpaRepository<Trilha, Long> {
    List<Trilha> findByDificuldade(String dificuldade);

    boolean existsBy(String nome);
}
