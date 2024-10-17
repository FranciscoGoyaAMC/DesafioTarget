// Importando scanner para ler o valor digitado
import java.util.Scanner;

// Criando a classe desafio com os métodos para verificar a sequêcia Fibonacci e contar a quantidade de a's em uma string
public class Desafio{

    /*
     1) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência. 
     */

    // Método para verificar se o número pertence à sequência de Fibonacci
    public static boolean isFibonacci(int num) {
        // Os primeiros dois números da sequência
        int a = 0, b = 1;
        // Caso o número seja 0 ou 1, ele pertence à sequência
        if (num == 0 || num == 1) {
            return true;
        }
        // Gerar a sequência de Fibonacci até encontrar o número ou ultrapassá-lo
        int prox = a + b;
        // Laço para testar os valores, caso o próximo valor da sequência seja menor que o número digitado o laço segue
        while (prox <= num) {
            // Condicional para caso o número digitado seja encontrado dentro da sequência
            if (prox == num) {
                return true;
            }
            // A recebe o valor de B e B recebe o valor do próximo valor
            a = b;
            b = prox;
            prox = a + b;
        }
        // Caso o valor da sequência ultrapasse o número digitado sem cruzar com ele quer dizer que ele não está dentro da sequência
        return false;
    }

    /*
     2) Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja maiúscula ou minúscula, além de informar a quantidade de vezes em que ela ocorre. 
     */
    
    // Método para contar a quantidade de a's em uma string
        public static void countLetterA(String str) {
            // Inicializa o contador em 0
            int count = 0;
            // Converte a string para minúscula para facilitar a contagem caso possua letras em maiúsculas
            String lowerStr = str.toLowerCase();
            
            // Percorrer cada caractere da string
            for (int i = 0; i < lowerStr.length(); i++) {
                // Condicional de caso a letra 'a' seja encontrada dentro da string o contador adiciona +1 a si
                if (lowerStr.charAt(i) == 'a') {
                    count++;
                }
            }
    
            // Exibir a contagem
            // Caso o valor seja maior que 0 mostra o valor da contagem
            if (count > 0) {
                System.out.println("A letra 'a' aparece " + count + " vezes na string.");
            }
            // Caso o valor seja igual a 0 retorna dizendo que não encontrou nenhuma letra 'a' 
            else {
                System.out.println("A letra 'a' não aparece na string.");
            }
        }

    public static void main(String[] args) {
        // Criando um novo scanner para ler o valor
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário que informe o valor desejado e adicionando ele a variável num
        System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
        int num = scanner.nextInt();

        // Chamando o método para verificar se o número pertence à sequência de Fibonacci e imprimindo o resultado
        if (isFibonacci(num)) {
            System.out.println(num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(num + " não pertence à sequência de Fibonacci.");
        }

        // Limpar o buffer do scanner
        scanner.nextLine();

        // Solicitando a usuário que digite uma string para verificarmos a quantidade de a's nela
        System.out.print("Digite uma string para contarmos a quantidade de letras 'a' presentes nela: ");
        String inputString = scanner.nextLine();
       
        // Chama o método para contar os a's
        countLetterA(inputString); 
       
        scanner.close();
    }
}

/*
 3) Observe o trecho de código abaixo: int INDICE = 12, SOMA = 0, K = 1; enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; } imprimir(SOMA); 

Ao final do processamento, qual será o valor da variável SOMA? 

O código cria um laço com 12 repetições onde K soma mais 1 e depois é somado ao valor da soma que inicia em zero ou seja K(1)+1=2 + SOMA(0)=2
K(2)+1=3 + SOMA(2)=5 e assim vai até K chegar em 12 onde finalizamos o valor de SOMA em 77



4) Descubra a lógica e complete o próximo elemento: 
a) 1, 3, 5, 7, ___ 
b) 2, 4, 8, 16, 32, 64, ____ 
c) 0, 1, 4, 9, 16, 25, 36, ____ 
d) 4, 16, 36, 64, ____ 
e) 1, 1, 2, 3, 5, 8, ____ 
f) 2,10, 12, 16, 17, 18, 19, ____

a) É uma sequência dos números naturais impares. O próximo valor será 9
b) É uma sequência de 2**(n+1), ou seja onde cada número é o dobro do próximo. O próximo valor será 128
c) É uma sequência de n**2, ou seja uma sequência de quadrados perfeitos. O próximo valor será o resultado de 7**2 que é 49
d) É uma sequência de quadrados perfeitos (n**2) de números pares. O próximo valor será o resultado de 10**2 que é 100
e) É uma sequência de Fibonacci, onde cada número é a soma dos dois anteriores. O próximo valor será 13
f) A sequência inicializa os dois primeiros valores (2,10), depois coloca a soma deles na terceira posição (12) e a partir da quarta posição soma o número da posição a 12, por isso a quarta posição é 16, a quinta é 17, a sexta é 18 e assim por diante. O próximo valor será 20, resultante da oitava posição somado a 12



5) Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em salas diferentes. Você não pode ver as lâmpadas da sala em que está, mas pode ligar e desligar os interruptores quantas vezes quiser. Seu objetivo é descobrir qual interruptor controla qual lâmpada. Como você faria para descobrir, usando apenas duas idas até uma das salas das lâmpadas, qual interruptor controla cada lâmpada?

Eu ligaria o interruptor 1 e o interruptor 2, deixaria a lampada do 1 ligada por alguns minutos e iria a primeira sala, caso a lampada esteja acesa sei que pertence ao interruptor 2, caso esteja desligada eu verifico se ela está quente ou não, o que indicaria que ela foi ligada a pouco ou não assim podendo saber se pertence ao interruptor 1 ou 3. Sabendo já na primeira ida a qual lampada se refere a primeira sala, posso ligar o interruptor 3 e verificar na sala 2, caso a luz esteja apaga eu sei que pertence ao interruptor 1 e caso esteja acessa sei que pertence ao interruptor 3 e por dedução já sei qual interruptor liga a sala 3.
*/ 