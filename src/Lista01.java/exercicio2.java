/*Nome: João Augusto Guimarães Silva
Diciplina: Desenvolvimento de Aplicações
Turma: TCTG241CNTDEV
*/

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        boolean isPrimo = true;

        if (numero % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }

        if (numero < 0 ) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é positivo.");
        }

        if (numero <= 1) {
            isPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    isPrimo = false;
                    break;
                }
            }
        }

        if (isPrimo) {
            System.out.println("O número é primo.");
        } else {
            System.out.println("O número não é primo.");
        }

        double elevacao = Math.pow(numero, 3);
        System.out.println("Seu número elevado a 3 é: " + elevacao);

        if (numero < 0) {
            System.out.println("Não é possivel calcular a raiz quadrada deste número");
        }else {
            Double raiz = Math.sqrt(numero);
            System.out.println("A raiz quadrada do seu número é: " + raiz);
        }

        sc.close();
    }
}
