/*Nome: João Augusto Guimarães Silva
Diciplina: Desenvolvimento de Aplicações
Turma: TCTG241CNTDEV
*/

import java.util.Scanner;

public class exercicio2_lista3 {

    public static void main(String[] args) {
        static final int MAX_PESSOAS = 100;
    static int contadorPessoas = 0;

    static String[][] cadastro = new String[MAX_PESSOAS][3];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Inserir pessoa");
            System.out.println("2. Alterar dados de uma pessoa");
            System.out.println("3. Consultar dados de uma pessoa");
            System.out.println("4. Excluir dados de uma pessoa");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    inserirPessoa(sc);
                    break;
                case 2:
                    alterarPessoa(sc);
                    break;
                case 3:
                    consultarPessoa(sc);
                    break;
                case 4:
                    excluirPessoa(sc);
                    break;
                case 5:
                    continuar = false;
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }

        sc.close();

    }

    public static void inserirPessoa(Scanner sc) {
        if (contadorPessoas >= MAX_PESSOAS) {
            System.out.println("Cadastro cheio! Não é possível inserir mais pessoas.");
            return;
        }

        String id = Integer.toString(contadorPessoas + 1);
        System.out.print("Digite o nome da pessoa: ");
        String nome = sc.nextLine();
        System.out.print("Digite a data de nascimento (dd/mm/aaaa): ");
        String dataNascimento = sc.nextLine();

        cadastro[contadorPessoas][0] = id;
        cadastro[contadorPessoas][1] = nome;
        cadastro[contadorPessoas][2] = dataNascimento;

        contadorPessoas++;
        System.out.println("Pessoa cadastrada com sucesso!");
    }

    public static void alterarPessoa(Scanner sc) {
        System.out.print("Digite o ID da pessoa que deseja alterar: ");
        String id = sc.nextLine();

        int indice = encontrarPessoaPorId(id);
        if (indice == -1) {
            System.out.println("Pessoa não encontrada.");
            return;
        }

        System.out.print("Digite o novo nome da pessoa: ");
        String novoNome = sc.nextLine();
        System.out.print("Digite a nova data de nascimento (dd/mm/aaaa): ");
        String novaDataNascimento = sc.nextLine();

        cadastro[indice][1] = novoNome;
        cadastro[indice][2] = novaDataNascimento;

        System.out.println("Dados da pessoa alterados com sucesso!");
    }

    public static void consultarPessoa(Scanner sc) {
        System.out.print("Digite o ID da pessoa que deseja consultar: ");
        String id = sc.nextLine();

        int indice = encontrarPessoaPorId(id);
        if (indice == -1) {
            System.out.println("Pessoa não encontrada.");
            return;
        }

        System.out.println("Dados da pessoa:");
        System.out.println("ID: " + cadastro[indice][0]);
        System.out.println("Nome: " + cadastro[indice][1]);
        System.out.println("Data de Nascimento: " + cadastro[indice][2]);
    }

    public static void excluirPessoa(Scanner sc) {
        System.out.print("Digite o ID da pessoa que deseja excluir: ");
        String id = sc.nextLine();

        int indice = encontrarPessoaPorId(id);
        if (indice == -1) {
            System.out.println("Pessoa não encontrada.");
            return;
        }

        for (int i = 0; i < 3; i++) {
            cadastro[indice][i] = null;
        }

        System.out.println("Dados da pessoa excluídos com sucesso!");
    }

    public static int encontrarPessoaPorId(String id) {
        for (int i = 0; i < contadorPessoas; i++) {
            if (cadastro[i][0] != null && cadastro[i][0].equals(id)) {
                return i;
            }
        }
        return -1;
    }
}