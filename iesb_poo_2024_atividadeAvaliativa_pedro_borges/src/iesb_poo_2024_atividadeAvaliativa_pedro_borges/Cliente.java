package iesb_poo_2024_atividadeAvaliativa_pedro_borges;

public class Cliente extends Pessoa{
    private String cpf;

	public Cliente(String nome, String cpf) {
		super(nome);
		this.cpf = cpf;
	}
	public void consultarSessoes(Sessao[] sessoes) {
        System.out.println(nome + " está consultando as sessões disponíveis:");
        for (Sessao sessao : sessoes) {
            System.out.println("Filme: " + sessao.getFilme().getTitulo() + " | Sala: " + sessao.getSala().getNumeroSala() +
                               " | Horário: " + sessao.getHorario() + " | Ingressos disponíveis: " + sessao.getIngressosDisponiveis());
        }
    }

    public void comprarIngresso(Funcionario funcionario, Sessao sessao, Ingresso ingresso) {
        if (sessao.verificarDisponibilidade()) {
            funcionario.intermediarCompra(sessao, ingresso);
        } else {
            System.out.println("Sessão esgotada.");
        }
    }
}
