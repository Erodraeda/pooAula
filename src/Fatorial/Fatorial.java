package Fatorial;

public class Fatorial {
    public int calculoFatorial(int value) {
        if (value == 1) return 1;
        else return(value*calculoFatorial(value-1));
    }
}
