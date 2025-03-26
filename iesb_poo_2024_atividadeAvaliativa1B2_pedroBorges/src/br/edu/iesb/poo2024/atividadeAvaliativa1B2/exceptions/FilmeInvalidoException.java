package br.edu.iesb.poo2024.atividadeAvaliativa1B2.exceptions;

public class FilmeInvalidoException extends Exception {
	public FilmeInvalidoException(String mensagemErro) {
        super(mensagemErro);
    }
}
