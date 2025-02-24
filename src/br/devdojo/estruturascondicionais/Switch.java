package br.devdojo.estruturascondicionais;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
         * Switch case é uma estrutura de decisão (if else melhorado)
         * usada para testar condições que serão executadas em seguida.
         * Usada para condições simples (escolha de sexo/gênero).
         */
        int numero;
        String dia = "";

        while (true) {
            System.out.print("Digite um número de 1 a 7 para o dia da semana: ");
            numero = scanner.nextInt();

            if (numero >= 1 && numero <= 7) {
                break;
            }

            System.out.println("Número inválido! Tente novamente.");
        }

        switch (numero) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda";
                break;
            case 3:
                dia = "Terça";
                break;
            case 4:
                dia = "Quarta";
                break;
            case 5:
                dia = "Quinta";
                break;
            case 6:
                dia = "Sexta";
                break;
            case 7:
                dia = "Sábado";
                break;
            default:
                System.out.println("Número inválido. Digite um número entre 1 e 7.");
        }
        System.out.println("Dia referente: " + dia);
        scanner.close();
    }
}
