package Calculadora;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);

        int valor1, valor2, operadores;

        while (true) {
            try {
                System.out.println("*************CALCULADORA*************");
                System.out.println("1*************SOMA*************");
                System.out.println("2*************SUBTRAÇÃO*************");
                System.out.println("3*************MULTIPLICAÇÃO*************");
                System.out.println("4*************DIVISÃO*************");
                System.out.println("5*************SAIR******************");

                operadores = teclado.nextInt();

                switch (operadores) {
                    case 1:
                        System.out.println("Beleza, vamos somar!");
                        System.out.println("Digite o primeiro valor: ");
                        valor1 = teclado.nextInt();
                        System.out.println("Digite o segundo valor: ");
                        valor2 = teclado.nextInt();
                        System.out.println("Soma, a soma dos dois valores é: " + (valor1 + valor2));
                        break;
                    case 2:
                        System.out.println("Beleza, vamos subtrair!");
                        System.out.println("Digite o primeiro valor: ");
                        valor1 = teclado.nextInt();
                        System.out.println("Digite o segundo valor: ");
                        valor2 = teclado.nextInt();
                        System.out.println("Subtração, a subtração dos dois valores é: " + (valor1 - valor2));
                        break;
                    case 3:
                        System.out.println("Beleza, vamos multiplicar!");
                        System.out.println("Digite o primeiro valor: ");
                        valor1 = teclado.nextInt();
                        System.out.println("Digite o segundo valor: ");
                        valor2 = teclado.nextInt();
                        System.out.println("Multiplicação, a multiplicação dos dois valores é: " + (valor1 * valor2));
                        break;
                    case 4:
                        System.out.println("Beleza, vamos dividir!");
                        System.out.println("Digite o primeiro valor: ");
                        valor1 = teclado.nextInt();
                        System.out.println("Digite o segundo valor: ");
                        valor2 = teclado.nextInt();
                        if (valor2 != 0) {
                            System.out.println("Divisão, a divisão dos dois valores é: " + (valor1 / valor2));
                        } else {
                            System.out.println("Divisão por zero.");
                        }
                        break;
                    case 5:
                        System.out.println("Beleza, vamos sair!");
                        System.out.println("Fechando a calculadora");
                        teclado.close();
                        return;
                    default:
                        System.out.println("Nenhuma opção válida.");
                }
                System.out.println("**********************");
            } catch (InputMismatchException e) {
                System.out.println("Erro: você deve digitar um número inteiro.");
                teclado.nextLine();
            }
        }
    }
}
