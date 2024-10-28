package iniciante;

/*
Forma mais eficiente de resolver o exercício 1018
Criar um array e iterar

como a tarefa é repetitiva, essa simplificação torna
meu código melhor.
 */

import java.util.Scanner;

public class Bee1018_ {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int input = scanner.nextInt();
    int[] notas = {100, 50, 20, 10, 5, 2, 1};

    System.out.println(input);

    for (int nota : notas) {
      int quantidade = input / nota;
      input %= nota;
      System.out.println(quantidade + " nota(s) de R$ " + nota + ",00");
    }
  }
}

