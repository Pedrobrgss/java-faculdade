package br.edu.iesb.poo2024.atividadeAvaliativa1B2.exceptions;

public class IngressoEsgotadoException extends Exception {
	private static String mensagemErro = "[Erro]: Os ingressos desta sessão estão esgotados.";
	public IngressoEsgotadoException() {
        super(mensagemErro);
    }
}
