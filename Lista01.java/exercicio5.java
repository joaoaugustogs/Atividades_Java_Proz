/*Nome: João Augusto Guimarães Silva
Diciplina: Desenvolvimento de Aplicações
Turma: TCTG241CNTDEV
*/

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a nota de 0 à 100:");
        double nota = sc.nextDouble();

        if (nota > 90){
            System.out.println("CONCEITO A: Sua nota é maior que 90");
        }
        else if (nota > 80 && nota <=90){
            System.out.println("CONCEITO B: Sua nota está entre 81 e 90");
        }
        else if (nota > 70 && nota <=80){
            System.out.println("CONCEITO C: Sua nota está entre 71 e 80");
        }
        else if (nota > 60 && nota <=70){
            System.out.println("CONCEITO D: Sua nota está entre 61 e 70");
        }
        else if (nota < 60){
            System.out.println("CONCEITO E: Sua nota é menor que 60");
        }

    }
}