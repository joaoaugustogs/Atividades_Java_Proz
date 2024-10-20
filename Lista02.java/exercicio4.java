/*Nome: João Augusto Guimarães Silva
Diciplina: Desenvolvimento de Aplicações
Turma: TCTG241CNTDEV
*/

import java.util.Scanner;

public class exercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de elementos da série de Fibonacci: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Por favor, insira um número positivo.");
        } else {
            System.out.println("Série de Fibonacci com " + n + " elementos:");
            printexercicio4(n);
        }

        scanner.close();
    }

    public static void printexercicio4(int n) {
        int a = 0, b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de elementos da série de Fibonacci: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Por favor, insira um número positivo.");
        } else {
            System.out.println("Série de Fibonacci com " + n + " elementos:");
            printFibonacci(n);
        }

        scanner.close();
    }

    public static void printFibonacci(int n) {
        int a = 0, b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
    }
}