package iniciante;

/*
Faça um programa que leia três valores e apresente o maior dos três valores lidos
seguido da mensagem “eh o maior”. Utilize a fórmula:
MaiorAB = (a+b+abs(a-b)) / 2

Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b).
Um segundo passo, portanto é necessário para chegar no resultado esperado.

Entrada
O arquivo de entrada contém três valores inteiros.

Saída
Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".
 */

import java.util.Scanner;

import static java.lang.Math.abs;

public class Bee1013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int maiorAb = (a + b + abs(a - b)) / 2;

        if (maiorAb < c) {
            System.out.println(c + " eh o maior");
        } else {
            System.out.println(maiorAb + " eh o maior");
        }
    }
}