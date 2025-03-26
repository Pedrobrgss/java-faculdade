package iesb_poo_2024_atividadeAvaliativa_pedro_borges;

public class Sessao {
	private Filme filme;
	private Sala sala;
	private String horario;
	private int ingressosDisponiveis;
	
	public Sessao() {}
	
	public boolean verificarDisponibilidade() {
		return ingressosDisponiveis > 0;
	}
	
	public Filme getFilme() {
		return filme;
	}
	
	public Sala getSala() {
		return sala;
	}
	
	public String getHorario() {
		return horario;
	}
	
	public int getIngressosDisponiveis() {
		return ingressosDisponiveis;
	}
	
	public void criarSessao(Filme filme, Sala sala, String horario) {
		this.filme = filme;
		this.sala = sala;
		this.horario = horario;
		this.ingressosDisponiveis = sala.getCapacidade();
	}
	
	public void alterarSessao(Filme filme, Sala sala, String horario) {
        this.filme = filme;
        this.sala = sala;
        this.horario = horario;
        this.ingressosDisponiveis = sala.getCapacidade();
    }
}
