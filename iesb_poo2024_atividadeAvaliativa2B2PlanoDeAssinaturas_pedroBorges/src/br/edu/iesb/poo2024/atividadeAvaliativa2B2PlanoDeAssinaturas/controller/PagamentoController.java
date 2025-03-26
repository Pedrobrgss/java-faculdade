package br.edu.iesb.poo2024.atividadeAvaliativa2B2PlanoDeAssinaturas.controller;
import br.edu.iesb.poo2024.atividadeAvaliativa2B2PlanoDeAssinaturas.model.Pagamento;
import br.edu.iesb.poo2024.atividadeAvaliativa2B2PlanoDeAssinaturas.model.Plano;
import br.edu.iesb.poo2024.atividadeAvaliativa2B2PlanoDeAssinaturas.model.Usuario;

public class PagamentoController {
    public boolean processarPagamento(Usuario usuario, Plano plano, Pagamento pagamento) {
        if (!usuario.isAutenticado()) {
            System.out.println("Erro: Usuário não está autenticado.");
            return false;
        }

        System.out.println("Processando pagamento...");
        pagamento.processarPagamento(plano.getValor());
        System.out.println("Pagamento processado com sucesso para o plano: " + plano.getTitulo());
        return true;
    }

    public void ajustarCobranca(Plano plano) {
        System.out.println("Ajustando cobrança para o plano " + plano.getTitulo() +
                           " no valor de R$ " + plano.getValor());
    }
}
