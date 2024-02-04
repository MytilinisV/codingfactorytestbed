package gr.aueb.cf.ch6;

public class ArrayApp {

    public static void main(String[] args) {
        int[] arr = new int[3]; // οι πινακες by default οπου δεν εχουν τιμες εχουν 0.
        arr [0] = 1;
        arr [1] = 2;
        arr [2] = 3;

        System.out.println("arr[0] = " + arr[0]);
        System.out.println("arr[1] = " + arr[1]);
        System.out.println("arr[2] = " + arr[2]);

        System.out.println("arr[0] = %d\n" + arr[0]);
        System.out.println("arr[1] = %d\n" + arr[1]);
        System.out.println("arr[2] = %d\n" + arr[2]);
    }
}
