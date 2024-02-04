package gr.aueb.cf.ch1;

/**
 * Προσθέτει δύο ακεραίους και εμφανίζει
 * το αποτέλεσμα στην κονσόλα.
 */
public class AddApp {
    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών.
        int num1 = 10;
        int num2 = 20;
        int result = 0;

        // Εντολές.
        result = num1 + num2;

        // Εμφάνιση αποτελεσμάτων.
        System.out.println("Το αποτέλεσμα των: " + num1 + " και " + num2 + " είναι: " + result); // ΑΥΤΗ Η ΜΕΘΟΔΟΣ ΔΕΝ ΕΙΝΑΙ READABLE
        System.out.printf("Το αποτέλεσμα των: %d και %d είναι: %d", num1, num2, result); // το %d είναι decimal - με βάση το 10 (ακεραίους). Πιο readable μέθοδος
    }
}
