package gr.aueb.cf.ch7;

/**
 * Demonastrates equality between Strings.
 */
public class EqualityApp {

    public static void main(String[] args) {
        String s1 = "AUEB";
        String s2 = "AUEB";
        String s3 = "aueb";

        if (s1.equals(s3)) {
            System.out.println("EQUAL");
        } else {
            System.out.printf("Not Equal");
        }
        if (s1.equalsIgnoreCase(s3)) {
            System.out.println("EQUAL"); // case insensitive
        }

        if (s1.compareTo(s3) > 0) {

        }

        s3 = s3.toUpperCase();
        s2 = s2.toUpperCase();
        String s4 = s3.toLowerCase();
        String s5 = String.valueOf(5.5); // μετατρεπει primitives σε strings
    }
}
