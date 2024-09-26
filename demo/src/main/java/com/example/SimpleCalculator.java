
package com.example;

import java.util.*;

//dostuff
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
    private static final int SLEEPTIME = 1000;
    private static Scanner sc = new Scanner(System.in);

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

    /** Print result. Not necessary honestly.*/
    static void output(double r) {
        System.out.println("Result: " + r);
        try {
            Thread.sleep(SLEEPTIME);
        } catch (InterruptedException ie) {
            System.out.println("Wait was interrupted");
        }
    }

    /** Get 2 inputs.*/
    static int[] getVal() {
        System.out.print("Enter value 1: ");
        int a = sc.nextInt();
        System.out.print("Enter value 2: ");
        int b = sc.nextInt();
        int[] i = {a, b};
        return i;
    }

    /** Switch case for choice.*/
    static double choice(int ch) {
        int a = 0;
        int[] arr = new int[2];
        double res = 0;
        switch (ch) {
            case ADDITION:
                arr = getVal();
                res = sum(arr[0], arr[1]);
                break;
            case SUBTRACTION:
                arr = getVal();
                res = sub(arr[0], arr[1]);
                break;
            case MULTIPLICATION:
                arr = getVal();
                res = mul(arr[0], arr[1]);
                break;
            case DIVISION:
                arr = getVal();
                res = div(arr[0], arr[1]);
                break;
            case MODULUS:
                arr = getVal();
                res = mod(arr[0], arr[1]);
                break;
            case SQUARE_ROOT:
                System.out.print("Enter value: ");
                a = sc.nextInt();
                sc.nextLine();
                res = sqrt(a);
                break;
            case FACTORIAL:
                System.out.print("Enter value: ");
                a = sc.nextInt();
                sc.nextLine();
                if (a < 1) {
                    System.out.println("Invalid value ");
                }
                res = fact(a);
                break;
            case NATURAL_LOG:
                System.out.print("Enter value: ");
                a = sc.nextInt();
                sc.nextLine();
                res = log(a);
                break;
            case POWER:
                arr = getVal();
                res = pow(arr[0], arr[1]);
                break;
            case LEAVE:
                setBoolean(false);
                break;
            default:
                System.out.println("Option not found");
        }
        return res;
    }

    /**Main function that consolidates the other functions.*/
    public static void main(String[] args) {
        int ch = DEFAULT;
        double result;
        while (getExit()) {
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
            System.out.print("Enter choice: ");
            try {
                ch = sc.nextInt();
            } catch (NoSuchElementException e) {
                ch = LEAVE;
                System.out.println("An error has occured with input");
            }
            try {
                result = choice(ch);
                output(result);
            } catch (NoSuchElementException e) {
                System.out.println("Invalid value entry");
            }
        }
        sc.close();
    }
}
