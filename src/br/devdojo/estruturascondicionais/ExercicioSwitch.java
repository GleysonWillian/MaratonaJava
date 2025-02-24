package br.devdojo.estruturascondicionais;

public class ExercicioSwitch {
    public static void main(String[] args) {
        byte dia = 5;
        switch (dia) {
            case 1:
            case 7:
                System.out.println("Fnal de semana.");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia da semana.");
                break;
            default:
                System.out.println("opção inválida!");
                break;
        }
    }
}
