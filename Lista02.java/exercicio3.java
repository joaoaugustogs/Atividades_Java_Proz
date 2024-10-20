/*Nome: João Augusto Guimarães Silva
Diciplina: Desenvolvimento de Aplicações
Turma: TCTG241CNTDEV
*/

public class exercicio3 {
        public static void main(String[] args) {
            System.out.println("Números de 1 a 1000 que, quando divididos por 11, têm resto 5:");
            
            for (int i = 1; i <= 1000; i++) {
                if (i % 11 == 5) {
                    System.out.println(i);
            }
        }
    }
}
