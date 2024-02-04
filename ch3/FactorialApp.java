package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το παραγωντικό του n! = 1 * 2 * ... * n
 */
public class FactorialApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int facto = 1;
        int i = 1;

        System.out.println("Please insert n");
        n = scanner.nextInt();

        while (i <= n) {
            facto *= i;
            i++;
        }
        System.out.printf("Result is: %,d", facto);
    }
}
