package iesb_poo_2024_atividadeAvaliativa_pedro_borges;

public class Ingresso {
	private String tipoIngresso; // meia-entrada ou inteiro
    private float valor;
    private String horaCompra;

    public Ingresso(String tipoIngresso, float valor, String horaCompra) {
        this.tipoIngresso = tipoIngresso;
        this.valor = valor;
        this.horaCompra = horaCompra;
    }

    public double calcularValor(boolean meiaEntrada) {
        return meiaEntrada ? valor / 2 : valor;
    } 

    public void registrarCompra() {
        System.out.println("Ingresso do tipo " + tipoIngresso + " comprado às " + horaCompra + ". Valor: R$" + valor);
    }
}
