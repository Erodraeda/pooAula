package NumPrimo;

import java.util.ArrayList;

public class Primo {
    public boolean primoChecagem(int value) {
        for (int i = 2; i < value; i++) {
            if (value %i == 0) return false;
        }
        return true;
    }
    public ArrayList<Integer> primoPrint(int value) {
        ArrayList<Integer> primos = new ArrayList<>();
        for (int i = 2; i <= value; i++) {
            int checker = 0;
            for (int j = 2; j <= i; j++) {
                if (i %j == 0) checker++;
            }
            if (checker < 2) primos.add(i);
        }
        return primos;
    }
}
