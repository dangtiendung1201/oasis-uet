import java.lang.Math;

public class Circle extends Shape {
    protected Point center;
    protected double radius;

    /**
     * Default constructor.
     */
    public Circle() {
    }

    /**
     * Constructor with radius.
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Constructor with radius, color and filled.
     */
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    /**
     * Constructor with center, radius, color and filled.
     */
    public Circle(Point center, double radius, String color, boolean filled) {
        super(color, filled);
        this.center = center;
        this.radius = radius;
    }

    /**
     * Get center.
     */
    public Point getCenter() {
        return this.center;
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
        return this.radius;
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
        return Math.PI * radius * radius;
    }

    /**
     * Get perimeter.
     */
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    /**
     * Print information.
     */
    public String toString() {
        return "Circle[" + "center=" + center.toString() + ",radius=" + radius
                + ",color=" + color + ",filled=" + filled + "]";
    }

    /**
     * Comparation.
     */
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Circle)) {
            return false;
        }
        Circle circle = (Circle) o;
        return center.equals(circle.getCenter()) && radius == circle.getRadius();
    }

    /**
     * Hash code.
     */
    public int hashCode() {
        int result = 12;
        result = 31 * result + center.hashCode();
        result = 31 * result + (int) radius;
        if (color != null) {
            result = 31 * result + color.hashCode();
        }
        if (filled) {
            result = result + 1;
        }
        return result;
    }
}
