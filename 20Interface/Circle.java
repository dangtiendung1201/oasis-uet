public class Circle implements GeometricObject {
    public static final double PI = 3.14;
    private Point center;
    private double radius;

    /**
     * Default constructor.
     */
    public Circle() {
        this.center = new Point();
        this.radius = 0;
    }

    /**
     * Constructor with center and radius.
     */
    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    /**
     * Get center.
     */
    public Point getCenter() {
        return center;
    }

    /**
     * Set center.
     */
    public void setCenter(Point center) {
        this.center = center;
    }

    /**
     * Get radius.
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Set radius.
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Get area.
     */
    public double getArea() {
        return PI * radius * radius;
    }

    /**
     * Get perimeter.
     */
    public double getPerimeter() {
        return 2 * PI * radius;
    }

    /**
     * Get info.
     */
    public String getInfo() {
        return String.format("Circle[%s,r=%.2f]", center.getInfo(), radius);
    }
}