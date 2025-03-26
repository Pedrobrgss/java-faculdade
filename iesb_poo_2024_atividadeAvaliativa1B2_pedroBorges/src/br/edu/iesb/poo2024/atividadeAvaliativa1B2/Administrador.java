package br.edu.iesb.poo2024.atividadeAvaliativa1B2;
import br.edu.iesb.poo2024.atividadeAvaliativa1B2.exceptions.FilmeInvalidoException;
import br.edu.iesb.poo2024.atividadeAvaliativa1B2.exceptions.SessaoInvalidaException;

public class Administrador extends Funcionario{
	private int idDeAdministrador;

	public Administrador(String nome, int idFuncionario, int idDeAdministrador) {
		super(nome, idFuncionario);
		this.idDeAdministrador = idDeAdministrador;
	}
	
	//Tratamento de exceção em método
	public void gerenciarFilmes(Filme filme, String novoTitulo, int novaDuracao) throws FilmeInvalidoException {
	    if (novoTitulo == null || novoTitulo.isEmpty()) {
	        throw new FilmeInvalidoException("[Erro]: O titulo do filme não pode ser nulo.");
	    }
	    if (novaDuracao <= 0) {
	        throw new FilmeInvalidoException("[Erro]: A duração do filme não pode ser zero ou negativa.");
	    }
	    filme.setTitulo(novoTitulo);
	    filme.setDuracao(novaDuracao);
	}
	
	public void gerenciarSalas(Sala sala, int novaCapacidade) {
	    sala.setCapacidade(novaCapacidade);
	    System.out.println("Sala " + sala.getNumeroSala() + " agora tem capacidade para " + sala.getCapacidade() + " pessoas.");
	}
	
	public void gerenciarSessoes(Sessao sessao, Filme filme, Sala sala, String novoHorario) {
	    try {
			sessao.alterarSessao(filme, sala, novoHorario);
		} catch (SessaoInvalidaException e) {
			e.printStackTrace();
		}
	    System.out.println("Sessão alterada: Filme - " + filme.getTitulo() + ", Sala - " + sala.getNumeroSala() + ", Horário - " + novoHorario);
	}
}
