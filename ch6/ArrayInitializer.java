package gr.aueb.cf.ch6;

/**
 * Array initializer.
 */
public class ArrayInitializer {

    public static void main(String[] args) {
        int[] arr;
        arr = new int[] {1, 2, 3, 4, 5, 6}; // initializer.

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
