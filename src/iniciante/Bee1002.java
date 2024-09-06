package iniciante;
/*
A fórmula para calcular a área de uma circunferência é: area = π . raio2.
Considerando para este problema que π = 3.14159:
- Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π.

Entrada
A entrada contém um valor de ponto flutuante (dupla precisão), no caso, a variável raio.

Saída
Apresentar a mensagem "A=" seguido pelo valor da variável area,
com 4 casas após o ponto decimal. Utilize variáveis de dupla precisão (double).
 */

import java.util.Scanner;

public class Bee1002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double raio = scanner.nextDouble();
        double area = 3.14159 * (raio * raio);
        System.out.printf("A=%.4f%n", area);
    }
}