package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Με δυο μεθοδους, ακεραιος ως εισοδος, να επιστρεφει T/F αν ειναι αρτιος
 * και μια για τον περιττο
 */
public class EvenOrOddApp {

    public static void main(String[] args) {

    }

    /**
     * Evaluates a number if is even.
     * @param a
     * @return
     */
    public static boolean isEven(int a) {
        return (a % 2) == 0;
    }

    public static boolean isOdd(int a) {
        return !isEven(a);
    }
}


