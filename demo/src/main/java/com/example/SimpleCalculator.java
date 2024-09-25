
package com.example;

import java.util.*;

/**
 * This is a simple calculator class.
 * It possesses functions for addition, subtraction, multiplication, division,
 * modulo, Square root, Factorial, Natural log and power
 */
final class SimpleCalculator {
    private static boolean exit = true;
    private static final int ADDITION = 1;
    private static final int SUBTRACTION = 2;
    private static final int MULTIPLICATION = 3;
    private static final int DIVISION = 4;
    private static final int MODULUS = 5;
    private static final int SQUARE_ROOT = 6;
    private static final int FACTORIAL = 7;
    private static final int NATURAL_LOG = 8;
    private static final int POWER = 9;
    private static final int LEAVE = 10;
    private static final int DEFAULT = 11;

    /** Constructor.*/
    private SimpleCalculator() {

    }

    /** Get exit variable. */
    static boolean getExit() {
        return exit;
    }

    /** Set exit variable. */
    static void setBoolean(boolean b) {
        exit = b;
    }

    /** Display options to choose from. */
    static void displayOptions() {
        System.out.println("1-Addition");
        System.out.println("2-Subtraction");
        System.out.println("3-Multiplication");
        System.out.println("4-Division");
        System.out.println("5-Modulo");
        System.out.println("6-Square Root");
        System.out.println("7-Factorial");
        System.out.println("8-Natural Log");
        System.out.println("9-Power");
        System.out.println("10-Exit");
        System.out.print("Enter choice:");
    }

    /* Add numbers.*/
    static double sum(int a, int b) {
        return (double) a + b;
    }

    /* Subtract numbers.*/
    static double sub(int a, int b) {
        return (double) a - b;
    }

    /* Multiply numbers.*/
    static double mul(int a, int b) {
        return (double) a * b;
    }

    /* Divide numbers.*/
    static double div(int a, int b) {
        return (double) a / b;
    }

    /* Modulus of numbers.*/
    static double mod(int a, int b) {
        return (double) a % b;
    }

    /* Square root of number.*/
    static double sqrt(int a) {
        return Math.sqrt(a);
    }

    /** Factorial of number.*/
    static double fact(int a) {
        int fact = 1;
        int l = a;
        while (l > 1) {
            fact *= l--;
        }
        return fact;
    }

    /* Natural log of number.*/
    static double log(int a) {
        return Math.log(a);
    }

    /* Power of number.*/
    static double pow(int a, int b) {
        return Math.pow(a, b);
    }

    /* Print result. Not necessary honestly.*/
    static void output(double r) {
        System.out.println("Result: " + r);
    }

    /** Switch case for choice.*/
    static double choice(int ch) {
        int a = 0;
        int b = 0;
        double res = 0;
        Scanner sc = new Scanner(System.in);
        switch (ch) {
            case ADDITION:
                System.out.print("Enter value 1:");
                a = sc.nextInt();
                System.out.print("Enter value 2:");
                b = sc.nextInt();
                res = sum(a, b);
                break;
            case SUBTRACTION:
                System.out.print("Enter value 1:");
                a = sc.nextInt();
                System.out.print("Enter value 2:");
                b = sc.nextInt();
                res = sub(a, b);
                break;
            case MULTIPLICATION:
                System.out.print("Enter value 1:");
                a = sc.nextInt();
                System.out.print("Enter value 2:");
                b = sc.nextInt();
                res = mul(a, b);
                break;
            case DIVISION:
                System.out.print("Enter value 1:");
                a = sc.nextInt();
                System.out.print("Enter value 2:");
                b = sc.nextInt();
                res = div(a, b);
                break;
            case MODULUS:
                System.out.print("Enter value 1:");
                a = sc.nextInt();
                System.out.print("Enter value 2:");
                b = sc.nextInt();
                res = mod(a, b);
                break;
            case SQUARE_ROOT:
                System.out.print("Enter value:");
                a = sc.nextInt();
                res = sqrt(a);
                break;
            case FACTORIAL:
                System.out.print("Enter value:");
                a = sc.nextInt();
                if (a < 1) {
                    System.out.println("Invalid value");
                }
                res = fact(a);
                break;
            case NATURAL_LOG:
                System.out.print("Enter value:");
                a = sc.nextInt();
                res = log(a);
                break;
            case POWER:
                System.out.print("Enter value:");
                a = sc.nextInt();
                System.out.print("Enter power:");
                b = sc.nextInt();
                res = pow(a, b);
                break;
            case LEAVE:
                setBoolean(false);
                break;
            default:
                System.out.println("Option not found");
        }
        sc.close();
        return res;
    }

    /**Main function that consolidates the other functions.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch = DEFAULT;
        double result;
        while (getExit()) {
            displayOptions();
            try {
                ch = sc.nextInt();
            } catch (ArithmeticException e) {
                ch = DEFAULT;
            }
            try {
                result = choice(ch);
                output(result);
            } catch (ArithmeticException e) {
                System.out.println("Invalid value entry");
            }
        }
        sc.close();
    }
}
