package br.devdojo.estruturasderepeticao;

public class While {
    public static void main(String[] args) {

        /* sintaxe:
         * while (condição){
         *      System.out.println(variavel)
         *      variavel = variavel + 1 ou -1;
         * }
         */
        int count = 5;
        while (count < 10) {
            System.out.println(count);
            count += 1;
        }
    }
}