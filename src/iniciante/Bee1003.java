package iniciante;

/*
Leia dois valores inteiros, no caso para variáveis A e B.
A seguir, calcule a soma entre elas e atribua à variável SOMA. A seguir escrever o valor desta variável.

Entrada
O arquivo de entrada contém 2 valores inteiros.

Saída
Imprima a mensagem "SOMA" com todas as letras maiúsculas, com um espaço em branco
antes e depois da igualdade seguido pelo valor correspondente à soma de A e B.
 */

import java.util.Scanner;

public class Bee1003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int soma = a + b;
        System.out.println("SOMA = " + soma);
    }
}
