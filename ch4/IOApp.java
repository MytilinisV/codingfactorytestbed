package gr.aueb.cf.ch4;

import java.io.IOException;

public class IOApp {

    public static void main(String[] args) throws IOException {
        char ch = ' ';

        System.out.println("Please insert a char");
        ch = (char) System.in.read(); // Διαβάζει byte επιστρεφει int. Διαβαζει μονο ASCII

        System.out.println(ch);

    }
}
