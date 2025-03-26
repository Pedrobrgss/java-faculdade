package br.edu.iesb.poo2024.atividadeAvaliativa2B2InserirAvaliação.model;

import java.util.ArrayList;
import java.util.List;

public class AvaliacaoRepository {
    private List<Avaliacao> avaliacoes;

    public AvaliacaoRepository() {
        this.avaliacoes = new ArrayList<>();
    }

    public void salvarAvaliacao(Avaliacao avaliacao) {
        avaliacoes.add(avaliacao);
        System.out.println("Avaliação salva com sucesso!");
    }

    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }
}