package br.devdojo.estruturasderepeticao;

public class Break {
    public static void main(String[] args) {
        // imprima os primeiros 25 numeros de 0 a 50
        int i;
        int valorMax = 50;

        for (i = 0; i <= valorMax; i++) {
            if (i > 24) {
                break;
            }
            System.out.println(i);
        }
    }
}
