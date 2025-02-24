package br.devdojo.estruturasderepeticao;

public class DoWhile {
    public static void main(String[] args) {
        // Repete a condição obrigatoriamente apenas 1x, mesmo sendo falsa
        int count = 12;
        
        do {
            System.out.println(count);
            count += 1;
        } while (count < 10);
    }
}
