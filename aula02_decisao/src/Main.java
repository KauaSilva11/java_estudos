import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, qual é o seu nome?");
        String nome = scanner.nextLine();

        System.out.println("Qual a sua idade:");
        int idade = scanner.nextInt();

        boolean temPermissaoParaDirigir = podeDirigir(idade);
        boolean temPermissãoParaBeber = podeBeber(idade);

        if (temPermissãoParaBeber){
            System.out.println(nome +", você pode dirigir e beber, mas se beber, não dirija.");
        }
        if (temPermissaoParaDirigir) {
            System.out.println(nome +", você pode dirigir, mas não tem idade para beber;");
        }
        else {
            System.out.println(nome +", você não pode dirigir e não pode beber.");
        }

        scanner.close();
    }

    public static boolean podeDirigir(int idade){
        return idade >= 18;
    }

    public static boolean podeBeber(int idade){
        return idade >= 21;
    }
}