package gr.aueb.cf.ch15.accounts;

public class Point3D extends Point2D {
    private double z;

    public Point3D() {
        super();
        z = 0;
    }

    public Point3D(double x, double y, double z) {
        // constructor chaining
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String convertToString() {
        return super.convertToString();
    }

    @Override
    public void movePlus10() {
        super.movePlus10();
        z += 10;
    }

    @Override
    protected void movePlusOne() {
        super.movePlusOne();
        z += 1;
    }
}
