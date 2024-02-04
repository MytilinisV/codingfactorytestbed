//package gr.aueb.cf.ch8;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.Scanner;
//
//public class MultipleExceptionsApp {
//
//    public static void main(String[] args) {
//        File file = new File("C:/tmp/random.txt");
//
//        try (Scanner in = new Scanner(file)) {
//            int ch = System.in.read();
//            int num = in.nextInt();
//        } catch (FileNotFoundException | inputMismatchException e1) {
//            e1.printStackTrace();
//            System.err.println("Error. File not found.");
//        } catch (FileNotFoundException e2) {
//            e2.printStackTrace();
//            System.err.println("Error. File not found.");
//        } catch (FileNotFoundException e3) {
//            e3.printStackTrace();
//            System.err.println("Error. File not found.");
//        } catch (Exception e3) {
//            e3.printStackTrace();
//            System.err.println("Error. Invalid token error");
//        }
//    } //8:45 να το δω. (28/11/2023)
//}
