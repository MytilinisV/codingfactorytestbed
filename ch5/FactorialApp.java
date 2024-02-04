package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Υπολογίζει το παραγωντικό του n! = 1 * 2 * ... * n
 */
public class FactorialApp {

    public static void main(String[] args) {

    }


    /**
     * Returns n!.
     * @param n     input number.
     * @return
     */
    public static int facto(int n) {
//        if (n <= 1) {
//            return 1;
//        }
//
//        return n * facto(n - 1);

        return (n <= 1) ? 1 : n * facto(n - 1);
    }
}

