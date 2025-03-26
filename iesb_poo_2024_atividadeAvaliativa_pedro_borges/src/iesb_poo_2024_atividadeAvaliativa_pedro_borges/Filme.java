package iesb_poo_2024_atividadeAvaliativa_pedro_borges;

public class Filme {
	private String titulo;
	private int duracao; // Em minutos
	
	public Filme(String titulo, int duracao) {
		super();
		this.titulo = titulo;
		this.duracao = duracao;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
}
