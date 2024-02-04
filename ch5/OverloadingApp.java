package gr.aueb.cf.ch5;

public class OverloadingApp {

    public static void main(String[] args) {

    }

    public static int add(int a, int b) { // H υπογραφες της μεθοδου δεν πρεπει να ειναι ποτε ιδιες.
        return a + b;
    }

    public static int add (int a, int b, int c) {
        return a + b + c;
    }

    public static int add (int a, long b) {
        return a + (int) b;
    }
}
