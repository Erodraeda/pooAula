import java.util.ArrayList;

public class ImpressaoNumeroImpar {

    public ArrayList<Integer> calcular (int valor1, int valor2) {
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = valor1; i<=valor2; i++) {
            if (i % 2 != 0) {
                nums.add(i);
            }
        }
        return nums;
    }

}