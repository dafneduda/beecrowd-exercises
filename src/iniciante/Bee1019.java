package iniciante;
/*
Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento
em uma fábrica, e informe-o expresso no formato horas:minutos:segundos.

Entrada
O arquivo de entrada contém um valor inteiro N.

Saída
Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos,
conforme exemplo fornecido.
 */

import java.util.Scanner;

public class Bee1019 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int segundos = scanner.nextInt();

    int horas = segundos / 3600;
    int resto = segundos % 3600;
    int minutos = resto / 60;
    segundos = resto % 60;

    System.out.println(horas + ":" + minutos + ":" + segundos);
  }
}
