package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * In this exercise
 * I demonstrate a calculator that
 * asks the user to insert Fahrenheit degrees, and
 * it converts it to Celsius.
 * Note: This application does not limit the temperature value to over -273 Celsius degrees. (Mechanical Engineers will be mad!)
 */
public class TemperatureCalculator {

    public static void main(String[] args) {
        System.out.println("Please, type the temperature value in Fahrenheit degrees:");

        //Εντολές.
        Scanner in = new Scanner(System.in);
        int fahrenheit = in.nextInt();
        int celsius = 5 * (fahrenheit - 32) / 9;

        //Εκτύπωση αποτελεσμάτων.
        System.out.printf("%d degrees Fahrenheit equals to %d Celsius degrees", fahrenheit, celsius);
    }
}
