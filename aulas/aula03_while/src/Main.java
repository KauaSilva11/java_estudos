import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de notas");
        System.out.println("Quantas notas deseja inserir: ");
        int numeroDeNotas = scanner.nextInt();

        int contadorDeNotas = 1;
        double soma = 0;

        while (contadorDeNotas <= numeroDeNotas){
            System.out.println("Digite a nota "+ contadorDeNotas +":");
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