package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

/**
 * Print stream demo with method
 */
public class PrintStreamMethod {

    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream("C:\\Users\\Bill\\Desktop\\CODING FACTORY\\1. JAVA\\f3.txt", "Windows-1252");
             PrintStream ps2 = new PrintStream("C:\\Users\\Bill\\Desktop\\CODING FACTORY\\1. JAVA\\f4.txt", StandardCharsets.UTF_8);
             PrintStream pw = new PrintStream("C:\\Users\\Bill\\Desktop\\CODING FACTORY\\1. JAVA\\f5.txt")) {
//            ps.println("Hello Coding Factory");
            printMsg(ps, "Γεια σου κοσμε");
            printMsg(ps2, "Hello Printstream 2!!!");
            printMsg(System.out, "Hello to Std Output!!!");
            pw.println("Hello from Print Writer");
        } catch (IOException e) {
//            e.printStackTrace();
            System.out.println("File not found");
        }
    }

    public static void printMsg(PrintStream ps, String message) {
        ps.println(message);
    }
}
