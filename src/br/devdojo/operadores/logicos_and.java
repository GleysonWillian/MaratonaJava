package br.devdojo.operadores;

/*operadores lógicos:
 * AND -> &&
 * OR -> ||
 */

/* Faça um programa que verifica se a pessoa 
tem mais ou menos que 30 anos e que mostre quanto
ela irá receber caso ela tenha menos ou mais que 30 anos.
*/ 
public class logicos_and {
    public static void main(String[] args) {

        int idade = 29;
        float salario = 3500F;
        boolean isMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isMaiorQueTrinta: " + isMaiorQueTrinta);
        System.out.println("isMenorQueTrinta: " + isMenorQueTrinta);

    }
}