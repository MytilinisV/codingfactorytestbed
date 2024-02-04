package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Άσκηση (2)
 * Ανάπτυξη ενός προγράμματος που διαβάζει
 * από τον χρήστη 3 ακέραιους αριθμούς
 * οι οποίοι αναπαριστούν την ημέρα, μήνα, έτος.
 * Το πρόγραμμα εμφανίζει την ημερομηνία στην μορφή:
 * ΗΗ/ΜΜ/ΕΕ
 */
public class DateApp {
    public static void main(String[] args) {
        System.out.println("Παρακαλώ, πληκτρολογήστε την σημερινή ημερομηνία");
        Scanner in = new Scanner(System.in);
        int day = in.nextInt();
        int month = in.nextInt();
        int year = in.nextInt();

        System.out.printf("%d/%d/%d", day, month, year);
    }
}
