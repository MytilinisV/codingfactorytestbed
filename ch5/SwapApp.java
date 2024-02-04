package gr.aueb.cf.ch5;

/**
 * Μεταθετει αμοιβαια τις τιμες δυο μεταβλητων
 */
public class SwapApp {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a, b);

        System.out.printf("a = %d, b = %d", a, b);
    }

    /**
     * Swaps two values
     * @param a
     * @param b
     */
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
