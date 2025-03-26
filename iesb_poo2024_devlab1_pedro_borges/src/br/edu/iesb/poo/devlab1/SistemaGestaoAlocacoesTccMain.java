package br.edu.iesb.poo.devlab1;
import java.util.ArrayList;

/*
Instituição: IESB
Disciplina: Programação Orientada a Objetos (POO)
Objetivo: Fornecer conhecimentos e práticas de programação orientada a objetos.
Professor: Bruno Miranda [bruno.marcos@iesb.edu.br
 */

public class SistemaGestaoAlocacoesTccMain {

	public static void main(String[] args) {

			Professor professor = new Professor();

			professor.setNome("Bruno");

			professor.setCargoProfessor("Professor Assistente");

			

			Aluno aluno = new Aluno();

			aluno.setNome("Pedro");

			aluno.setNrSemestre(7);

			aluno.setNomeCurso("Ciência da Computação");

			

			LinhaPesquisaOrientacao linhaPesquisa =

					new LinhaPesquisaOrientacao (1, "Desenvolvimento de software", "Técnicas de desenvolvimento em OO");

			

			ArrayList<LinhaPesquisaOrientacao> listaLinhasPesquisa = new ArrayList<LinhaPesquisaOrientacao>();

			listaLinhasPesquisa.add(linhaPesquisa);

			

			ProfessorOrientadorTCC orientadorTCC = new ProfessorOrientadorTCC();

			orientadorTCC.setQtdVagasOrientacao(2);

			orientadorTCC.setListaLinhaPesquisa(listaLinhasPesquisa);

			

			TrabalhoConclusaoCurso tcc = new TrabalhoConclusaoCurso();

			tcc.setAlunoAutorTCC(aluno);

			tcc.setOrientadorTCC(orientadorTCC);

			tcc.setTitulo("Implementação de Sistema de Informação para a empresa XYZ");



			System.out.println("Professor cadastrado: "+ professor.getNome());

			System.out.println("Aluno cadastrado: " + aluno.getNome());

			System.out.println("TCC cadastrado: " + tcc.getTitulo());

	}

}
