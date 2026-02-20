# Aula 03 – Estrutura de Repetição WHILE

🎯 Objetivo da Aula

Aprender como funciona a estrutura de repetição `while`, entender controle de fluxo, variável de controle, acumulador e prevenção de loop infinito.

---

## 📌 1️⃣ O que é o while?

O `while` é uma estrutura de repetição que executa um bloco de código enquanto uma condição for verdadeira.

Estrutura básica:

````
while (condicao) {
    // código que será repetido
}
````
O teste da condição acontece antes da execução.

Se a condição começar falsa, o bloco nem será executado.

📌 2️⃣ Estrutura completa de um while

Todo while precisa de:

1️⃣ Inicialização
2️⃣ Condição
3️⃣ Atualização

Exemplo:
````
int numero = 1;

while (numero <= 5) {
    System.out.println(numero);
    numero++;
}
📌 3️⃣ Loop Infinito
Se a variável de controle não for atualizada corretamente, o laço pode nunca terminar.

Exemplo de erro:

int numero = 1;

while (numero <= 5) {
    System.out.println(numero);
}
````
Isso gera loop infinito porque numero nunca muda.

📌 4️⃣ Variável Acumuladora
Uma variável acumuladora começa com 0 e vai somando valores dentro do loop.

Exemplo:
````
int soma = 0;

while (numero != 0) {
    soma += numero;
}
````
📌 5️⃣ Separação entre Regra e Controle
Dentro do while:

Atualização da variável de controle deve acontecer sempre

Regras internas podem estar dentro de if

Exemplo correto:
````
while (numero != 0) {

    if (numero > 0) {
        soma += numero;
    }

    numero = scanner.nextInt();
}
````
📌 6️⃣ Validação após o Loop
Nem sempre o loop executa.

É importante validar antes de fazer operações como divisão.

Exemplo:
````
if (quantidade > 0) {
    double media = soma / quantidade;
}
````
💡 Conceitos Aprendidos
Estrutura do while

Condição de parada

Variável de controle

Variável acumuladora

Loop infinito

Validação pós-loop

Pensamento passo a passo