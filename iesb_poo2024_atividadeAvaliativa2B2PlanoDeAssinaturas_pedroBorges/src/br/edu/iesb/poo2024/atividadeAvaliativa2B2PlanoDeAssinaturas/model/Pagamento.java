package br.edu.iesb.poo2024.atividadeAvaliativa2B2PlanoDeAssinaturas.model;

public class Pagamento {
    private String formaPagamento;

    public Pagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$ " + valor + " processado via " + formaPagamento);
    }
}
