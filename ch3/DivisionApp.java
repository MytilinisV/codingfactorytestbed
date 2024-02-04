package gr.aueb.cf.ch3;

import java.util.Scanner;

public class DivisionApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        while (true) {
            System.out.println("Please insert the numerator");
            numerator = scanner.nextInt();

            System.out.println("Please insert the denominator");
            denominator = scanner.nextInt();


            if (numerator == 0) {
                System.out.println("Error: Numerator can not be zero");
                break;
            }

            if (denominator == 0) {
                System.out.println("Error Denominator cannot be zero");
                break;
            }

            result = numerator / denominator;
            System.out.printf("Result is %d", result);

        }
    }
}