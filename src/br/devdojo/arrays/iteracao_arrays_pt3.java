package br.devdojo.arrays;

public class iteracao_arrays_pt3 {
    public static void main(String[] args) {
        String [] nomes = new String[4];
        nomes[0] = "Pedro";
        nomes[1] = "Mauricio";
        nomes[2] = "Joao";
        nomes[3] = "Miguel";
        
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
