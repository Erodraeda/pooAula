package ImpressaoNaturais;

public class ImpressoesNaturais {
    public String impNaturais(int value) {
        String result = "0";

        if (value == 0) return result;
        else {
            return value+impNaturais(value-1);
        }
    }
}