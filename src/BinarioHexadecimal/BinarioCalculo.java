package BinarioHexadecimal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarioCalculo {

    public BinarioCalculo(){

    }

    public String binario(int inteiro) {
        String valorBinario = new String();
        int buffer = inteiro;
        int resto;
        while (buffer >= 1) {
            resto = buffer %2;
            valorBinario = valorBinario + resto;
            buffer = buffer/2;
        }
        String tempBuffer = new String();
        for (int i = valorBinario.length() - 1; i >= 0; i--) {
            tempBuffer = tempBuffer + valorBinario.charAt(i);
        }
        return tempBuffer;
    }

    public String hexadecimal(int inteiro) {
        String valorHexadecimal = new String();
        int buffer = inteiro;
        int resto;
        while (buffer >= 1) {
            resto = buffer %16;
            if (resto == 10) {
                valorHexadecimal = valorHexadecimal + "A";
            } if (resto == 11) {
                valorHexadecimal = valorHexadecimal + "B";
            } if (resto == 12) {
                valorHexadecimal = valorHexadecimal + "C";
            } if (resto == 13) {
                valorHexadecimal = valorHexadecimal + "D";
            } if (resto == 14) {
                valorHexadecimal = valorHexadecimal + "E";
            } if (resto == 15) {
                valorHexadecimal = valorHexadecimal + "F";
            } if (resto >= 0 && resto <= 9) valorHexadecimal = valorHexadecimal + resto;
            buffer = buffer/16;
        }
        String tempBuffer = new String();
        for (int i = valorHexadecimal.length() - 1; i >= 0; i--) {
            tempBuffer = tempBuffer + valorHexadecimal.charAt(i);
        }
        return tempBuffer;
    }
}
