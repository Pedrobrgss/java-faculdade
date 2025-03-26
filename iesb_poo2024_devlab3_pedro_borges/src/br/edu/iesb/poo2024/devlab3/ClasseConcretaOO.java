package br.edu.iesb.poo2024.devlab3;

public class ClasseConcretaOO extends ClasseAbstrataOO {

	@Override
	public void printMensagem() {
		System.out.println(">> printMensagem: "+ getClass());
	}

	@Override
	public void metodoConcreto() {
		System.out.println(">> metodoConcreto: "+ getClass());
	}
	
	

}
