package gr.aueb.cf.ch2;

/*
 * επιστρεξει το αθρoισμα των δυο ψηφιων του αποτελεσματος.
 */

import java.util.Scanner;

public class ChallengeApp {

    public static void main(String[] args) {
        int d1 = 0;
        int d2 = 0;
        int sum = 0;
        int sumOfDigits = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("please insert two numbers");
        d1 = scanner.nextInt();
        d2 = scanner.nextInt();
        sum = d1 + d2;
        System.out.println("The sum of the given numbers is: " + sum);

        int leftDigit = sum / 10;
        int rightDigit = sum % 10;
        sumOfDigits = leftDigit + rightDigit;
        System.out.printf("The left digit is %d, the right digit is %d and the sum of aforementioned digits is: %d ", +
                leftDigit, rightDigit, sumOfDigits);
    }
}
