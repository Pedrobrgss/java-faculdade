package iesb_2024_devlab4_pedro_borges;

public class DevLab4Main {

	public static void main(String[] args) {
		// Exemplo 1
		//VeiculoTransporte veiculoTransporte = new VeiculoTransporte();
		//veiculoTransporte.emitirAlertaSonoro();
		
		//Exemplo 2
		CarroSedan carroSedan = new CarroSedan();	
		carroSedan.setCor("Branca");
		carroSedan.setMarca("VW");
		
		// Modos de implementação de herança com classe abstrata
		Veiculo veiculoPasseio = new VeiculoPasseio();
		Veiculo veiculoTransporte = new VeiculoTransporte();
		Veiculo veiculoUtilitario = new VeiculoUtilitario();
		
		IGerenciaConfiguracoesVeiculo gerenciaVeiculoPasseio = new VeiculoPasseio();
		System.out.println(">> Quilometragem atual do veiculo de passeio:  " + gerenciaVeiculoPasseio.obterQuilometragemAtual());
		
		IGerenciaConfiguracoesVeiculo gerenciaVeiculoSedan = new CarroSedan();
		System.out.println(">> Quilometragem atual do Veiculo Sedan: " + gerenciaVeiculoSedan.obterQuilometragemAtual());
			
		
	}

}
