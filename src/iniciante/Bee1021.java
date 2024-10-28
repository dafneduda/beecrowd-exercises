package iniciante;
/*
Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um
valor monetário. A seguir, calcule o menor número de notas e moedas possíveis no qual
o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2. As
moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de
notas necessárias.

Entrada
O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).

Saída
Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial,
conforme exemplo fornecido.

Obs: Utilize ponto (.) para separar a parte decimal.
 */


import java.util.Scanner;

public class Bee1021 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double entrada = scanner.nextDouble();

    double[] notas = {100.00, 50.00, 20.00, 10.00, 5.00, 2.00};
    double[] moedas = {1.00, 0.50, 0.25, 0.10, 0.05, 0.01};

    System.out.println("NOTAS:");
    for (double nota : notas) {
      int qtdeNotas = (int) (entrada / nota);
      entrada %= nota;
      System.out.println(qtdeNotas + " nota(s) de R$ " + String.format("%.2f", nota));
    }
    System.out.println("MOEDAS:");
    for (double moeda : moedas) {
      int qtdeMoedas = (int) (entrada / moeda);
      entrada %= moeda;
      System.out.println(qtdeMoedas + " moeda(s) de R$ " + String.format("%.2f", moeda));
    }
  }
}
