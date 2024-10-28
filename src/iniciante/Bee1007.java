package iniciante;

/*
Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

Entrada
O arquivo de entrada contém 4 valores inteiros.

Saída
Imprima a mensagem DIFERENCA com todas as letras maiúsculas,
com um espaço em branco antes e depois da igualdade.

 */

import java.util.Scanner;

public class Bee1007 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();
    int d = scanner.nextInt();
    int diferenca = ((a * b) - (c * d));
    System.out.println("DIFERENCA = " + diferenca);
  }
}
