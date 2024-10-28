package iniciante;

/*
Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas)
no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1.
A seguir mostre o valor lido e a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).

Saída
Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo necessárias,
conforme o exemplo fornecido.
 */

import java.util.Scanner;

public class Bee1018 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int input = scanner.nextInt();
    int notas = 0;

    System.out.println(input);
    if (input >= 100) {
      notas = input / 100;
      input %= 100;
      System.out.println(notas + " nota(s) de R$ 100,00");
    } else {
      System.out.println("0 nota(s) de R$ 100,00");
    }
    if (input >= 50) {
      notas = input / 50;
      input %= 50;
      System.out.println(notas + " nota(s) de R$ 50,00");
    } else {
      System.out.println("0 nota(s) de R$ 50,00");
    }
    if (input >= 20) {
      notas = input / 20;
      input %= 20;
      System.out.println(notas + " nota(s) de R$ 20,00");
    } else {
      System.out.println("0 nota(s) de R$ 20,00");
    }
    if (input >= 10) {
      notas = input / 10;
      input %= 10;
      System.out.println(notas + " nota(s) de R$ 10,00");
    } else {
      System.out.println("0 nota(s) de R$ 10,00");
    }
    if (input >= 5) {
      notas = input / 5;
      input %= 5;
      System.out.println(notas + " nota(s) de R$ 5,00");
    } else {
      System.out.println("0 nota(s) de R$ 5,00");
    }
    if (input >= 2) {
      notas = input / 2;
      input %= 2;
      System.out.println(notas + " nota(s) de R$ 2,00");
    } else {
      System.out.println("0 nota(s) de R$ 2,00");
    }
    if (input >= 1) {
      notas = input / 1;
      input %= 1;
      System.out.println(notas + " nota(s) de R$ 1,00");
    } else {
      System.out.println("0 nota(s) de R$ 1,00");
    }
  }
}
