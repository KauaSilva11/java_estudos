import java.util.Scanner;

/**
 * EX02 - Soma de 1 até N
 *
 * Enunciado:
 * Criar um programa que:
 * 1) Pergunte um número N
 * 2) Some todos os números de 1 até N usando while
 * 3) Mostre o resultado final
 *
 * Exemplo:
 * Se N = 5
 * Resultado esperado: 15
 */

public class Ex02SomaN {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = scanner.nextInt();

        int contador = 1;
        int soma = 0;

        while (contador <= numero) {
            soma += contador;
            contador++;
        }

        System.out.println("Soma total: " + soma);

        scanner.close();
    }
}
