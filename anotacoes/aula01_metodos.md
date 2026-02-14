Aula 01 – Métodos em Java
🎯 Objetivo da Aula

Aprender a organizar código usando métodos, entender retorno, parâmetros e escopo.

📌 1️⃣ O que é um método?

Um método é um bloco de código que executa uma tarefa específica.

Estrutura básica:
````
public static void nomeMetodo() {
// código
}
````
📌 2️⃣ Método void

Um método void não retorna valor.

Exemplo:
````
public static void mostrarNome(String nome) {
System.out.println(nome);
}
````
📌 3️⃣ Método com retorno

Quando o método precisa devolver um valor, usamos um tipo diferente de void.

Exemplo:
````
public static int mostrarIdade() {
return 23;
}
````

Se o método tem tipo diferente de void, o return é obrigatório.

Se não houver return, ocorre erro:

missing return statement

📌 4️⃣ Escopo de variável

Variáveis existem apenas dentro do bloco onde foram declaradas.

Exemplo:
````
public static int exemplo() {
int numero = 10;
return numero;
}
````

A variável numero só existe dentro desse método.

Mesmo nome de variável pode ser usado em métodos diferentes sem conflito.

📌 5️⃣ Métodos com parâmetros

Parâmetros permitem que o método receba dados externos.

Exemplo:
````
public static void mostrarIdade(int idade) {
System.out.println("Idade: " + idade + " anos");
}


Chamando no main:

mostrarIdade(23);
````
📌 6️⃣ Integração com Scanner

Entrada de dados deve ficar no main.

Exemplo:
````
Scanner scanner = new Scanner(System.in);

System.out.print("Digite seu nome: ");
String nome = scanner.nextLine();

System.out.print("Digite sua idade: ");
int idade = scanner.nextInt();

mostrarNome(nome);
mostrarIdade(idade);
mostrarMensagemFinal(nome, idade);

scanner.close();
````
📌 7️⃣ Separação de responsabilidades

Boa prática:

main → controla fluxo e entrada

Métodos → executam tarefas específicas

💡 Código Final da Aula
```
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        mostrarNome(nome);
        mostrarIdade(idade);
        mostrarMensagemFinal(nome, idade);

        scanner.close();
    }

    public static void mostrarNome(String nome) {
        System.out.println(nome);
    }

    public static void mostrarIdade(int idade) {
        System.out.println("Idade: " + idade + " anos.");
    }

    public static void mostrarMensagemFinal(String nome, int idade) {
        System.out.println(nome + ", com " + idade + " anos, está estudando Java rumo ao mercado.");
    }
}
```
🚀 Conclusão

Nesta aula aprendemos:

Métodos void

Métodos com retorno

Uso de return

Escopo

Parâmetros

Scanner integrado com métodos

Organização de código