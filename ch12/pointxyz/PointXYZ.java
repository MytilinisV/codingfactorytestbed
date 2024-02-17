package gr.aueb.cf.ch12.pointxyz;

public class PointXYZ {
    int x;
    int y;
    int z;

    /**
     * Initializes a new point that starts from
     * (0, 0, 0) coordinates
     */
    public PointXYZ() {}

    /**
     * Constructs a new point with specific
     * (x, y, z) coordinates
     * @param x the x coordinate
     * @param y the y coordinate
     * @param z the z coordinate
     */
    public PointXYZ(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * gets the x coordinate
     * @return the x coordinate
     */
    public int getX() {
        return x;
    }

    /**
     * sets the x coordinate
     * @param x the x coordinate
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * gets the y coordinate
     * @return the y coordinate
     */
    public int getY() {
        return y;
    }

    /**
     * sets the y coordinate
     * @param y the y coordinate
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * gets the z coordinate
     * @return the z coordinate
     */
    public int getZ() {
        return z;
    }

    /**
     * sets the z coordinate
     * @param z the z coordinate
     */
    public void setZ(int z) {
        this.z = z;
    }

    /**
     * returns the state of this Point.
     * @return x, y and z coordinates are converted to String (x, y, z)
     */
    public String convertToString() {
//        return "(" + x + ", " + y + ", " + z + ')';
        return String.format("(%d, %d, %d)", x, y, z);
    }
}
