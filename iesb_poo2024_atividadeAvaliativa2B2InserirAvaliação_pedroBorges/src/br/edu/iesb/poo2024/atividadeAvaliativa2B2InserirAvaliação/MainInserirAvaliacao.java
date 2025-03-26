package br.edu.iesb.poo2024.atividadeAvaliativa2B2InserirAvaliação;

import br.edu.iesb.poo2024.atividadeAvaliativa2B2InserirAvaliação.controller.AvaliacaoController;
import br.edu.iesb.poo2024.atividadeAvaliativa2B2InserirAvaliação.view.AvaliacaoView;

public class MainInserirAvaliacao {

	public static void main(String[] args) {
		System.out.println("Pedro Borges Alves - 2312082014");
		AvaliacaoController avaliacaoController = new AvaliacaoController();
	    AvaliacaoView avaliacaoView = new AvaliacaoView(avaliacaoController);

	    System.out.println("Bem-vindo ao sistema de avaliações!");
	    avaliacaoView.inserirAvaliacao();

	    // Caso o usuário deseje cancelar
	    avaliacaoView.cancelarAvaliacao();
	}

}
