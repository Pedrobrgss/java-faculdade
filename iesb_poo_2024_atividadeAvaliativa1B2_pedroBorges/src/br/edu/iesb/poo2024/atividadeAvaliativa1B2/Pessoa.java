package br.edu.iesb.poo2024.atividadeAvaliativa1B2;


public abstract class Pessoa {
	public String nome;

	public Pessoa(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	

}