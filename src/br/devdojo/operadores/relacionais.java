package br.devdojo.operadores;

/*operadores relacionais:
 * %
 * Estes sempre retornam valores booleanos (true or false):
 * <
 * >
 * <=
 * >=
 * !=
 * ==
 */

public class relacionais {
    public static void main(String[] args) {

        // int resto = 20 % 2;
        boolean maior = 10 > 20;
        boolean menor = 10 < 20;
        boolean menorIgual = 10 <= 20;
        boolean maiorIgual = 10 >= 20;
        boolean diferente = 10 != 20;
        boolean igual = 10 == 20;

        // System.out.println(resto);
        System.out.println("10 é maior que 20?      " + maior);
        System.out.println("10 é menor que 20?      " + menor);
        System.out.println("10 é menor igual a 20?  " + menorIgual);
        System.out.println("10 é maior igual a 20?  " + maiorIgual);
        System.out.println("10 é diferente de 20?   " + diferente);
        System.out.println("10 é igual a 10?        " + igual);

    }
}
