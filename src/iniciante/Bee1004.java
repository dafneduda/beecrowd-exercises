package iniciante;

/*
Leia dois valores inteiros. A seguir, calcule o produto entre estes dois valores
e atribua esta operação à variável PROD.
A seguir mostre a variável PROD com mensagem correspondente.

Entrada
O arquivo de entrada contém 2 valores inteiros.

Saída
Imprima a mensagem "PROD" e a variável PROD com um espaço em branco antes e depois da igualdade.
 */

import java.util.Scanner;

public class Bee1004 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int prod = a * b;
    System.out.println("PROD = " + prod);
  }
}
