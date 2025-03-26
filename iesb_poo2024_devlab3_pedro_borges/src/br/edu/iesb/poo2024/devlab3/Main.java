package br.edu.iesb.poo2024.devlab3;

public class Main {

	public static void main(String[] args) {
		System.out.println("Pedro Borges Alves - 2312082014");
		// mais generico
		ClasseAbstrataOO concreta1 = new ClasseConcretaOO();
		concreta1.printMensagem();
		concreta1.metodoConcreto();
		System.out.println(concreta1.msg);
		concreta1.msg = "Essa classe não eh abstrata! coisa nenhuma";
		System.out.println(concreta1.msg);
		
		System.out.println("- - - - - - - - - - - - - - - -");
		
		// mais especializado
		ClasseConcretaOO2 concreta2 = new ClasseConcretaOO2();
		concreta2.printMensagem();
		concreta2.metodoConcreto();
			
		System.out.println("- - - - - - - - - - - - - - - -");

		System.out.println(IGerenciaArquivo.TIPO_ARQUIVO_CSV);
		//IGerenciaArquivo.TIPO_ARQUIVO_CSV = " .txt";
		ClasseConcretaOO3 concreta3 = new ClasseConcretaOO3();
		concreta3.lerArquivoDisco(null, false);
	}
}
