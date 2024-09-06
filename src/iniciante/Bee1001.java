package iniciante;

/*
 Leia 2 valores inteiros e armazene-os nas variáveis A e B.
 Efetue a soma de A e B atribuindo o seu resultado na variável X.
 Imprima X conforme exemplo apresentado abaixo. Não apresente
 mensagem alguma além daquilo que está sendo especificado.

 Entrada
 A entrada contém 2 valores inteiros.

 Saída
 Imprima a mensagem "X = " (letra X maiúscula) seguido pelo valor
 da variável X e pelo final de linha. Cuide para que tenha um espaço
 antes e depois do sinal de igualdade.
 */

import java.util.Scanner;

public class Bee1001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int soma = a + b;
        System.out.println("X = " + soma);
    }
}
