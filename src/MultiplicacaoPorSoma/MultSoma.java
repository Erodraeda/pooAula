package MultiplicacaoPorSoma;

public class MultSoma {
    public int soma(int value1, int value2) {
        int result = 0;
        if (value2 == 0) return result;
        else {
            value2--;
            return(value1+soma(value1, value2));
        }
    }
}
