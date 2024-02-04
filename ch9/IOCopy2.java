package gr.aueb.cf.ch9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOCopy2 {

    public static void main(String[] args) {
        int b;
        int count = 0;
        long start = 0;
        long end;
        long elapsedTime;
        byte[] buf = new byte[8192];

        try (FileInputStream in = new FileInputStream("C:\\Users\\Bill\\Desktop\\CODING FACTORY\\1. JAVA\\v1.mp4");
             FileOutputStream out = new FileOutputStream("C:\\Users\\Bill\\Desktop\\CODING FACTORY\\1. JAVA\\newv1.mp4")) {

            start = System.nanoTime();
            while ((b = in.read(buf)) != -1) {
                out.write(buf, 0, b);
                count += b;
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