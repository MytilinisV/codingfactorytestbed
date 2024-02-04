package gr.aueb.cf.ch8;

import java.util.Scanner;

/**
 * Integer.parseInt(string-arithmetic value)
 */
public class NumberFormatExceptionApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        String inputStr = "";

        System.out.println("Please insert an int");
        inputStr = in.nextLine();

        if (!isInt(inputStr)) {
            System.out.println("Error. Invalid token");
        }

        num = Integer.parseInt(inputStr);
    }

    /**
     * Returns true if the parsing string evaluates
     * to Integer.
     *
     * @param str   the input string.
     * @return      true if the parsing string evaluates.
     */
    public static boolean isInt(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
