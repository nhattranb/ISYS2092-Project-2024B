package org.example;

public class CalculatorAdvanced {

    public int modulo(int a, int b) {
        return a % b;
    }

    public int power(int a, int b) {
        int results = 1;
        for (int i = 0; i < b; i++) {
            results *= a;
        }
        return results;
    }

    public int GCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public int LCM(int a, int b) {
        return a * b / GCD(a, b);
    }

    public int Fibonacci(int a, int b) {
        int results = 0;
        for (int i = 0; i < b; i++) {
            results += a;
            a = b;
            b = results;
        }
        return results;
    }

    public String toString(int a, int b) {
        return "CalculatorAdvanced{"
                + "a=" + a
                + ", b=" + b
                + '}';
    }
}