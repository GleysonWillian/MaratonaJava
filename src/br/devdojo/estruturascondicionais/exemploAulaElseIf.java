package br.devdojo.estruturascondicionais;

public class exemploAulaElseIf {
    public static void main(String[] args) {
        // idade < 15 - categoria infantil
        // idade >= 15 && idade < 18 - juvenil
        // idade >= 18 - adulta

        int idade = 41;
        String categoria;

        if (idade < 15) {
            categoria = ("Categoria infantil");
        } else if (idade >= 15 && idade < 18) {
            categoria = ("Categoria juvenil");
        } else {
            categoria = ("Categoria adulto");
        }
        
        System.out.println(categoria);
    }
}
