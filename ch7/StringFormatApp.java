package gr.aueb.cf.ch7;

/**
 * Demo of string format
 */
public class StringFormatApp {

    public static void main(String[] args) {
        char row = 'G';
        int column = 7;

        String seat = String.format("%c%02d", row, column);
        System.out.println(seat);
    }
}
