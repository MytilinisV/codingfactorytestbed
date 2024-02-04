package gr.aueb.cf.ch8;

import java.util.Scanner;

public class ArithmeticException2App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numerator;
        int denominator;
        int result = 0;

        while (true) {
            System.out.println("Please insert a numerator and a denominator:");
            numerator = in.nextInt();
            if (numerator == 0) break;
            denominator = in.nextInt();

            try {
                result = div(numerator, denominator);
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

    }

    /**
     *
     * @param numerator
     * @param denominator
     * @return
     */
    public static int div(int numerator, int denominator) {
        int result = 0;
        try {
            result = numerator / denominator;   // arithmetic exception
        } catch (ArithmeticException e) {
            e.printStackTrace();
            throw e;
        }
        return result;
    }
}
