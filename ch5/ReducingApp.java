package gr.aueb.cf.ch5;

/**
 * Reducing Demo
 */
public class ReducingApp {

    public static void main(String[] args) {

    }

    /**
     * Returns the sum of all the elements of the array
     *
     * @param arr   the source array.
     * @return      the aggregate total.
     */
    public static int getTotal(int[] arr) {
        double average = 0;
        if (arr == null) return 0;
        int total = 0;
        for (int item : arr) {
            total += item;
        }
        return total;
//        average = (double) total / arr.length;
//        return (int) average;
    }

    public static double getAvg(int[] arr) {
//        if (arr == null) return 0.0;
        if (arr == null || arr.length == 0) return 0.0;

        return (double) getTotal(arr) / (double) arr.length;
    }
    }
