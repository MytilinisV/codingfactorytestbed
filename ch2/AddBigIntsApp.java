package gr.aueb.cf.ch2;
// Γράφουμε εντολές import.
import java.math.BigInteger; // Πλήρες όνομα της BigInteger. Δημιουργείται αυτόματα.

public class AddBigIntsApp {

    public static void main(String[] args) {
        BigInteger bigNum1 = new BigInteger("1234567895555555555555555555555555555555555"); // Βγάζει το import java.math.BigInteger
        BigInteger bigNum2 = new BigInteger("12345678999994");
        BigInteger result = bigNum1.add(bigNum2);

        System.out.printf("%,d%n", result); // "\n" Αλλάζει γραμμή (Linux). Windows: "\r\n". %n compatible και στα δυο.
        /**
         * %d
         * %4d
         * %04d
         * %,04d
         */
    }
}
