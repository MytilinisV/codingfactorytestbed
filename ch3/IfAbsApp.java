package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το απόλυτο ενός αριθμού.
 */
public class IfAbsApp {

    public static void main(String[] args) {
        int num = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert a number");
        num = scanner.nextInt();

        if (num < 0) {
            num = -num;
        }

        System.out.printf("Η απόλυτη τιμή είναι %d", num);

        /**
         * abs = (num < 0) ? num : -num; // Ternary operator.
         */
    }
}
