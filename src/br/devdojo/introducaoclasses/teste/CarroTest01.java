package br.devdojo.introducaoclasses.teste;

import br.devdojo.introducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Ferrari 812";
        carro1.modelo = "Super-Fast";
        carro1.ano = 2021;

        carro2.nome = "Maserati";
        carro2.modelo = "Conversível";
        carro2.ano = 2015;

        carro1 = carro2; // referência a objetos

        System.out.println("\nCarro 1:");
        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);
        System.out.println("\nCarro 2:");
        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);
    }
}
