import java.util.Scanner;

public class Ex02DivisiveisPor3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();
        int contador = 0;

        for (int i = 1; i <= numero; i++){
            if (i % 3 == 0){
                contador++;
            }
        }
        System.out.println("Quantidade de números divisíveis por 3: "+ contador);

        scanner.close();
    }
}
