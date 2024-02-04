package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * In this App, I represent different shapes with "*" symbol
 * with the use of methods.
 */

public class StarsAppWithMethods {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;

        do {
            printMenu();
            choice = readPositiveInt();
            if (choice < 1 || choice > 6) {
                System.out.println("Μη έγκυρος αριθμός. Παρακαλώ επιλέξτε ξανά");
                continue;
            }

            starsShape(choice);

        } while (choice != 6);

        System.out.println("....Κλείσιμο εφαρμογής");
    }

    /**
     * Prints a menu
     */
    public static void printMenu() {
        System.out.println("1. Εμφάνισε n αστεράκια οριζόντια");
        System.out.println("2. Εμφάνισε n αστεράκια κάθετα");
        System.out.println("3. Εμφάνισε n γραμμές με n αστεράκια");
        System.out.println("4. Εμφάνισε n γραμμές με αστεράκια 1 – n");
        System.out.println("5. Εμφάνισε n γραμμές με αστεράκια n – 1");
        System.out.println("6. Έξοδος από το πρόγραμμα");
        System.out.println("Δώσε επιλογή: ");
    }

    /**
     * Returns the users choice
     * @return // Returns a number, only if it's a positive one.
     */
    public static int readPositiveInt() {
        int inputNumber = in.nextInt();
        while (inputNumber < 0) {
            System.out.println("Δώσε έναν θετικό, ακέραιο αριθμό");
            inputNumber = in.nextInt();
        }
        return inputNumber;
    }

    /**
     * Prints stars horizontally
     * @param n // Stars amount
     */
    public static void horizontalStars(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    /**
     * Prints "*" vertically
     * @param n // Stars amount
     */
    public static void verticalStars(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("*");
        }
    }

    /**
     * Prints "*" in a n * n shape
     * @param n // Stars amount
     */
    public static void squareStars(int n) {
        for (int i = 1; i <= n; i++) {
            horizontalStars(n);
        }
    }

    /**
     * Prints "*" in ascending  shape
     * @param n // Stars amount
     */
    public static void ascendingStars(int n) {
        if (n == 0) {
            return;
        }
        ascendingStars(n - 1);
        horizontalStars(n);
    }

    /**
     * Prints "*" in descending shape
     * @param n // Stars amount
     */
    public static void descendingStars(int n) {
        if (n == 0) {
            return;
        }
        horizontalStars(n);
        descendingStars(n - 1);
    }

    /**
     * Returns user's choice
     * @param choice // User's choice in the bounds of 1 to 6.
     */
    public static void starsShape(int choice) {
        if (choice == 6) {
            System.out.println("Έξοδος");
            return;
        }

        System.out.println("Eπιλέξτε το πλήθος των '*': ");
        int n = readPositiveInt();

        switch (choice) {
            case 1:
                horizontalStars(n);
                break;
            case 2:
                verticalStars(n);
                break;
            case 3:
                squareStars(n);
                break;
            case 4:
                ascendingStars(n);
                break;
            case 5:
                descendingStars(n);
                break;
            default:
                System.out.println("Λάθος επιλογή");
        }
    }
}
