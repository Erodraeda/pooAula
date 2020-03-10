package BinarioHexadecimal;

import BinarioHexadecimal.BinarioCalculo;

public class Binario {
    public static void main(String[] args) {
        BinarioCalculo bc;
        bc = new BinarioCalculo();

        int inteiro = 255;
        System.out.println("Decimal: " + inteiro);
        System.out.println("Binario: " + bc.binario(inteiro));
        System.out.println("Hexadecimal: " + bc.hexadecimal(inteiro));
    }
}