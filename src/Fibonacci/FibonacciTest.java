package Fibonacci;

import Fibonacci.Fibonacci;

public class FibonacciTest {
    public static void main(String[] args) {
        int value = 7;
        int position = 6;

        Fibonacci fibo;
        fibo = new Fibonacci();

        System.out.println(fibo.inFibonacci(value));
        System.out.println(fibo.getFibonacci(position));
    }
}
