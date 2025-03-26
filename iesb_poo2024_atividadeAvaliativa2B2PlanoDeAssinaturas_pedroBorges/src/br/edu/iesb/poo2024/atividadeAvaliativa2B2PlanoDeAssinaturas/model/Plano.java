package br.edu.iesb.poo2024.atividadeAvaliativa2B2PlanoDeAssinaturas.model;

public class Plano {
    private String titulo;
    private double valor;
    private String descricao;

    public Plano(String titulo, double valor, String descricao) {
        this.titulo = titulo;
        this.valor = valor;
        this.descricao = descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }
}