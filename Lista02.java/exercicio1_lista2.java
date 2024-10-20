/*Nome: João Augusto Guimarães Silva
Diciplina: Desenvolvimento de Aplicações
Turma: TCTG241CNTDEV
*/

import java.util.Scanner;

public class exercicio1_lista2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        float numero1 = 0;
        float numero2 = 0;
        float resultado = 0;;

        System.out.println("Selecione o operador aritimético : ");
        System.out.println("Digite 1 - Soma");
        System.out.println("Digite 2 - Subtração");
        System.out.println("Digite 3 - Multiplicação");
        System.out.println("Digite 4 - Divisão");
        System.out.println("Digite 5 - Sair");
        System.out.print("Informe o numero: ");
        int escolha = sc.nextInt();

        while (escolha > 5) {
            System.out.println("Você digitou um número inválido!\nInforme um número válido: ");
            escolha = sc.nextInt();
        }

        if (escolha == 1){
            System.out.println("Digite o número à ser somado:");
                numero1 = sc.nextFloat();
            System.out.println("Digite o número para somar:");
                numero2 = sc.nextFloat();
            resultado = numero1 + numero2;
            System.out.println("A soma dos números foi: " + resultado);
        }
        else if (escolha == 2){
            System.out.println("Digite o número à ser subtraído:");
                numero1 = sc.nextFloat();
            System.out.println("Digite o número para subtrair:");
                numero2 = sc.nextFloat();
            resultado = numero1 - numero2;
            System.out.println("A Subtração dos números foi: " + resultado);
        }
        else if (escolha == 3){
            System.out.println("Digite o número à ser multiplicado:");
                numero1 = sc.nextFloat();
            System.out.println("Digite o número para multiplicar:");
                numero2 = sc.nextFloat();
            resultado = numero1 * numero2;
            System.out.println("A multiplicação dos números foi: " + resultado);
        }
        else if (escolha == 4){
            System.out.println("Digite o número à ser dividido:");
                numero1 = sc.nextFloat();
            System.out.println("Digite o número para dividir:");
                numero2 = sc.nextFloat();
            resultado = numero1 / numero2;
            System.out.println("A soma dos números foi: " + resultado);
        }
        else if (escolha == 5){
            System.out.println("Programa encerrado!");
        }
    }
}