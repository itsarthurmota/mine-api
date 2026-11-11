package com.dt2.mine.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Game {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String genero;
    private String plataforma;
    private String imagem;
    private int anoLancamento;
    private String descricao;

    public Game(int id, String nome, String genero, String plataforma, String imagem, int anoLancamento, String descricao) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.plataforma = plataforma;
        this.imagem = imagem;
        this.anoLancamento = anoLancamento;
        this.descricao = descricao;
    }

    public Game(String nome, String genero, String plataforma, String imagem, int anoLancamento, String descricao) {
        this.nome = nome;
        this.genero = genero;
        this.plataforma = plataforma;
        this.imagem = imagem;
        this.anoLancamento = anoLancamento;
        this.descricao = descricao;
    }

    public Game() {
    }

    public int getId() {
        return id;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
