import java.lang.Math;

public class Point {
    private double pointX;
    private double pointY;

    /**
     * Constructor with coordinates.
     */
    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    /**
     * Get x-coordinate.
     */
    public double getPointX() {
        return this.pointX;
    }

    /**
     * Set x-coordinate.
     */
    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    /**
     * Get y-coordinate.
     */
    public double getPointY() {
        return this.pointY;
    }

    /**
     * Set y-coordinate.
     */
    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    /**
     * Calculate distance.
     */
    public double distance(Point o) {
        double dist = (this.pointX - o.pointX) * (this.pointX - o.pointX)
                + (this.pointY - o.pointY) * (this.pointY - o.pointY);
        return Math.sqrt(dist);
    }

    /**
     * Comparation.
     */
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Point)) {
            return false;
        }
        Point point = (Point) o;
        return pointX == point.pointX && pointY == point.pointY;
    }

    /**
     * Hash Code.
     */
    public int hashCode() {
        int result = 12;
        result = 31 * result + (int) pointX;
        result = 31 * result + (int) pointY;
        return result;
    }

    /**
     * Print information.
     */
    public String toString() {
        double tempX = (double) Math.round(pointX * 10) / 10;
        double tempY = (double) Math.round(pointY * 10) / 10;
        return "(" + tempX + "," + tempY + ")";
    }

}
