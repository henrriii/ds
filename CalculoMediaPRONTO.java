
package calculomedia;

import java.util.Scanner;

public class CalculoMedia {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String a= "erick douglas ";
        System.out.print("Seja Bem Vindo, " +a + "\n");
        System.out.print("Digite sua Primeira Nota: ");
        int nota1 = sc.nextInt();
        System.out.print("Digite sua Segunda Nota: ");
        int nota2 = sc.nextInt();
        System.out.print("Digite sua Terceira Nota: ");
        int nota3 = sc.nextInt();
        System.out.print("Sua Média Final Foi: " +(nota1 + nota2 + nota3 ) /3);
    }
    
}
