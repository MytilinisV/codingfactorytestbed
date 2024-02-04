package gr.aueb.cf.ch11;

public class PointApp {

    public static void main(String[] args) {
        Point p1 = new Point (1, 2);
        Point p2 = new Point (2, 3);
        Point p3 = new Point (4 ,5);

        Point point = new Point();
        point.setX(2);
        point.setY(8);

        Point point1 = new Point(9, 34);
        Point point2 = point1;

        int x = Math.abs(5);

        p1.setX(2);
        p2.setY(5);
        p3.setX(10);

        System.out.println(p1.pointToString());
        System.out.println(p2.pointToString());
        System.out.println(p3.pointToString());
    }
}
