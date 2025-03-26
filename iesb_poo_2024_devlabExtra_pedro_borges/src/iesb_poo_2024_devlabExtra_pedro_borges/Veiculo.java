package iesb_poo_2024_devlabExtra_pedro_borges;

public class Veiculo {
	private String marca;
	private String modelo;
	private String placa;
	private int ano;
	private float quilometragemTotal;
	private String nomeProprietario;
	private String cpfProprietario;
	
	public Veiculo(String marca, String modelo, String placa, int ano, float quilometragemTotal, String nomeProprietario, String cpfProprietario) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.ano = ano;
		this.quilometragemTotal = quilometragemTotal;
		this.nomeProprietario = nomeProprietario;
		this.cpfProprietario = cpfProprietario;
		}
	
	public Veiculo() {}
	
	public String getNomeProprietario() {
		return nomeProprietario;
	}
	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}
	public String getCpfProprietario() {
		return cpfProprietario;
	}
	public void setCpfProprietario(String cpfProprietario) {
		this.cpfProprietario = cpfProprietario;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public float getQuilometragemTotal() {
		return quilometragemTotal;
	}
	public void setQuilometragemTotal(float quilometragemTotal) {
		this.quilometragemTotal = quilometragemTotal;
	}
	
	
}
