package NumMes;

import NumMes.NumeroMes;

import java.util.Scanner;

public class NumeroMesTeste {
    public static void main(String[] args) {
        NumeroMes nmrm;
        nmrm = new NumeroMes();

        Scanner in = new Scanner(System.in);

        int value = in.nextInt();

        nmrm.mesSC(value);
        System.out.println(nmrm.mesVetor(value));
    }
}
