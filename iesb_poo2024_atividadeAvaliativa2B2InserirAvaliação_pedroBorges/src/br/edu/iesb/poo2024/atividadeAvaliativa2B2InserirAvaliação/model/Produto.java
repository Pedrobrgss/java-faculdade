package br.edu.iesb.poo2024.atividadeAvaliativa2B2InserirAvaliação.model;

public class Produto {
    private String nome;
    private String descricao;

    public Produto(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }
}
