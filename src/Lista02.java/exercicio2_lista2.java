/*Nome: João Augusto Guimarães Silva
Diciplina: Desenvolvimento de Aplicações
Turma: TCTG241CNTDEV
*/

import java.util.Scanner;

public class exercicio2_lista2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar;

        do {
            System.out.print("Digite o valor 'A' (que corresponde a 'B'): ");
            double A = scanner.nextDouble();
            System.out.print("Digite o valor 'B': ");
            double B = scanner.nextDouble();
            System.out.print("Digite o valor 'C' (para calcular o valor correspondente a D): ");
            double C = scanner.nextDouble();

            double D = (B * C) / A;
            System.out.println("O valor correspondente D é: " + D);

            System.out.print("Deseja calcular novamente? (s/n): ");
            continuar = scanner.next();
        } while (continuar.equalsIgnoreCase("s"));

        System.out.println("Programa encerrado. Até logo!");
        scanner.close();
    }
}