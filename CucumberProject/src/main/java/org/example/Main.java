package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        CalculatorBasic cb = new CalculatorBasic();
        CalculatorAdvanced ca = new CalculatorAdvanced();

        // data input with validation for a number
        Scanner st = new Scanner(System.in);
        System.out.println("Enter your first number:");
        int a = st.nextInt();
        System.out.println("Enter your second number:");
        int b = st.nextInt();

        // select operation
        System.out.println("Select from the following operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulo");
        System.out.println("6. Power");
        System.out.println("7. GCD");
        System.out.println("8. LCM");
        System.out.println("9. Fibonacci");
        int choice = 0;
        while (choice < 1 || choice > 9) {
            System.out.println("Enter your choice:");
            choice = st.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Addition: " + cb.add(a, b));
                    break;
                case 2:
                    System.out.println("Subtraction: " + cb.subtract(a, b));
                    break;
                case 3:
                    System.out.println("Multiplication: " + cb.multiply(a, b));
                    break;
                case 4:
                    System.out.println("Division: " + cb.divide(a, b));
                    break;
                case 5:
                    System.out.println("Modulo: " + ca.modulo(a, b));
                    break;
                case 6:
                    System.out.println("Power: " + ca.power(a, b));
                    break;
                case 7:
                    System.out.println("GCD: " + ca.GCD(a, b));
                    break;
                case 8:
                    System.out.println("LCM: " + ca.LCM(a, b));
                    break;
                case 9:
                    System.out.println("Fibonacci: " + ca.Fibonacci(a, b));
                    break;
                default:
                    System.out.println("Invalid input: please enter a number between 1 and 9");
                    break;
            }
        }
    }
}
