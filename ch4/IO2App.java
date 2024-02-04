package gr.aueb.cf.ch4;

import java.util.Scanner;

public class IO2App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char inputChar = ' ';

        System.out.println("Please insert a char");
        inputChar = in.nextLine().charAt(0); // Μετατρεπει σε UTF16, διαβαζει και ελληνικα.

        System.out.println("Input char: " + inputChar);
    }
}
