package br.edu.iesb.poo2024.atividadeAvaliativa1B2;

import br.edu.iesb.poo2024.atividadeAvaliativa1B2.exceptions.IngressoEsgotadoException;
import br.edu.iesb.poo2024.atividadeAvaliativa1B2.exceptions.TipoIngressoInvalidoException;

public class Cliente extends Pessoa{
    private String cpf;

	public Cliente(String nome, String cpf) {
		super(nome);
		this.setCpf(cpf);
	}
	public void consultarSessoes(Sessao[] sessoes) {
        System.out.println(nome + " está consultando as sessões disponíveis:");
        for (Sessao sessao : sessoes) {
            System.out.println("Filme: " + sessao.getFilme().getTitulo() + " | Sala: " + sessao.getSala().getNumeroSala() +
                               " | Horário: " + sessao.getHorario() + " | Ingressos disponíveis: " + sessao.getIngressosDisponiveis());
        }
    }

	//Tratamento de exceção em método
	public void comprarIngresso(Funcionario funcionario, Sessao sessao, Ingresso ingresso) throws IngressoEsgotadoException {
	    if (!sessao.verificarDisponibilidade()) {
	        throw new IngressoEsgotadoException();
	    }
	    try {
			funcionario.intermediarCompra(sessao, ingresso);
		} catch (TipoIngressoInvalidoException e) {
			e.printStackTrace();
		}
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}