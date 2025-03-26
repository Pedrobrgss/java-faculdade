package br.edu.iesb.poo2024.atividadeAvaliativa1B2;
import br.edu.iesb.poo2024.atividadeAvaliativa1B2.exceptions.FilmeInvalidoException;
import br.edu.iesb.poo2024.atividadeAvaliativa1B2.exceptions.IngressoEsgotadoException;
import br.edu.iesb.poo2024.atividadeAvaliativa1B2.exceptions.TipoIngressoInvalidoException;
import br.edu.iesb.poo2024.atividadeAvaliativa1B2.exceptions.SessaoInvalidaException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Pedro Borges Alves: 2312082014\n");

        // Criação de objetos
        Administrador admin = new Administrador("João", 2, 1);
        Filme filme1 = new Filme("Matrix", 120);
        
        // Criando uma sala e uma sessão para os testes de ingresso
        Sala sala1 = new Sala(1, 1); // Sala com 1 lugar disponível
        Sessao sessao1 = new Sessao();
        sessao1.criarSessao(filme1, sala1, "17:30"); // Criar sessão
        Funcionario funcionario = new Funcionario("Pedro", 1);
        
        Ingresso ingressoValido = new Ingresso("Inteira", 40, "17:30");
        Ingresso ingressoInvalido = new Ingresso("", 40, "17:30"); // Ingresso com tipo inválido
        
        // Criando um cliente
        Cliente cliente1 = new Cliente("Arnaldo", "999.999.999.99");

        // Teste 1: Atualizar filme com título vazio
        System.out.println("Teste 1: Atualizar filme com título vazio");
        try {
            admin.gerenciarFilmes(filme1, "", 120); // Título vazio
        } catch (FilmeInvalidoException e) {
            System.out.println(e.getMessage()); // Mensagem de erro esperada
        }
        System.out.println("---------------------------");

        // Teste 2: Atualizar filme com duração zero
        System.out.println("Teste 2: Atualizar filme com duração zero");
        try {
            admin.gerenciarFilmes(filme1, "Matrix Reload", 0); // Duração zero
        } catch (FilmeInvalidoException e) {
            System.out.println(e.getMessage()); // Mensagem de erro esperada
        }
        System.out.println("---------------------------");

        // Teste 3: Atualizar filme com duração negativa
        System.out.println("Teste 3: Atualizar filme com duração negativa");
        try {
            admin.gerenciarFilmes(filme1, "Matrix Reload", -30); // Duração negativa
        } catch (FilmeInvalidoException e) {
            System.out.println(e.getMessage()); // Mensagem de erro esperada
        }
        System.out.println("---------------------------");

        // Teste 4: Atualizar filme com título e duração válidos
        System.out.println("Teste 4: Atualizar filme com título e duração válidos");
        try {
            admin.gerenciarFilmes(filme1, "Matrix Reload", 130); // Título e duração válidos
            System.out.println("Filme atualizado com sucesso: " + filme1.getTitulo() + ", Duração: " + filme1.getDuracao());
        } catch (FilmeInvalidoException e) {
            System.out.println(e.getMessage()); // Não deve ser executado
        }
        System.out.println("---------------------------");

        // Teste 5: Exemplo de uso da exceção de ingresso esgotado
        System.out.println("Teste 5: Verificar exceção de ingresso esgotado");
        sala1.setCapacidade(0); // Ajustar a sala para ter 0 capacidade
        try {
            cliente1.comprarIngresso(funcionario, sessao1, ingressoValido); // Tentativa de compra de ingresso
        } catch (IngressoEsgotadoException e) {
            System.out.println(e.getMessage()); // Mensagem de erro esperada
        }
        System.out.println("---------------------------");

        // Teste 6: Verificar exceção de tipo de ingresso inválido
        System.out.println("Teste 6: Verificar exceção de tipo de ingresso inválido");
        try {
            funcionario.intermediarCompra(sessao1, ingressoInvalido); // Tentativa de registrar compra com tipo de ingresso inválido
        } catch (TipoIngressoInvalidoException e) {
            System.out.println(e.getMessage()); // Mensagem de erro esperada
        }
        System.out.println("---------------------------");

        // Teste 7: Registro de compra com tipo de ingresso válido
        System.out.println("Teste 7: Registro de compra com tipo de ingresso válido");
        try {
            funcionario.intermediarCompra(sessao1, ingressoValido); // Registro de compra com tipo de ingresso válido
            System.out.println("Compra registrada com sucesso para o ingresso: " + ingressoValido.getTipoIngresso());
        } catch (TipoIngressoInvalidoException e) {
            System.out.println(e.getMessage()); // Não deve ser executado
        }
        System.out.println("---------------------------");

        // Teste 8: Criar sessão com dados inválidos
        System.out.println("Teste 8: Criar sessão com dados inválidos");
        try {
            Sessao sessaoInvalida = new Sessao(null, sala1, "19:00", 10); // Filme nulo
        } catch (SessaoInvalidaException e) {
            System.out.println(e.getMessage()); // Mensagem de erro esperada
        }

        try {
            Sessao sessaoInvalida = new Sessao(filme1, null, "19:00", 10); // Sala nula
        } catch (SessaoInvalidaException e) {
            System.out.println(e.getMessage()); // Mensagem de erro esperada
        }

        try {
            Sessao sessaoInvalida = new Sessao(filme1, sala1, "", 10); // Horário vazio
        } catch (SessaoInvalidaException e) {
            System.out.println(e.getMessage()); // Mensagem de erro esperada
        }

        try {
            Sessao sessaoInvalida = new Sessao(filme1, sala1, "19:00", -5); // Ingressos negativos
        } catch (SessaoInvalidaException e) {
            System.out.println(e.getMessage()); // Mensagem de erro esperada
        }
        System.out.println("---------------------------");

        // Teste 9: NullPointerException
        System.out.println("Teste 9: Tratamento de NullPointerException");
        Cliente cliente = null;
        try {
            System.out.println(cliente.getNome()); // Isso vai gerar um NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Exceção não verificada: " + e.getMessage());
        }
        System.out.println("---------------------------");

        // Teste 10: Alterar sessão com dados inválidos
        System.out.println("Teste 10: Alterar sessão com dados inválidos");
        try {
            sessao1.alterarSessao(null, sala1, "20:00"); // Filme nulo
        } catch (SessaoInvalidaException e) {
            System.out.println(e.getMessage()); // Mensagem de erro esperada
        }

        try {
            sessao1.alterarSessao(filme1, null, "20:00"); // Sala nula
        } catch (SessaoInvalidaException e) {
            System.out.println(e.getMessage()); // Mensagem de erro esperada
        }

        try {
            sessao1.alterarSessao(filme1, sala1, ""); // Horário vazio
        } catch (SessaoInvalidaException e) {
            System.out.println(e.getMessage()); // Mensagem de erro esperada
        }

        System.out.println("---------------------------");
    }
}