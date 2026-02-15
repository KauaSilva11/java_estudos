Aula 02 – Estruturas de Decisão (if, else e boolean)

🎯 Objetivo da Aula

Aprender a trabalhar com decisões no Java utilizando boolean, if, else e organização de regras de negócio.

📌 1️⃣ Tipo boolean

O tipo boolean representa apenas dois valores possíveis:

true

false

Exemplo:
````
boolean maiorDeIdade = true;
boolean podeDirigir = false;
````

Normalmente boolean é usado para representar regras, permissões ou condições.

📌 2️⃣ Operadores Relacionais

São usados para comparar valores.

Principais operadores:

>= maior ou igual

<= menor ou igual

> maior

< menor

== igual

!= diferente

Exemplo:
````
return idade >= 18;
````

A expressão acima já retorna true ou false.

📌 3️⃣ Estrutura if / else

Permite executar blocos diferentes dependendo da condição.

Estrutura básica:
````
if (condicao) {
    // executa se for true
} else {
    // executa se for false
}
````

Exemplo:
````
if (idade >= 18) {
    System.out.println("Você é maior de idade.");
} else {
    System.out.println("Você é menor de idade.");
}
````
📌 4️⃣ Método retornando boolean

Podemos criar métodos que devolvem true ou false.

Exemplo:
````
public static boolean podeDirigir(int idade) {
    return idade >= 18;
}
````

Chamando no main:
````
boolean temPermissaoParaDirigir = podeDirigir(idade);
````
📌 5️⃣ Múltiplas Regras Independentes

Boa prática: criar métodos separados para cada regra.

Exemplo:
````
public static boolean podeDirigir(int idade) {
    return idade >= 18;
}

public static boolean podeBeber(int idade) {
    return idade >= 21;
}
````

Isso permite:

Melhor organização

Fácil manutenção

Facilidade para adicionar novas regras futuramente

📌 6️⃣ Organização com if independentes

Quando as regras são independentes, podemos usar if separados:
````
if (podeDirigir) {
    System.out.println("Pode dirigir.");
}

if (podeBeber) {
    System.out.println("Pode beber.");
}
````

Esse modelo facilita escalabilidade.

📌 7️⃣ Quando usar if / else if / else

Use else if quando as condições forem excludentes.

Exemplo:
````
if (podeBeber) {
    System.out.println("Pode dirigir e beber.");
} else if (podeDirigir) {
    System.out.println("Pode dirigir, mas não pode beber.");
} else {
    System.out.println("Não pode dirigir nem beber.");
}
````

Nesse caso apenas uma mensagem será exibida.

📌 8️⃣ Separação de responsabilidades

Boa prática:

main → controla fluxo e entrada de dados

Métodos → contêm regras de negócio

💡 Código Final da Aula
````
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, qual é o seu nome?");
        String nome = scanner.nextLine();

        System.out.println("Qual a sua idade:");
        int idade = scanner.nextInt();

        boolean podeDirigir = podeDirigir(idade);
        boolean podeBeber = podeBeber(idade);

        if (podeBeber) {
            System.out.println(nome + ", você pode dirigir e beber, mas se beber, não dirija.");
        } else if (podeDirigir) {
            System.out.println(nome + ", você pode dirigir, mas não tem idade para beber.");
        } else {
            System.out.println(nome + ", você não pode dirigir e não pode beber.");
        }

        scanner.close();
    }

    public static boolean podeDirigir(int idade) {
        return idade >= 18;
    }

    public static boolean podeBeber(int idade) {
        return idade >= 21;
    }
}
````
🚀 Conclusão

Nesta aula aprendemos:

Tipo boolean

Operadores relacionais

Estrutura if / else

Métodos que retornam boolean

Organização de regras independentes

Diferença entre if independente e else if

Separação entre fluxo e regra de negócio