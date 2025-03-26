package br.edu.iesb.poo2024.atividadeAvaliativa2B2InserirAvaliação.view;

import br.edu.iesb.poo2024.atividadeAvaliativa2B2InserirAvaliação.controller.AvaliacaoController;
import br.edu.iesb.poo2024.atividadeAvaliativa2B2InserirAvaliação.model.Avaliacao;
import java.util.Scanner;

public class AvaliacaoView {
    private AvaliacaoController controller;

    public AvaliacaoView(AvaliacaoController controller) {
        this.controller = controller;
    }

    public void inserirAvaliacao() {
        Scanner scanner = new Scanner(System.in);
        Avaliacao avaliacao = new Avaliacao(0, "");

        System.out.println("=== Inserir Avaliação ===");

        // Solicitar nota
        do {
            System.out.print("Informe uma nota (1 a 5): ");
            int nota = scanner.nextInt();
            if (controller.validarNota(nota)) {
                avaliacao.setNota(nota);
                break;
            } else {
                System.out.println("Nota inválida. Deve ser entre 1 e 5.");
            }
        } while (true);

        // Solicitar comentário
        scanner.nextLine(); // Limpar buffer
        System.out.print("Escreva seu comentário (até 200 caracteres): ");
        String comentario = scanner.nextLine();
        avaliacao.setComentario(comentario);

        // Validar e salvar avaliação
        if (controller.salvarAvaliacao(avaliacao)) {
            System.out.println("Avaliação salva com sucesso!");
        }
    }

    public void cancelarAvaliacao() {
        System.out.println("Tem certeza de que deseja cancelar a avaliação? (S/N)");
        Scanner scanner = new Scanner(System.in);
        String resposta = scanner.nextLine();
        if (resposta.equalsIgnoreCase("S")) {
            controller.cancelarAvaliacao();
        } else {
            System.out.println("Ação cancelada. Você pode continuar editando a avaliação.");
        }
    }
}