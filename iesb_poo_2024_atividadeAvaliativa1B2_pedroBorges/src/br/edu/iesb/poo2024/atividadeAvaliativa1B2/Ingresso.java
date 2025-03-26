package br.edu.iesb.poo2024.atividadeAvaliativa1B2;

import br.edu.iesb.poo2024.atividadeAvaliativa1B2.exceptions.TipoIngressoInvalidoException;

public class Ingresso {
	private String tipoIngresso; // meia-entrada ou inteiro
    private float valor;
    private String horaCompra;
    
    public String getTipoIngresso() {
		return tipoIngresso;
	}

	public void setTipoIngresso(String tipoIngresso) {
		this.tipoIngresso = tipoIngresso;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public String getHoraCompra() {
		return horaCompra;
	}

	public void setHoraCompra(String horaCompra) {
		this.horaCompra = horaCompra;
	}

	public Ingresso(String tipoIngresso, float valor, String horaCompra) {
        this.tipoIngresso = tipoIngresso;
        this.valor = valor;
        this.horaCompra = horaCompra;
    }

    public double calcularValor(boolean meiaEntrada) {
        return meiaEntrada ? valor / 2 : valor;
    } 

    //Exceções propagadas (não tratadas no método que as lança):
    public void registrarCompra() throws TipoIngressoInvalidoException {
        if (tipoIngresso == null || tipoIngresso.isEmpty()) {
            throw new TipoIngressoInvalidoException("[Erro]: tipo de ingresso inválido.");
        }
        System.out.println("Compra registrada: " + tipoIngresso + " no valor de R$" + valor);
    }
}