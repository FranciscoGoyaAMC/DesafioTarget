# Desafio de Lógica de Programação

Este repositório contém a resolução de um desafio de lógica de programação, que inclui a verificação de números na sequência de Fibonacci, contagem de caracteres em uma string e questões teóricas sobre padrões numéricos e lógica.

## 📌 Descrição do Desafio

O desafio foi dividido em cinco partes:

### 1️⃣ Verificação de Números na Sequência de Fibonacci

Desenvolvemos um programa em Java que verifica se um número informado pelo usuário pertence à sequência de Fibonacci.

- A sequência de Fibonacci inicia-se com 0 e 1.
- Cada número subsequente é a soma dos dois anteriores.
- O programa recebe um número como entrada e informa se ele pertence ou não à sequência.

### 2️⃣ Contagem de Letras 'A' em uma String

Criamos um método que recebe uma string digitada pelo usuário e retorna a quantidade de vezes que a letra 'a' (maiúscula ou minúscula) aparece nela.

### 3️⃣ Cálculo do Valor de uma Variável em um Loop

Analisamos um trecho de código e determinamos o valor final de uma variável após a execução de um loop:

```java
int INDICE = 12, SOMA = 0, K = 1;
enquanto K < INDICE faça {
    K = K + 1;
    SOMA = SOMA + K;
}
```

O resultado final de `SOMA` foi **77**.

### 4️⃣ Identificação de Padrões Numéricos

Completamos sequências numéricas com base em padrões identificados:

- **1, 3, 5, 7, _9_** (Números ímpares)
- **2, 4, 8, 16, 32, 64, _128_** (Potências de 2)
- **0, 1, 4, 9, 16, 25, 36, _49_** (Quadrados perfeitos)
- **4, 16, 36, 64, _100_** (Quadrados de números pares)
- **1, 1, 2, 3, 5, 8, _13_** (Sequência de Fibonacci)
- **2, 10, 12, 16, 17, 18, 19, _20_** (Padrão baseado na soma de 12 a partir da quarta posição)

### 5️⃣ Desafio dos Interruptores e Lâmpadas

Criamos uma estratégia para identificar a qual interruptor cada lâmpada está conectada, utilizando apenas duas idas às salas das lâmpadas.

## 🚀 Como Executar o Código

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/FranciscoGoyaAMC/DesafioTarget.git
   ```
2. **Compile e execute o código em Java**:
   ```bash
   javac Desafio.java
   java Desafio
   ```
3. **Siga as instruções no terminal para testar as funcionalidades**.

## 🤝 Contribuições

Contribuições são bem-vindas! Caso tenha sugestões de melhorias, abra uma *issue* ou envie um *pull request*.

---

📌 Desenvolvido por **[Francisco Goya](https://github.com/FranciscoGoyaAMC)** como parte de um desafio técnico para entrevista de emprego.
