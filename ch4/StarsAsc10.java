package gr.aueb.cf.ch4;

/**
 * Εκτυπώνει 1 star στην 1η γραμμή, 2 στην δεύτερη...n στην n γραμμή
 */
public class StarsAsc10 {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++ ) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
