package br.edu.iesb.poo2024.atividadeAvaliativa2B2PlanoDeAssinaturas.view;

import br.edu.iesb.poo2024.atividadeAvaliativa2B2PlanoDeAssinaturas.controller.PlanoController;

public class PlanoView {
	  private PlanoController controller;

	    public PlanoView(PlanoController controller) {
	        this.controller = controller;
	    }

	    public void mostrarPlanos() {
	        System.out.println("=== Planos Disponíveis ===");
	        controller.exibirPlanos();
	        System.out.println("==========================");
	    }
}