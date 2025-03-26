package iesb_poo_2024_atividadeAvaliativa_pedro_borges;

public class Administrador extends Funcionario{
	private int idDeAdministrador;

	public Administrador(String nome, int idFuncionario, int idDeAdministrador) {
		super(nome, idFuncionario);
		this.idDeAdministrador = idDeAdministrador;
	}
	
    public void gerenciarFilmes(Filme filme, String novoTitulo, int novaDuracao) {
        filme.setTitulo(novoTitulo);
        filme.setDuracao(novaDuracao);
        System.out.println("Filme atualizado: " + filme.getTitulo() + " | Duração: " + filme.getDuracao() + " minutos.");
	}
	
	public void gerenciarSalas(Sala sala, int novaCapacidade) {
	    sala.setCapacidade(novaCapacidade);
	    System.out.println("Sala " + sala.getNumeroSala() + " agora tem capacidade para " + sala.getCapacidade() + " pessoas.");
	}
	
	public void gerenciarSessoes(Sessao sessao, Filme filme, Sala sala, String novoHorario) {
	    sessao.alterarSessao(filme, sala, novoHorario);
	    System.out.println("Sessão alterada: Filme - " + filme.getTitulo() + ", Sala - " + sala.getNumeroSala() + ", Horário - " + novoHorario);
	}
}
