/*Nome: João Augusto Guimarães Silva
Diciplina: Desenvolvimento de Aplicações
Turma: TCTG241CNTDEV
*/

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra:");
        String palavra = sc.nextLine();

        System.out.println("A palavra digita foi:" + palavra);
        System.out.println("A Palavra tem " + palavra.length() + " letras.");
        System.out.println("A Primeira Letra é: " + palavra.charAt(0));
        System.out.println("A última Letra é: " + palavra.charAt(palavra.length() - 1));

        int metade = palavra.length() / 2;

        if (palavra.length() % 2 == 0) {
            System.out
                    .println("As letras centrais são: " + palavra.charAt(metade - 1) + " - " + palavra.charAt(metade));
        } else {
            System.out.println("A letra central é: " + palavra.charAt(metade));
        }

        System.out.println("A palavra escrita ao contrário é: " + new StringBuilder(palavra).reverse().toString());
        System.out.println("A palavra escrita toda em letras maiúsculas é: " + palavra.toUpperCase());
        System.out.println("A palavra escrita toda em letras minúsculas é: " + palavra.toLowerCase());

        sc.close();
    }
}