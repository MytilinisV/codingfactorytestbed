package gr.aueb.cf.ch6;

/**
 * Finds the min value of an array.
 */
public class ArrayMinApp {

    public static void main(String[] args) {
        int[] arr = {6, 8, 2, 67, 1};

        int minPosition = 0;
        int minValue = arr[minPosition];

        for (int i = 1; i < arr.length; i++) { // ξεκιναμε απο την θεση 1 γιατι το minPosition ειναι 0 (πρωτη θεση του πινακα)
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[minPosition];
            }
        }

        System.out.printf("Min value = %d, min position = %d", minValue, minPosition + 1);
    }


}
