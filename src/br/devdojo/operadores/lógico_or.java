package br.devdojo.operadores;

public class lógico_or {
    public static void main(String[] args) {

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlayStation = 5000F;
        boolean isPlayStation5Compravel = valorTotalContaCorrente > valorPlayStation || valorTotalContaPoupanca > valorPlayStation;

    System.out.println("Consigo comprar o PlayStation (true/false)? " + isPlayStation5Compravel);

    }
}