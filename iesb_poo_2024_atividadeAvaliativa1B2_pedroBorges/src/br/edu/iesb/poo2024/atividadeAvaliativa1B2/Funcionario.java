package br.edu.iesb.poo2024.atividadeAvaliativa1B2;

import br.edu.iesb.poo2024.atividadeAvaliativa1B2.exceptions.TipoIngressoInvalidoException;

public class Funcionario extends Pessoa{
	private int idFuncionario;
	
	public Funcionario(String nome, int idFuncionario) {
		super(nome);
		this.setIdFuncionario(idFuncionario);
	}
	
	public int getIdFuncionario() {
		return idFuncionario;
	}
	
	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}
	
	public void intermediarCompra(Sessao sessao, Ingresso ingresso) throws TipoIngressoInvalidoException {
		 sessao.setIngressosDisponiveis(sessao.getIngressosDisponiveis() - 1); // Decrementa um ingresso disponível
		 System.out.println("Funcionário " + nome + " está intermediando a venda de ingresso.");
	        ingresso.registrarCompra();
	        System.out.println("Ingresso vendido para a sessão do filme: " + sessao.getFilme().getTitulo() + " às " + sessao.getHorario());
	}

}