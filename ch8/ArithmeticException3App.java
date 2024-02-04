package gr.aueb.cf.ch8;

import java.util.Scanner;

public class ArithmeticException3App {

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

            // State dependent testing
            if (isZero(denominator)) {
                System.out.println("Error: Denominator is zero");
                continue;
            }
        }

    }

    /**
     * @param numerator
     * @param denominator
     * @return
     */
    public static int di(int numerator, int denominator) {
        int result = 0;

        result = (denominator == 0) ? ((numerator < 0) ? Integer.MIN_VALUE : Integer.MAX_VALUE) : numerator / denominator;
        return result;
    }

    public static boolean isZero(int num) {
        return num == 0;
    }
    //7:14 28/11/2023
}
