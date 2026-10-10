package com.renan_bianchine.recomendador_trilhas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Trilha {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String dificuldade;
    private Integer tempoEstimadoEmHoras;
    private Boolean cachoeira;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public Integer getTempoEstimadoEmHoras() {
        return tempoEstimadoEmHoras;
    }

    public void setTempoEstimadoEmHoras(Integer tempoEstimadoEmHoras) {
        this.tempoEstimadoEmHoras = tempoEstimadoEmHoras;
    }

    public Boolean getCachoeira() {
        return cachoeira;
    }

    public void setCachoeira(Boolean cachoeira) {
        this.cachoeira = cachoeira;
    }
}
