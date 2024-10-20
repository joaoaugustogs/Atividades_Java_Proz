/*Nome: João Augusto Guimarães Silva
Diciplina: Desenvolvimento de Aplicações
Turma: TCTG241CNTDEV
*/

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor da compra: ");
        float valorCheio = sc.nextFloat();

        System.out.print("Informe o valor do desconto em porcentagem: ");
        float desconto = sc.nextFloat();

        double valorDesconto = valorCheio * (desconto / 100);

        System.out.println("O valor cheio é: R$ " + valorCheio + "\nO valor do desconto: R$ " + valorDesconto + "\nO novo valor é: R$" + (valorCheio - valorDesconto));

    }
}