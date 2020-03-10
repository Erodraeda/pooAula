package Fatorial;

public class FatorialTeste {
    public static void main(String[] args) {
        Fatorial fat;
        fat = new Fatorial();

        int value = 8;

        System.out.println("O fatorial de "+ value + " e: " + fat.calculoFatorial(value));
    }
}
