package gr.aueb.cf.ch5;

import java.util.Scanner;

public class FibonacciApp {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int n = 0;
        n = in.nextInt();
        System.out.printf("Fibonacci is %d", fibonacciNum(n));
    }

    public static int fibonacciNum(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fibonacciNum(n - 1) + fibonacciNum(n - 2);
    }
}
