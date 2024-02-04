package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Flushes the contents of print stream.
 */
public class FlushApp {

    public static void main(String[] args) {
        try (PrintWriter pw = new PrintWriter("C:\\Users\\Bill\\Desktop\\CODING FACTORY\\1. JAVA\\f6.txt");
             Scanner in = new Scanner(System.in)) {
            pw.print("Hello Coding Factory");
            pw.flush();
            System.out.println("Please Insert");
            in.nextLine();
        } catch (FileNotFoundException e) {
//            e.printStackTrace();
            System.out.println("File not found");
        }
    }
    }

