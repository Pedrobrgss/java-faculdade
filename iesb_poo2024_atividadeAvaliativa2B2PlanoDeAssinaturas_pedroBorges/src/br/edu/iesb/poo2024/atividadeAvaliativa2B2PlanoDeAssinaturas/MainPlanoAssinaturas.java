package br.edu.iesb.poo2024.atividadeAvaliativa2B2PlanoDeAssinaturas;
import br.edu.iesb.poo2024.atividadeAvaliativa2B2PlanoDeAssinaturas.controller.*;
import br.edu.iesb.poo2024.atividadeAvaliativa2B2PlanoDeAssinaturas.model.*;
import br.edu.iesb.poo2024.atividadeAvaliativa2B2PlanoDeAssinaturas.view.*;

public class MainPlanoAssinaturas {

	public static void main(String[] args) {
		System.out.println("Pedro Borges Alves - 2312082014");
		   // Inicializar dados principais
        Usuario usuario = new Usuario("João", true);
        Pagamento pagamento = new Pagamento("Cartão de Crédito");
        PlanoController planoController = new PlanoController();
        PagamentoController pagamentoController = new PagamentoController();
        PlanoView planoView = new PlanoView(planoController);

        // Fluxo principal
        System.out.println("Bem-vindo ao sistema de assinaturas!");

        // Exibir planos via View
        planoView.mostrarPlanos();

        // Simular seleção de plano
        PlanoRepository planoRepository = new PlanoRepository();
        Plano planoSelecionado = planoRepository.getPlanosDisponiveis().get(1); // Seleciona o plano "Premium"

        if (pagamentoController.processarPagamento(usuario, planoSelecionado, pagamento)) {
            pagamentoController.ajustarCobranca(planoSelecionado);
        }
	}

}
