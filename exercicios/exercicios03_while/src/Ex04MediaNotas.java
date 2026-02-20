import java.util.Scanner;

/**
 * EX04 - Cálculo de Média com While
 *
 * Enunciado:
 * Criar um programa que:
 * 1) Pergunte quantas notas o usuário deseja inserir
 * 2) Use while para receber as notas
 * 3) Some todas as notas
 * 4) Calcule a média
 * 5) Trate o caso onde a quantidade seja 0 (evitar divisão por zero)
 *
 * Exemplo:
 * Quantas notas? 3
 * Nota 1: 7
 * Nota 2: 8
 * Nota 3: 9
 *
 * Saída esperada:
 * Média: 8.0
 */

public class Ex04MediaNotas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de notas");
        System.out.println("Quantas notas deseja inserir:");
        int numeroDeNotas = scanner.nextInt();

        int contadorDeNotas = 1;
        double soma = 0;

        while (contadorDeNotas <= numeroDeNotas) {

            System.out.println("Digite a nota " + contadorDeNotas + ":");
            double nota = scanner.nextDouble();

            soma += nota;
            contadorDeNotas++;
        }

        if (numeroDeNotas > 0) {
            double media = soma / numeroDeNotas;
            System.out.println("Média: " + media);
        } else {
            System.out.println("Não é possível calcular média.");
        }

        scanner.close();
    }
}
