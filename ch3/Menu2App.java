package gr.aueb.cf.ch3;

import java.util.Scanner;

public class Menu2App {

    public static void main(String[] args) {
        int choice = 0;
        int i = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Επιλέξτε ένα από τα παρακάτω:");
            System.out.println("1. One player game");
            System.out.println("2. Two player game");
            System.out.println("3. Exit");
            System.out.println("Δώστε επιλογή");

            choice = scanner.nextInt();

            if (choice <= 0 || choice >= 4) {
                System.out.println("Λάθος επιλογή");
                continue;
            }

            if (choice == 3) {
                System.out.println("Exit...");
                break;
            }

            if (choice == 1) {
                System.out.println("One Player Game starting ...");
            } else {    // if choice = 2
                System.out.println("Two Player Game starting ...");
            }
        }
    }
}