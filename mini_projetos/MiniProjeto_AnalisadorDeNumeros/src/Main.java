import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá usuário!!");
        System.out.println("Esse programa irá te pedir um número e " +
                "te trará os seguintes " + "resultados:");
        System.out.println("\n*Quantidade de números pares;" +
                "\n*Quantidade de números ímpares;" +
                "\n*Soma de todos os números;" +
                "\n*Soma dos pares;" +
                "\n*Soma dos ímpares.");

        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero <= 0) {
            System.out.println("Por favor, digite um número positivo maior que zero.");
            scanner.close();
            return;
        }

        int contadorPares = 0;
        int contadorImpares = 0;
        int somaTotal = 0;
        int somaPares = 0;
        int somaImpares = 0;

        for (int i = 1; i <= numero; i++) {

            somaTotal += i;

            if (i % 2 == 0) {
                contadorPares++;
                somaPares += i;
            } else {
                contadorImpares++;
                somaImpares += i;
            }
        }

        System.out.println("Total de números pares: " + contadorPares);
        System.out.println("Total de números ímpares: " + contadorImpares);
        System.out.println("Soma Total: " + somaTotal);
        System.out.println("Soma dos pares: " + somaPares);
        System.out.println("Soma dos ímpares: " + somaImpares);

        scanner.close();
    }
}