package br.edu.iesb.poo2024.atividadeAvaliativa2B2PlanoDeAssinaturas.model;

public class Usuario {
    private String nome;
    private boolean autenticado;

    public Usuario(String nome, boolean autenticado) {
        this.nome = nome;
        this.autenticado = autenticado;
    }

    public boolean isAutenticado() {
        return autenticado;
    }

    public String getNome() {
        return nome;
    }
}
