package br.edu.iesb.poo2024.atividadeAvaliativa2B2InserirAvaliação.controller;

import br.edu.iesb.poo2024.atividadeAvaliativa2B2InserirAvaliação.model.Avaliacao;

public class AvaliacaoController {
    public boolean validarNota(int nota) {
        return nota >= 1 && nota <= 5;
    }

    public boolean validarComentario(String comentario) {
        return comentario.length() <= 200;
    }

    public boolean salvarAvaliacao(Avaliacao avaliacao) {
        if (avaliacao.getNota() == 0) {
            System.out.println("Erro: A nota deve ser preenchida antes de salvar.");
            return false;
        }
        if (!validarComentario(avaliacao.getComentario())) {
            System.out.println("Erro: O comentário excede o limite de 200 caracteres.");
            return false;
        }
        return true;
    }

    public void cancelarAvaliacao() {
        System.out.println("Avaliação cancelada. Dados descartados.");
    }
}

