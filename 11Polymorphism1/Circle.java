public class Circle extends Shape {
    protected double radius;

    /**
     * Default constructor.
     */
    public Circle() {
        super();
        radius = 1.0;
    }

    /**
     * Constructor with radius.
     */
    public Circle(double radius) {
        super();
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
        return radius * radius * Math.PI;
    }

    /**
     * Get perimeter.
     */
    public double getPerimeter() {
        return 2.0 * Math.PI * radius;
    }

    /**
     * Print information.
     */
    public String toString() {
        return ("Circle[" + "radius=" + radius
        + ",color=" + color + ",filled=" + filled + "]");
    }

}
 