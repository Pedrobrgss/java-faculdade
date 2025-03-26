package br.edu.iesb.poo2024.devlab3;

public interface IGerenciaArquivo {

	public static final String TIPO_ARQUIVO_CSV = ".csv";
	public static final String TIPO_ARQUIVO_TXT = ".txt";
	
	public void lerArquivoDisco(String pathArquivo, boolean isPrint);
}
