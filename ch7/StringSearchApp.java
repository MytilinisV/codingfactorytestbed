package gr.aueb.cf.ch7;

/**
 * Searches for chars or substrings.
 */
public class StringSearchApp {

    public static void main(String[] args) {
        String s = "Athens University of Economics and Business";

//        if (s.contains("Uni")) {
//            System.out.println("Correct");
//
//        }
//
//        int ch = 'a';
//        int index = s.indexOf(ch);
//        System.out.println(index);
//
//        if (s.startsWith("Athens")) {
//            System.out.println("Starts with Athens");
//        }

        String wholeString = s.substring(6);
        System.out.println("Athens");
    }


}
