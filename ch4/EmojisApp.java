package gr.aueb.cf.ch4;

/**
 * Εμφανίζει όλα τα emojis στο range
 * U+1F600 - U+1F64F
 */
public class EmojisApp {

    public static void main(String[] args) {
        int emojiStart = 0x1F600;
        int emojiEnd = 0x1F64F;
        int counter = 0;
        int emoji;

        emoji = emojiStart;
        while (emoji <= emojiEnd) {
            System.out.println(Character.toChars(emoji)); // μετατροπη σε surrogate pairs
            System.out.print(" ");
            emoji++;
            counter++;
            if (counter % 16 == 0) { // απειρο συνολο σε ενα πεπερασμενο συνολο (16δικο)
                System.out.println();
            }
        }
    }
}
