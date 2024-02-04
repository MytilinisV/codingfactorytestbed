package gr.aueb.cf.ch7;

import java.util.Scanner;

public class IOApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s; // Null

        System.out.println("Please insert a string that ends with whitespace (return/tap/spaces)");
        s = in.next();
        System.out.println(s);

        System.out.println("Please insert a string that ends with return");
        s = in.nextLine();
        System.out.print(s);
    }
}
