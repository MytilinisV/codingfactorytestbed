package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * In this exercise, I demonstrate an app
 * which asks the user to insert a calendar year
 * and then it checks if the inserted value is
 * a leap year or not.
 */

public class LeapYearCheckApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = 0;

        System.out.println("Please insert a calendar year");
        year = scanner.nextInt();

        if ((year % 4 == 0) && (year % 400 == 0)) {
            System.out.printf("%d is a leap year", year);
        } else {
            System.out.printf("%d is not a leap year", year);
        }
    }
}
