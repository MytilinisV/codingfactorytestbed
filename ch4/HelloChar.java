package gr.aueb.cf.ch4;

/**
 * Demonstation. Declare, init chars.
 */
public class HelloChar {

    public static void main(String[] args) {
        char star = '*'; // Τα char σε ''
        char alpha = 'a';
        char upperAlpha = 'A';
        char dot = '.';
        char bang = '!';
        char EMPTY_SPACE = ' ';
        int hash = '#';

        System.out.print((int) star);
        System.out.print(alpha);
        System.out.println(dot);

        System.out.println("Hash: =" + (char) hash);

        if (alpha > upperAlpha) {
            System.out.println("a is greater (greater ordinal) than A");
        } else {
            System.out.println("A is greater than a");
        }
    }
}
