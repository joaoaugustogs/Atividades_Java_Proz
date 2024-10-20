/*Nome: João Augusto Guimarães Silva
Diciplina: Desenvolvimento de Aplicações
Turma: TCTG241CNTDEV
*/

import java.util.Random;
import java.util.Scanner;

public class exercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();

        int numeroAleatorio = ran.nextInt(11);

        System.out.println("Tete adivinhar o número de 0 à 10!");
        System.out.print("Digite: ");

        while (true) {
            int numeroDigitado = sc.nextInt();

            if (numeroDigitado == numeroAleatorio) {
                System.out.println("ACERTOUUUUUUUUU!!!!");
                break;
            }

            else if (numeroDigitado > numeroAleatorio) {
                System.out.println("O numero é menor!\nDigite outro número:");
            }

            else if (numeroDigitado < numeroAleatorio) {
                System.out.println("O numero é maior!\nDigite outro número:");
            }

        }
        sc.close();
    }
}