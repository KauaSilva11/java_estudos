import java.util.Scanner;

public class Ex04SomaImpares {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();
        int soma = 0;

        for (int i = 1; i <= numero; i++){
            if (i % 2 != 0){
             soma += i;
                System.out.println(i);
            }
        }
        System.out.println("Soma total:"+ soma);

        scanner.close();
    }
}
