package iesb_poo_2024_atividadeAvaliativa_pedro_borges;

public class Funcionario extends Pessoa{
	private int idFuncionario;
	
	public Funcionario(String nome, int idFuncionario) {
		super(nome);
		this.idFuncionario = idFuncionario;
	}
	
	public void intermediarCompra(Sessao sessao, Ingresso ingresso) {
		 System.out.println("Funcionário " + nome + " está intermediando a venda de ingresso.");
	        ingresso.registrarCompra();
	        System.out.println("Ingresso vendido para a sessão do filme: " + sessao.getFilme().getTitulo() + " às " + sessao.getHorario());
	}
}
