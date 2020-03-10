public class Fibonacci {
    public boolean inFibonacci(int value) {
        int tempValue = 1;
        int oldValue = 0;
        int result = 0;
        for (int i = 0; i < value; i++) {
            result = tempValue + oldValue;
            oldValue = tempValue;
            tempValue = result;
            if (result == value) {
                return true;
            }
        }
        return false;
    }
    public int getFibonacci(int position) {
        int tempValue = 1;
        int oldValue = 0;
        int result = 0;
        for (int i = 0; i < position; i++) {
            result = tempValue + oldValue;
            oldValue = tempValue;
            tempValue = result;
        }
        return result;
    }
}
