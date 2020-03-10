package SomaArray;

public class SomaArray {
    public int soma(int[] reais, int size) {
        int i = 0;
        int result = 0;
        if (size == i) return result;
        else {
            i++;
            return reais[i]+soma(reais, size-1);
        }
    }
}
//not 100% functional