package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Switch/case demo.
 */
public class SwitchApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Please select one of the following: ");System.out.println("1. Single-Player Game");
            System.out.println("2. Two-Player Game");
            System.out.println("3. Team Game");
            System.out.println("4. Quit");
            System.out.println("Please insert your choice: ");

            choice = in.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Single-Player Game");
                    break;
                case 2:
                    System.out.println("Two-Player Game");
                    break;
                case 3:
                    System.out.println("Team Game");
                    break;
                case 4:
                    System.out.println("Quit...");
                    break;
                default:
                    System.out.println("Please insert a valid choice");
                    break;
            }
        } while (choice != 4);
    }
}
