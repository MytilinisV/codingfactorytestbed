package gr.aueb.cf.ch5;

import java.util.Scanner;

public class RightTriangle {

    public static void main(String[] args) {
        double side1 = 0;
        double side2 = 0;
        double side3 = 0;
        final double EPSILON = 0.000005;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please give the side 1 of the triangle");
        side1 = scanner.nextDouble();

        System.out.println("Please give the side 2 of the triangle");
        side2 = scanner.nextDouble();

        System.out.println("Please give the side 3 of the triangle");
        side3 = scanner.nextDouble();

        if (Math.abs((side1 * side1 + side2 * side2) - side3 * side3) <= EPSILON) {
            if (side3 * side3 == side1 * side1 + side2 * side2)  {
                System.out.println("The triangle is a Right Triangle");
            } else {
                System.out.println("The triangle is not a Right Triangle");
            }
        } else System.out.println("Error");

    }
}
