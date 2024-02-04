package gr.aueb.cf.ch3;

/**
 * Υπολογίζει το 1 + 2 + ... + 10
 * με τη while..do
 */
public class Sum10App {
    public static void main(String[] args) {
        int i = 1;
        int result = 0;

        while (i <= 10){
            result = i + result;
            i++;
        }
        System.out.println("Sum= " + result);
    }
}
