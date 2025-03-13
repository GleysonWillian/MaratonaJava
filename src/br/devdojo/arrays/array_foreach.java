package br.devdojo.arrays;

public class array_foreach {
    public static void main(String[] args) {
        /* sintaxes de inicialização:
            int[] numeros = {1,2,3,1,5};
            int[] numeros2 = new int[]{1,2,3,4,5}
            int[] numeros3 = new int[3];
        */

        int[] numeros2 = new int[]{1,2,3,4,5};

        for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
        }
         /*formas de impressão:
          * for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
            -> Acessa o índice específico
        }

            for (int num : numeros3) {
                System.out.println(num);
            }
            -> A declaração é feita depois do for para evitar erros
            -> Não acessa o índice específico
         */
    }
}
