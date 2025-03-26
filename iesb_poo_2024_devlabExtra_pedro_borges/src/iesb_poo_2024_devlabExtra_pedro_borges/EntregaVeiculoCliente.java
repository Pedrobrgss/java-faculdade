package iesb_poo_2024_devlabExtra_pedro_borges;
import java.util.Date;

public class EntregaVeiculoCliente  {
	private boolean isRealizadoPagamento = false;
	private boolean isConsertoRealizado = false;
	private boolean isLavagemRealizada = false;
	private boolean isClienteSatisfeito = false;
	private OrdemServico ordemServico;
	private boolean OSfinalizada;
	
	public EntregaVeiculoCliente(boolean isRealizadoPagamento, boolean isConsertoRealizado, boolean isLavagemRealizada,
			boolean isClienteSatisfeito, OrdemServico ordemServico) {
		super();
		this.isRealizadoPagamento = isRealizadoPagamento;
		this.isConsertoRealizado = isConsertoRealizado;
		this.isLavagemRealizada = isLavagemRealizada;
		this.isClienteSatisfeito = isClienteSatisfeito;
		this.ordemServico = ordemServico;
	}
	
	public EntregaVeiculoCliente() {}

	public boolean isRealizadoPagamento() {
		return isRealizadoPagamento;
	}

	public void setRealizadoPagamento(boolean isRealizadoPagamento) {
		this.isRealizadoPagamento = isRealizadoPagamento;
	}

	public boolean isConsertoRealizado() {
		return isConsertoRealizado;
	}

	public void setConsertoRealizado(boolean isConsertoRealizado) {
		this.isConsertoRealizado = isConsertoRealizado;
	}

	public boolean isLavagemRealizada() {
		return isLavagemRealizada;
	}

	public void setLavagemRealizada(boolean isLavagemRealizada) {
		this.isLavagemRealizada = isLavagemRealizada;
	}

	public boolean isClienteSatisfeito() {
		return isClienteSatisfeito;
	}

	public void setClienteSatisfeito(boolean isClienteSatisfeito) {
		this.isClienteSatisfeito = isClienteSatisfeito;
	}

	public OrdemServico getOrdemServico() {
		return ordemServico;
	}

	public void setOrdemServico(OrdemServico ordemServico) {
		this.ordemServico = ordemServico;
	}
	public void isOSfinalizada() {
		isConsertoRealizado = true;
		isLavagemRealizada = true;
		OSfinalizada = true;
		ordemServico.setOSfinalizada(OSfinalizada);
	}
}
