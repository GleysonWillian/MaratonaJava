package br.devdojo.estruturascondicionais;

public class if0 {
    public static void main(String[] args) {
        int idade = 25;
        boolean isAutoriadoFazerProva = idade >= 18;

        if (isAutoriadoFazerProva) {
            System.out.println("Autorizado para fazer a prova de habilitação");
        }
        if (!isAutoriadoFazerProva) {
            System.out.println("Não autorizado para fazer a prova de habilitação");
        }
    }

}