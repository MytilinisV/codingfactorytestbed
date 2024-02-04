package gr.aueb.cf.ch9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Copies a jpg/png byte by byte
 */
public class IOCopy1 {

    public static void main(String[] args) {
        int b;
        int count = 0;
        long start = 0;
        long end;
        long elapsedTime;

        try (FileInputStream in = new FileInputStream("C:\\Users\\Bill\\Desktop\\CODING FACTORY\\1. JAVA\\aueb.jpg");
            FileOutputStream out = new FileOutputStream("C:\\Users\\Bill\\Desktop\\CODING FACTORY\\1. JAVA\\aueb-out.jpg")) {
                while ((b = in.read()) != -1) {
                    out.write(b);
                    count++;
            }
            end = System.nanoTime();
            elapsedTime = end - start;
            System.out.printf("Το αρχείο με μέγεθος %d kb (%d bytes) αντιγράφηκε", count / 1024, count);
            System.out.printf("Elapsed time: %.2f", elapsedTime / 1000000000.0);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
