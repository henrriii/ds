/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author Aluno CA
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        double num1, num2, resultado;
        char operacao;

        System.out.print("Digite o primeiro número: ");
        num1 = scanner.nextDouble();

        System.out.print("Digite a operação (+, -, *, /): ");
        operacao = scanner.next().charAt(0);

        System.out.print("Digite o segundo número: ");
        num2 = scanner.nextDouble();

        switch (operacao) {
            case '+' -> resultado = num1 + num2;
            case '-' -> resultado = num1 - num2;
            case '*' -> resultado = num1 * num2;
            case '/' -> resultado = num1 / num2;
            default -> {
                System.out.println("Operação inválida!");
                return;
            }
        }
        System.out.println("Resultado: " + resultado);
    }
}
    
    

