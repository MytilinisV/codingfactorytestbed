package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το a^n. π.χ
 * το 2^10 = 1024, το 3^3 = 27
 */
public class PowerApp {

    public static void main(String[] args) {
        int base = 0;
        int power = 0;
        int i = 1;
        int result = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert the base number");
        base = scanner.nextInt();

        System.out.println("Please insert the power");
        power = scanner.nextInt();

        while (i <= power) {
            result = base * result;
            i++;
        }

        System.out.printf("%d ^ %d = %d", + base, power, result);
    }
}
