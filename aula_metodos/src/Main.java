import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome completo: ");
        String nome = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        mostrarNome(nome);
        mostrarIdade(idade);
        mostrarMensagemFinal(nome,idade);

        scanner.close();
    }

    public static void mostrarNome(String nome){
        System.out.println(nome);
    }

    public static void mostrarIdade(int idade){
        System.out.println("Idade: "+ idade +" Anos.");
    }

    public static void mostrarMensagemFinal(String nome, int idade){
        System.out.println(nome +", com "+ idade +" anos, está estudando Java rumo ao mercado.");
    }
}