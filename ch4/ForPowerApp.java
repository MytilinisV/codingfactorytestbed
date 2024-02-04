package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Υπολογίζει το a^n
 */
public class ForPowerApp {

    public static void main(String[] args) {
        int base = 0;
        int power = 0;
        int result = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert base, power");
        base = scanner.nextInt();
        power = scanner.nextInt();

        for (int i = 1; i <= power; i++) {
            result *= base;
        }

        System.out.printf("%d^%d = %d", base, power, result);
    }
}
