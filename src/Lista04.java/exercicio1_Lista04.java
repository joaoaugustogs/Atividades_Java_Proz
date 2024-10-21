/*
NOME: João Augusto Guimarães Silva
DICIPLINA: Desenvolvimento de Aplicações
TURMA: TCTG241CNTDEV
*/


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Pessoa {
    private int id;
    private String nome;
    private String cpf;
    private String dataNascimento;

    public Pessoa(int id, String nome, String cpf, String dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nome: " + nome + ", CPF: " + cpf + ", Data Nascimento: " + dataNascimento;
    }
}

public class exercicio1_Lista04 {
    private static final Map<Integer, Pessoa> cadastro = new HashMap<>();
    private static int proximoId = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Inserir Pessoa");
            System.out.println("2. Alterar Dados da Pessoa");
            System.out.println("3. Consultar Dados da Pessoa");
            System.out.println("4. Excluir Dados da Pessoa");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    inserirPessoa(scanner);
                    break;
                case 2:
                    alterarPessoa(scanner);
                    break;
                case 3:
                    consultarPessoa(scanner);
                    break;
                case 4:
                    excluirPessoa(scanner);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 5);
        scanner.close();
    }

    private static void inserirPessoa(Scanner scanner) {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Data de Nascimento (dd/MM/yyyy): ");
        String dataNascimento = scanner.nextLine();

        Pessoa novaPessoa = new Pessoa(proximoId++, nome, cpf, dataNascimento);
        cadastro.put(novaPessoa.getId(), novaPessoa);
        System.out.println("Pessoa inserida com sucesso!");
    }

    private static void alterarPessoa(Scanner scanner) {
        System.out.print("Digite o ID da pessoa que deseja alterar: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Pessoa pessoa = cadastro.get(id);
        if (pessoa != null) {
            System.out.print("Novo Nome (atual: " + pessoa.getNome() + "): ");
            String novoNome = scanner.nextLine();
            System.out.print("Novo CPF (atual: " + pessoa.getCpf() + "): ");
            String novoCpf = scanner.nextLine();
            System.out.print("Nova Data de Nascimento (atual: " + pessoa.getDataNascimento() + "): ");
            String novaDataNascimento = scanner.nextLine();

            pessoa.setNome(novoNome);
            pessoa.setCpf(novoCpf);
            pessoa.setDataNascimento(novaDataNascimento);
            System.out.println("Dados alterados com sucesso!");
        } else {
            System.out.println("Pessoa não encontrada!");
        }
    }

    private static void consultarPessoa(Scanner scanner) {
        System.out.print("Digite o ID da pessoa que deseja consultar: ");
        int id = scanner.nextInt();
        Pessoa pessoa = cadastro.get(id);

        if (pessoa != null) {
            System.out.println("Dados da Pessoa: " + pessoa);
        } else {
            System.out.println("Pessoa não encontrada!");
        }
    }

    private static void excluirPessoa(Scanner scanner) {
        System.out.print("Digite o ID da pessoa que deseja excluir: ");
        int id = scanner.nextInt();
        
        if (cadastro.remove(id) != null) {
            System.out.println("Pessoa excluída com sucesso!");
        } else {
            System.out.println("Pessoa não encontrada!");
        }
    }
}