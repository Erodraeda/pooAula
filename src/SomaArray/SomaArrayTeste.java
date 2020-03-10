package SomaArray;

import java.util.Arrays;

public class SomaArrayTeste {
    public static void main(String[] args) {
        SomaArray sum;
        sum = new SomaArray();

        int size = 4;
        int[] reais = new int[size];
        for (int i = 0; i < size; i++) {
            reais[i] = i;
        }

        System.out.println(Arrays.toString(reais));

        System.out.println(sum.soma(reais, size));
    }
}
//not 100% functional