package iesb_2024_devlab4_pedro_borges;

public class CarroSedan extends VeiculoPasseio {
	public void metodoEspecificoCarroSedan() {
		if(super.isVeiculoLigado()) {
			System.out.println("O carro está ligado!");
		}
	}

	@Override
	public int obterQuilometragemAtual() {
		
		return 100000;
	}
	
	
}
