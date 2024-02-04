package gr.aueb.cf.ch4;

/**
 * In this set of exercises, I represent an app where
 * the user gives an amount of Stars and the
 * application is showing the stars on the screen
 * in ascending shapes.
 */

import java.util.Scanner;

public class AscendingStarsApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int starsAmount = 0;

        System.out.println("Please give the amount of stars that should appear on the screen in an ascending shape:");
        starsAmount = scanner.nextInt();

        for (int i = 1; i <= starsAmount; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
