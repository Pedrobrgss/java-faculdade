package iesb_poo_2024_atividadeAvaliativa_pedro_borges;

public class Main {

	public static void main(String[] args) {
	System.out.println("Pedro Borges Alves: 2312082014\n");
	Cliente cliente1 = new Cliente("Arnaldo", "999.999.999.99");
	Funcionario funcionario1 = new Funcionario("Pedro", 1);
	Administrador admin = new Administrador("Joao", 2,1);
	Filme filme1 = new Filme("Matrix", 120);
	Filme filme2 = new Filme("Vingadores", 160);
	Sala sala1 = new Sala(1,30);
	Sessao sessao1 = new Sessao();
	Sessao sessao2 = new Sessao();
	Ingresso ingresso1 = new Ingresso("Meia", 40, "17:30");
	Ingresso ingresso2 = new Ingresso("Inteira", 40, "20:00");
	
	sessao1.criarSessao(filme1, sala1, "17:30");
	sessao2.criarSessao(filme2, sala1, "20:00");
	
	cliente1.consultarSessoes(new Sessao[] {sessao1,sessao2});
	System.out.println("\n");
	
	cliente1.comprarIngresso(funcionario1, sessao1, ingresso1);
	System.out.println("\n");
	
	admin.gerenciarFilmes(filme1,"Matrix Reload" , 120);
	admin.gerenciarSalas(sala1,0);
	admin.gerenciarSessoes(sessao2, filme2, sala1, "20:30");
	
	Cliente cliente2 = new Cliente("Lucas","888.888.888.88");
	cliente2.consultarSessoes(new Sessao[] {sessao1,sessao2});
	System.out.println("\n");
	cliente2.comprarIngresso(funcionario1, sessao2, ingresso2);
	}
}
