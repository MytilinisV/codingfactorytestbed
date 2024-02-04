package gr.aueb.cf.ch9;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * Διαβάζει από ενα αρχείο όπου κάθε γραμμή έχει τη μορφή:
 * χώρα πόλη1 πόλη2
 * κι επιστρέφει τόσα αρχεία πόλεων
 * όσαν και οι χώρες που περιλαμβάνονται στο αρχικό αρχείο
 */
//public class CitiesIOApp {
//
//    public static void main(String[] args) {
//        String line = "";
//        String[] cities;
//        File dir = new File("C:\\Users\\Bill\\Desktop\\CODING FACTORY\\1. JAVA");
//
//        if (!dir.exists()) {
//            if (!dir.mkdir()) {
//                System.err.println("Error in make dir");
//            }
//        }
//
//        try (BufferedReader bf = new BufferedReader(new BufferedReader(new FileReader("C:\\Users\\Bill\\Desktop\\CODING FACTORY\\1. JAVA\\c1.txt"))) {
//
//            while ((line = bf.readLine()) != null) {
//                cities = line.split(" +");
//                switch (cities[0]) {
//                    case "Greece":
//                        File grFile = new File(dir + "/" + "gr.txt");
//                        PrintStream psGr = new PrintStream(grFile, StandardCharsets.UTF_8);
//                        printTitle(psGr, "GR Cities");
//                        printTokens(psGr, cities);
//                        break;
//                    case "USA":
//                        File usaFile = new File(dir + "/" + "usa.txt");
//                        PrintStream psGr = new PrintStream(grFile, StandardCharsets.UTF_8);
//                        printTitle(psGr, "GR Cities");
//                        printTokens(psGr, cities);
//                        break;
//                    case "Germany":
//                        File deFile = new File(dir + "/" + "ger.txt");
//                        PrintStream psGr = new PrintStream(grFile, StandardCharsets.UTF_8);
//                        printTitle(psDe, "GR Cities");
//                        printTokens(psDe, cities);
//                        break; //GITHUB
//                    default:
//                        System.out.println("Error in cities file");
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static void  printTokens(PrintStream ps, String[] tokens) {
//        for (int i = 1; i < tokens.length; i++);
//            ps.print(tokens[i] + " ");
//    }
//}
