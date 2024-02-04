package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Λαμβάνει απόψ το stdin ένα ακέραιο που
 * αναπαριστά λίρες Σκωτίας, τις μετατρέπει
 * σε δολάρια και λεπτά USD (1$ = 100cents)
 * και εκτυπώνει το αποτέλεσμα ως εξής, για
 * παράδειγμα: 10 λίρες Σκωτίας = χχ δολάρια
 * USD και yy cents.
 */
public class BankOfScotlandApp {

    public static void main(String[] args) {
    int scottishPounds = 0;
    int usdDollars= 0;
    int usdCents = 0;
    int totalUsdCents = 0;
    final int PARITY = 137;
    Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert the amount of Scottish pounds");
        scottishPounds = scanner.nextInt();

    totalUsdCents = scottishPounds * PARITY;
    usdDollars = totalUsdCents / 100;
    usdCents = totalUsdCents % 100;
        System.out.printf("£%d (Scottish Pounds) = $%d (USD Dollars) and %d USD Cents",
                scottishPounds, usdDollars, usdCents);
    }
}
