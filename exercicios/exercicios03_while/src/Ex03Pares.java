import java.util.Scanner;

/**
 * EX03 - Mostrar números pares até N
 *
 * Enunciado:
 * Criar um programa que:
 * 1) Pergunte um número N
 * 2) Use while
 * 3) Mostre apenas os números pares de 1 até N
 *
 * Exemplo:
 * Se N = 10
 * Saída esperada:
 * 2
 * 4
 * 6
 * 8
 * 10
 */

public class Ex03Pares {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = scanner.nextInt();

        int contador = 2;

        while (contador <= numero) {
            System.out.println(contador);
            contador += 2;
        }

        scanner.close();
    }
}
