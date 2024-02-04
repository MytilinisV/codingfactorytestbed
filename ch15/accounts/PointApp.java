package gr.aueb.cf.ch15.accounts;

public class PointApp {

    public static void main(String[] args) {
        Point p = new Point();
        Point p2 = new Point2D();
        Point p3 = new Point3D();

        doMovePlus10(p);
        doMovePlus10(p2);
        doMovePlus10(p3);
    }

    public static void doMovePlus10 (Point point) {
        point.movePlus10();
    }
}
