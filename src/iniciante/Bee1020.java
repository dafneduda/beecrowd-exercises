package iniciante;

/*
Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos,
meses e dias

Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias.
Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363
ou 364. Este é apenas um exercício com objetivo de testar raciocínio matemático simples.

Entrada
O arquivo de entrada contém um valor inteiro.

Saída
Imprima a saída conforme exemplo fornecido.
 */

import java.util.Scanner;

public class Bee1020 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int idadeEmDias = scanner.nextInt();

    int anos = idadeEmDias / 365;
    int resto = idadeEmDias % 365;
    int meses = resto / 30;
    idadeEmDias = resto % 30;

    System.out.println(anos + " ano(s)\n" + meses + " mes(es)\n" + idadeEmDias + " dia(s)");
  }
}
