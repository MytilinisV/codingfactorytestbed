package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Λαμβάνει δύο ακεραίους και
 * υπολογίζει το πηλίκο.
 */
public class Division2App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        System.out.println("Please insert numerator and denominator:");
        numerator = scanner.nextInt();
        denominator = scanner.nextInt();

        while (denominator == 0) {
            System.out.println("Give a denominator that's different than 0.");
            denominator = scanner.nextInt();
        }

        result = numerator / denominator;
        System.out.printf("%d / %d = %d", numerator, denominator, result);
    }
}
