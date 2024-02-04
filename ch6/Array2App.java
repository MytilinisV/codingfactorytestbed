package gr.aueb.cf.ch6;

/** Unsized initialization
 *
 */
public class Array2App {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        for (int i = 0; i < arr.length; i++) { // arr length = length - 1. Δεν υπαρχει η θεση 5.
            System.out.print(arr[i] + " ");
        }

        for (int num : arr) { // enhanced for
            System.out.print(num + " ");
        }
    }
}
