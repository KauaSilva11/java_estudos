import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n = scanner.nextInt();
        int fatorial = 1;

        if (n < 0) {
            System.out.println("Fatorial não existe para números negativos.");
        } else {
            for (int i = 1; i <= n; i++) {
                    fatorial *= i;
            }
            System.out.println("O fatorial de "+ n +": "+ fatorial);
        }
        scanner.close();
    }
}

