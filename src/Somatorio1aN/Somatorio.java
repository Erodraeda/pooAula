package Somatorio1aN;

public class Somatorio {
    public int soma(int value) {
        if (value == 1) return 1;
        else {
            return value+soma(value-1);
        }
    }
}
