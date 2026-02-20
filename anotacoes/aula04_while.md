# Aula 04 – Estrutura de Repetição FOR

🎯 Objetivo da Aula

Aprender a utilizar a estrutura `for`, entender sua organização, diferença em relação ao `while` e aplicar em problemas práticos como soma, pares e fatorial.



## 📌 1️⃣ O que é o FOR?

O `for` é uma estrutura de repetição utilizada quando sabemos:

- Onde começa
- Onde termina
- Como a variável será atualizada

Estrutura básica:

````
for (inicializacao; condicao; atualizacao) {
    // código
}
````
📌 2️⃣ Comparação com WHILE

While:

int i = 1;
````
while (i <= 5) {
    System.out.println(i);
    i++;
}
````
For:
````
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
````
Diferença principal:

while separa inicialização, condição e atualização

for organiza tudo em uma única linha

📌 3️⃣ Controle com < e <=

Exemplo:
````
for (int i = 0; i < 5; i++)
````
Imprime:
0 1 2 3 4

Exemplo:
````
for (int i = 0; i <= 5; i++)
````
Imprime:
0 1 2 3 4 5

A diferença está na inclusão ou não do último valor.

📌 4️⃣ Decremento

Também é possível contar de forma regressiva:
````
for (int i = 10; i >= 1; i--) {
    System.out.println(i);
}
````
📌 5️⃣ Uso com Condição (if)

Exemplo mostrando apenas pares:
````
for (int i = 1; i <= n; i++) {
    if (i % 2 == 0) {
        System.out.println(i);
    }
}
````
📌 6️⃣ Soma com FOR
````
int soma = 0;

for (int i = 1; i <= n; i++) {
    soma += i;
}
````
📌 7️⃣ Fatorial com FOR
````
int fatorial = 1;

if (n < 0) {
    System.out.println("Fatorial não existe para números negativos.");
} else {
    for (int i = 1; i <= n; i++) {
        fatorial *= i;
    }
}
````
💡 Conceitos Consolidados

Estrutura do for

Organização da repetição

Controle de início e fim

Incremento e decremento

Uso combinado com if

Variável acumuladora

Validação de entrada

Pensamento algorítmico