package br.devdojo.variaveis;
public class declaracaodetamanho {
    public static void main(String[] args) {
        int idade = 10; // 4 bytes
        long numero = 100000; // 8 bytes
        double salarioDouble = 2000; // 8 bytes
        float salarioFloat = 2500; // 4 bytes
        byte idadeByte = 10; // 1 byte (8 bites)
        short idadeShort = 10; // 2 bytes
        boolean verdadeiro = true; // 1 bit
        boolean falso = false; // 1 bit
        char caractere = 10; // 2 bytes

        System.out.println(idade);
        System.out.println(verdadeiro);
        System.out.println(salarioDouble);
        System.out.println(falso);
        System.out.println(caractere);
        System.out.println(idadeByte);
        System.out.println(idadeShort);
        System.out.println(salarioFloat);
        System.out.println(numero);
    }
}