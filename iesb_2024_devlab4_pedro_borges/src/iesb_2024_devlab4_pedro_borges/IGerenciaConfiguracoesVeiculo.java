package iesb_2024_devlab4_pedro_borges;

public interface IGerenciaConfiguracoesVeiculo {

	public int obterQuilometragemAtual();
	public int obterQuilometragemRevisao();
	public void emitirAlertaRevisao();
	public void emitirAlertaAcidente();
}
