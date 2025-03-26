package br.edu.iesb.poo2024.atividadeAvaliativa2B2PlanoDeAssinaturas.model;

import java.util.ArrayList;
import java.util.List;

public class PlanoRepository {
    private List<Plano> planos;

    public PlanoRepository() {
        planos = new ArrayList<>();
        planos.add(new Plano("Básico", 29.90, "Acesso limitado aos serviços."));
        planos.add(new Plano("Premium", 59.90, "Acesso completo com benefícios extras."));
        planos.add(new Plano("VIP", 99.90, "Acesso total e suporte prioritário."));
    }

    public List<Plano> getPlanosDisponiveis() {
        return planos;
    }
}