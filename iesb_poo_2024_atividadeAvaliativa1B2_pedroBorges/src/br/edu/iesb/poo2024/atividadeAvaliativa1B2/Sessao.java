package br.edu.iesb.poo2024.atividadeAvaliativa1B2;

import br.edu.iesb.poo2024.atividadeAvaliativa1B2.exceptions.SessaoInvalidaException;

public class Sessao {
    private Filme filme;
    private Sala sala;
    private String horario;
    private int ingressosDisponiveis;

    // Construtor padrão
    public Sessao() {}

    // Novo construtor com validação
    public Sessao(Filme filme, Sala sala, String horario, int ingressosDisponiveis) throws SessaoInvalidaException {
        if (filme == null || sala == null || horario == null || horario.isEmpty()) {
            throw new SessaoInvalidaException("Dados inválidos para criar sessão.");
        }
        if (ingressosDisponiveis < 0) {
            throw new SessaoInvalidaException("A quantidade de ingressos deve ser positiva.");
        }
        this.filme = filme;
        this.sala = sala;
        this.horario = horario;
        this.ingressosDisponiveis = ingressosDisponiveis;
    }

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

    public void setIngressosDisponiveis(int ingressosDisponiveis) {
        this.ingressosDisponiveis = ingressosDisponiveis; 
    }

    public void criarSessao(Filme filme, Sala sala, String horario) {
        this.filme = filme;
        this.sala = sala;
        this.horario = horario;
        this.ingressosDisponiveis = sala.getCapacidade();
    }

    // Exceções propagadas (não tratadas no método que as lança)
    public void alterarSessao(Filme filme, Sala sala, String horario) throws SessaoInvalidaException {
        if (sala == null || horario == null || horario.isEmpty()) {
            throw new SessaoInvalidaException("[Erro]: dados inválidos para alteração de sessão.");
        }
        this.filme = filme;
        this.sala = sala;
        this.horario = horario;
    }
}
