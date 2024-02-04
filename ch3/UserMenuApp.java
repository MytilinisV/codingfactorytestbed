package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Σε αυτή την άσκηση, γίνεται η ανάπτυξη
 * μίας εφαρμογής, στην οποία εμφανίζεται
 * ένα μενού με 5 επιλογές. Ο χρήστης επιλέγει
 * από το 1-5 και το πρόγραμμα εμφανίζει την επιλογή του.
 * Στην περίπτωση που δεν επιλεχθούν αυτοί οι αριθμοί,
 * εμφανίζει μήνυμα.
 */
public class UserMenuApp {

    public static void main(String[] args) {
        int choice = 0;
        int i = 0;
        Scanner scanner = new Scanner(System.in);

            do {
                System.out.println("Επιλέξτε ένα από τα παρακάτω:");
                System.out.println("1. Εισαγωγή");
                System.out.println("2. Διαγραφή");
                System.out.println("3. Ενημέρωση");
                System.out.println("4. Αναζήτηση");
                System.out.println("5. Έξοδος");
                choice = scanner.nextInt();

                    if ((choice < 0) || (choice > 5)){
                        System.out.println("Επιλέξτε έναν αριθμό από το 1 έως το 5.");
                    } else if (choice == 1) {
                            System.out.printf("Επιλέξατε %d. Εισαγωγή\r\n", choice);
                    } else if (choice == 2) {
                            System.out.printf("Επιλέξατε %d. Διαγραφή\r\n", choice);
                    } else if (choice == 3) {
                            System.out.printf("Επιλέξατε %d. Ενημέρωση\r\n", choice);
                    } else if (choice == 4) {
                            System.out.printf("Επιλέξατε %d. Αναζήτηση\r\n", choice);
                    } else if (choice == 5) {
                            System.out.printf("Επιλέξατε %d. Έξοδος\r\n", choice);
                    }

            } while (choice != 5);

        System.out.println("Ευχαριστώ που χρησιμοποιήσατε την εφαρμογή μου.");
        }

    }
