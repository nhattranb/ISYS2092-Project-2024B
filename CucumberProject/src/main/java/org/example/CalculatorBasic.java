package org.example;

import io.cucumber.java.en.*;

public class CalculatorBasic {

    @When("I press Enter")
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public long multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Invalid input: division by zero");
        }
        return (double) a / b;
    }

    public String toString(int a, int b) {
        return "CalculatorBasic{"
                + "a=" + a
                + ", b=" + b
                + '}';
    }
}
