public class Point {
    private double pointX;
    private double pointY;
    
    /**
     * Default constructor.
     */
    public Point() {
        pointX = 0;
        pointY = 0;
    }

    /**
     * Constructor with coordinates.
     */
    public Point(double x, double y) {
        pointX = x;
        pointY = y;
    }

    /**
     * Get point X.
     */
    public double getX() {
        return pointX;
    }

    /**
     * Set point X.
     */
    public void setX(double x) {
        pointX = x;
    }

    /**
     * Get point Y.
     */
    public double getY() {
        return pointY;
    }

    /**
     * Set point Y.
     */
    public void setY(double y) {
        pointY = y;
    }
    
    /**
     * Calculate distance between two points.
     */
    public double distance(Point p) {
        return Math.sqrt(Math.pow(pointX - p.getX(), 2) + Math.pow(pointY - p.getY(), 2));
    }

    /**
     * Get info.
     */
    public String getInfo() {
        return "(" + String.format("%.2f", pointX) + "," + String.format("%.2f", pointY) + ")";
    }
}