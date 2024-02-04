package gr.aueb.cf.ch4;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Χρησιμοποιεί την κλάση BigInteger
 */
public class ForBigIntApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int n = 0;
        BigInteger result = BigInteger.valueOf(1);

        System.out.println("Please insert base, power:");
        a = scanner.nextInt();
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(a));
        }

        System.out.printf("%d^%d = %,d", a, n, result);
    }
}
