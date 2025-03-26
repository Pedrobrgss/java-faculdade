package br.edu.iesb.poo2024.atividadeAvaliativa2B2PlanoDeAssinaturas.controller;

import br.edu.iesb.poo2024.atividadeAvaliativa2B2PlanoDeAssinaturas.model.Pagamento;
import br.edu.iesb.poo2024.atividadeAvaliativa2B2PlanoDeAssinaturas.model.Plano;
import br.edu.iesb.poo2024.atividadeAvaliativa2B2PlanoDeAssinaturas.model.PlanoRepository;
import br.edu.iesb.poo2024.atividadeAvaliativa2B2PlanoDeAssinaturas.model.Usuario;


public class PlanoController {
    private PlanoRepository planoRepository;

    public PlanoController() {
        this.planoRepository = new PlanoRepository();
    }

    public void exibirPlanos() {
        for (Plano plano : planoRepository.getPlanosDisponiveis()) {
            System.out.println("Plano: " + plano.getTitulo());
            System.out.println("Valor: R$ " + plano.getValor());
            System.out.println("Descrição: " + plano.getDescricao());
            System.out.println("----------------------------");
        }
    }

    public boolean selecionarPlano(Usuario usuario, Plano plano, Pagamento pagamento) {
        if (!usuario.isAutenticado()) {
            System.out.println("Usuário não autenticado!");
            return false;
        }

        System.out.println("Plano " + plano.getTitulo() + " selecionado com sucesso!");
        pagamento.processarPagamento(plano.getValor());
        return true;
    }
}