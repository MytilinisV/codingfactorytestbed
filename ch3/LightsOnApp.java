package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Αποφασίζει αν θα ανάψει τα φώτα ή όχι
 * με βάση αν βρέχει, αν είναι σκοτεινά
 * και αν η ταχύτητα είναι > 100 χλμ/ωρα
 * Τις τιμές τις δίνει ο χρήστης από το
 * stdin.
 */
public class LightsOnApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRaining = false;
        boolean isDark = false;
        int speed = 0;
        final int MAX_SPEED = 100;
        boolean isRunning = false;
        boolean lightsOn = false;

        System.out.println("Please insert if is raining: (true/false)");
        isRaining = scanner.nextBoolean();

        System.out.println("Please insert car speed (int):");
        speed = scanner.nextInt();

        isRunning = speed > MAX_SPEED;

        lightsOn = isRaining && (isDark || isRunning);      // short-circuit

        System.out.println("Lights on: " + lightsOn);
    }
}
