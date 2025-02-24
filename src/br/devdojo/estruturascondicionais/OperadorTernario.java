package br.devdojo.estruturascondicionais;

public class OperadorTernario {
    public static void main(String[] args) {
        // simplifica operações if else e retorna o valor para uma variável ou método
        // sintaxe: tipo var = (condição) ? verdadeiro : false;

        //Problema: doar 500 se salário > 5000
        double salario = 25000;
        //opção:
        /*String mensagemDoar = "Vou doar R$500!" 
         * String mensagemNaoDoar = "Não tenho condições no momento."
        */
        //opção:
        String resultado = salario > 5000 ? "Eu vou doar R$500!" : "Não tenho condições no momento.";

        System.out.println(resultado);
        // opção:
        /* Ou
         * System.out.println(salario > 5000 ? "Eu vou doar R$500!" : "Não tenho condições no momento.);
         */
    }
}
