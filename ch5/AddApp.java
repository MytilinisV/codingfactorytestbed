package gr.aueb.cf.ch5;

public class AddApp {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int result = 0;

        result = add(a, b);

        System.out.printf("%d + %d = %d", a, b, result); // εφοσον ανηκει στην κλαση το full name ειναι AddApp.add. Μπορουμε να το καλεσουμε και με αυτο το name.

    }

    /**
     * Returns the sum of two integers
     * @param a     the first int
     * @param b     the second int
     * @return      the sum of a, b.
     */
    public static int add(int a, int b) {
        return a + b;

        /*
        // Δήλωση κι αρχικοποίηση
        int sum = 0;

        // εντολές
        sum = a + b;

        // επιστροφή αποτελέσματος
        return sum;*/
    }
}
