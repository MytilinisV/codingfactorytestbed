package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Power a^n demo.
 */
public class PowerApp {

    public static void main(String[] args) { // Θα μας χρησιμευει σαν driver (testing). Η main ειναι ενας client που ζηταει μια υπηρεσια (pow).
        Scanner in = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 0;

        System.out.println("Please insert base and power");

        base = in.nextInt();
        power = in.nextInt();

        result = pow(base, power);

        System.out.printf("%d ^ %d = %d", base, power, result);

    }

    /**
     * Returns the result of a^n
     * @param base
     * @param power
     * @return      the result.
     */
    public static int pow(int base, int power) {
        int result = 1;

        for (int i = 1; i <= power ; i++) {
            result *= base;
        }

        return result;
    }
}
