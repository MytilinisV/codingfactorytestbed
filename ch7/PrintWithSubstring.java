package gr.aueb.cf.ch7;

/**
 * Prints a string by using substring()
 */
public class PrintWithSubstring {

    public static void main(String[] args) {
        String s = "Athens-Uni";

//        for (int i = 0; i < s.length(); i++) {
//            System.out.print(s.substring(i, i+1) + " ");
//        }

        String replaced = s.replace("-", "");
        System.out.println(replaced); // βγαζουμε το replaced γιατι το s ειναι immutable
    }
}
