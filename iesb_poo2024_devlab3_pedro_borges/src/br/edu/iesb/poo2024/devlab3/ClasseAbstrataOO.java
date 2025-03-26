package br.edu.iesb.poo2024.devlab3;

public abstract class ClasseAbstrataOO {

		protected String msg = "Essa classe eh abstrata!";
		
		//método abstrato
		public abstract void printMensagem();
		
		public void metodoConcreto() {
			System.out.println("metodoConcreto: da classe Abstrata");
		}
}
