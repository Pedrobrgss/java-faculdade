package iesb_2024_devlab4_pedro_borges;

public class VeiculoPasseio extends Veiculo 
	implements IGerenciaConfiguracoesVeiculo, IGerenciaVeiculoRemotamente, IReportErrorsInformacoes
{
	
	public VeiculoPasseio() {
		
	}

	@Override
	public void acelerar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void freiar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void fazerCurva() {
		// TODO Auto-generated method stub

	}

	@Override
	public void emitirInformacoesCentral() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void emitirErrosCentral() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isVeiculoLigado() {
		// 
		return true;
	}

	@Override
	public int ligarVeiculo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int desligarVeiculo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int ligarArcondicionado() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int obterQuilometragemAtual() {
		// TODO Auto-generated method stub
		return 20000;
	}

	@Override
	public int obterQuilometragemRevisao() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void emitirAlertaRevisao() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void emitirAlertaAcidente() {
		// TODO Auto-generated method stub
		
	}

}
