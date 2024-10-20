/*Nome: João Augusto Guimarães Silva
Diciplina: Desenvolvimento de Aplicações
Turma: TCTG241CNTDEV
*/

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] notas = new double[5];
        double soma = 0;
        double maiorNota = Double.NEGATIVE_INFINITY;
        double menorNota = Double.POSITIVE_INFINITY;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a nota " + (i + 1) + " (0 a 10): ");
            double nota = sc.nextDouble();

            while (nota < 0 || nota > 10) {
                System.out.print("Nota inválida! Digite novamente (0 a 10): ");
                nota = sc.nextDouble();
            }

            notas[i] = nota;
            soma += nota;

            if (nota > maiorNota) {
                maiorNota = nota;
            }
            if (nota < menorNota) {
                menorNota = nota;
            }
        }

        // Cálculo da média
        double media = soma / notas.length;

        // Resultados
        System.out.println("Maior nota: " + maiorNota);
        System.out.println("Menor nota: " + menorNota);
        System.out.println("Média das notas: " + media);

        sc.close();
    }
}