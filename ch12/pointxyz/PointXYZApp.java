package gr.aueb.cf.ch12.pointxyz;

import java.util.Scanner;

public class PointXYZApp {

    public static void main(String[] args) {
        PointXYZ p1 = new PointXYZ();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert x, y, z coordinates");

        p1.setX(scanner.nextInt());
        p1.setY(scanner.nextInt());
        p1.setZ(scanner.nextInt());

        System.out.println(p1.convertToString());
    }
}
