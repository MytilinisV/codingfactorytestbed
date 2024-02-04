package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Λαμβάνει δύο ακεραίους και
 * υπολογίζει το πηλίκο.
 */
public class Division3App {

    public static void main(String[] args) {
        final String NUMERATOR = "numerator";
        final String DENOMINATOR = "denominator";

        Scanner scanner = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        System.out.println("Please insert a numerator:");
        numerator = getNextNumber(scanner, NUMERATOR);
        System.out.println("Please insert a denominator:");
        denominator = getNextNumber(scanner, DENOMINATOR);

        while (denominator == 0) {
            System.out.println("Give a denominator that's different than 0.");
            denominator = getNextNumber(scanner, DENOMINATOR);
        }

        result = numerator / denominator;
        System.out.printf("%d / %d = %d", numerator, denominator, result);
    }

    public static int getNextNumber(Scanner scanner, String message) {
        while (!scanner.hasNextInt()) {
            System.out.printf("The %s should be a valid integer - please try again: \n", message);
            scanner.next();
        }
        return scanner.nextInt();
    }
}

