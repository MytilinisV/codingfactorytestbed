package gr.aueb.cf.ch2;

import java.util.Scanner; // Κάνει import από την εντολή Scanner in

/**
 * Scanner Demo. Reads two ints from
 * stdin (keyboard) and prints the sum
 */
public class ScannerApp {
    public static void main(String[] args) {
        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in); // System in -> αντιστοιχεί το πληκτρολόγιο μέσα στο πρόγραμμα.
        int num1;
        int num2;
        int sum;

        // Εντολές
        System.out.println("Please insert two ints");
        num1 = in.nextInt();    // η nextInt() περιμένει να δώσει ο χρήστης 2 ακεραίους
        num2 = in.nextInt();    // αν δεν δώσει ακέραιους, αποτυγχάνει.

        sum = num1 + num2;

        // Εκτύπωση αποτελεσμάτων.
        System.out.printf("Sum of %d + %d = %d", num1, num2, sum);

    }
}
