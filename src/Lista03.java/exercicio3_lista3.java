/*Nome: João Augusto Guimarães Silva
Diciplina: Desenvolvimento de Aplicações
Turma: TCTG241CNTDEV
*/

import java.util.Random;
import java.util.Scanner;

public class exercicio3_lista3 {
    private static final char VAZIO = ' ';
    private static final char JOGADOR = 'X';
    private static final char COMPUTADOR = 'O';
    private char[][] tabuleiro;
    private Scanner scanner;

    public exercicio3_lista3() {
        tabuleiro = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = VAZIO;
            }
        }
        scanner = new Scanner(System.in);
    }

    public void imprimirTabuleiro() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j]);
                if (j < 2) System.out.print(" | ");
            }
            System.out.println();
            if (i < 2) System.out.println("---------");
        }
    }

    public boolean verificarVencedor(char jogador) {
        for (int i = 0; i < 3; i++) {
            if ((tabuleiro[i][0] == jogador && tabuleiro[i][1] == jogador && tabuleiro[i][2] == jogador) || 
                (tabuleiro[0][i] == jogador && tabuleiro[1][i] == jogador && tabuleiro[2][i] == jogador)) {
                return true;
            }
        }
        return (tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador) ||
               (tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador);
    }

    public boolean verificarEmpate() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == VAZIO) return false;
            }
        }
        return true;
    }

    public int[] obterMovimentosDisponiveis() {
        int[][] movimentos = new int[9][2];
        int count = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == VAZIO) {
                    movimentos[count][0] = i;
                    movimentos[count][1] = j;
                    count++;
                }
            }
        }
        return count == 0 ? null : new int[]{movimentos[new Random().nextInt(count)][0], movimentos[new Random().nextInt(count)][1]};
    }

    public int[] movimentoDificil() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == VAZIO) {
                    tabuleiro[i][j] = COMPUTADOR;
                    if (verificarVencedor(COMPUTADOR)) {
                        return new int[]{i, j};
                    }
                    tabuleiro[i][j] = VAZIO;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == VAZIO) {
                    tabuleiro[i][j] = JOGADOR;
                    if (verificarVencedor(JOGADOR)) {
                        tabuleiro[i][j] = VAZIO;
                        return new int[]{i, j};
                    }
                    tabuleiro[i][j] = VAZIO;
                }
            }
        }

        if (tabuleiro[1][1] == VAZIO) return new int[]{1, 1};

        int[][] esquinas = {{0, 0}, {0, 2}, {2, 0}, {2, 2}};
        for (int[] esquina : esquinas) {
            if (tabuleiro[esquina[0]][esquina[1]] == VAZIO) return esquina;
        }

        int[][] lados = {{0, 1}, {1, 0}, {1, 2}, {2, 1}};
        for (int[] lado : lados) {
            if (tabuleiro[lado[0]][lado[1]] == VAZIO) return lado;
        }

        return null;
    }

    public void jogar(String modo) {
        while (true) {
            imprimirTabuleiro();
            if (modo.equalsIgnoreCase("normal")) {
                System.out.print("Digite sua jogada (linha e coluna, como '1 2'): ");
                String input = scanner.nextLine();
                String[] partes = input.split(" ");
                int linha = Integer.parseInt(partes[0]) - 1;
                int coluna = Integer.parseInt(partes[1]) - 1;
                if (tabuleiro[linha][coluna] != VAZIO) {
                    System.out.println("Posição já ocupada. Tente novamente.");
                    continue;
                }
                tabuleiro[linha][coluna] = JOGADOR;
            } else {
                int[] movimento = movimentoDificil();
                tabuleiro[movimento[0]][movimento[1]] = COMPUTADOR;
                System.out.println("O computador jogou na posição: " + (movimento[0] + 1) + " " + (movimento[1] + 1));
            }

            if (verificarVencedor(JOGADOR)) {
                imprimirTabuleiro();
                System.out.println("Você ganhou!");
                break;
            }
            if (verificarEmpate()) {
                imprimirTabuleiro();
                System.out.println("É um empate!");
                break;
            }

            int[] movimento = (modo.equalsIgnoreCase("dificil")) ? movimentoDificil() : obterMovimentosDisponiveis();
            if (movimento != null) {
                tabuleiro[movimento[0]][movimento[1]] = COMPUTADOR;
                if (verificarVencedor(COMPUTADOR)) {
                    imprimirTabuleiro();
                    System.out.println("O computador ganhou!");
                    break;
                }
            }
            if (verificarEmpate()) {
                imprimirTabuleiro();
                System.out.println("É um empate!");
                break;
            }
        }
    }

    public static void main(String[] args) {
        exercicio3_lista3 jogo = new exercicio3_lista3();
        String continuar;
        do {
            System.out.print("Escolha o modo de jogo (normal/dificil): ");
            String modo = jogo.scanner.nextLine();
            jogo.jogar(modo);
            System.out.print("Deseja jogar novamente? (s/n): ");
            continuar = jogo.scanner.nextLine();
        } while (continuar.equalsIgnoreCase("s"));
    }
}
