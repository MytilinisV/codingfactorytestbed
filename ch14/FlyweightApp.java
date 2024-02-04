//package gr.aueb.cf.ch14;
//
//import gr.aueb.cf.ch11.model.ImmutablePoint;
//
//import java.util.ArrayList;
//
//import static javax.swing.UIManager.get;
//
//public class FlyweightApp {
//    private static final List<ImmutablePoint> points = new ArrayList<>();
//
//    private FlyweightApp() {
//
//    }
//
//    public static ImmutablePoint getFlyweightPoint(int x, int y) {
//        ImmutablePoint point;
//        int position = getPointPosition(x, y);
//
//        if (position == -1) {
//            point = new ImmutablePoint(x, y);
//            points.add(point);
//        } else {
//            point = points.get(position);
//        }
//
//        return point;
//    }
//
//    private static int getPointPosition(int x, int y) {
//        int positionToReturn = -1;
//
//        for (int i = 0; i < points.size(); i++) {
//            if (points/get(i).getx() == x) && (points/get(i).getY() == y) {
//                positionToReturn = i;
//                break;
//            }
//        }
//        return positionToReturn;
//    }
//
//
//}
