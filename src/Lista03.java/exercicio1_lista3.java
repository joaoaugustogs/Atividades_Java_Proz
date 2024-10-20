/*Nome: João Augusto Guimarães Silva
Diciplina: Desenvolvimento de Aplicações
Turma: TCTG241CNTDEV
*/

import java.util.Arrays;
import java.util.Random;

public class exercicio1_lista3 {

    public static void main(String[] args) {
        
    int[] numeros = new int[10];
    Random ran = new Random();

    for (int i = 0; i < numeros.length; i++) {
        numeros[i] = ran.nextInt(10);
    }

    System.out.println("Lista com os números obtidos:");
    System.out.println(Arrays.toString(numeros));

    Arrays.sort(numeros);
    System.out.println("\nLista em ordem crescente:");
    System.out.println(Arrays.toString(numeros));

    System.out.println("\nLista em ordem decrescente:");
    for (int i = numeros.length - 1; i >= 0; i--) {
        System.out.print(numeros[i] + " ");
    }
    }
}