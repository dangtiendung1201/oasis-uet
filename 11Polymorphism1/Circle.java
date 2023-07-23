public class Circle extends Shape {
    protected double radius;

    /**
     * Constructor.
     */
    public Circle() {
        super();
        radius = 1.0;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    /**
     * Getter.
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Setter.
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Calculate area.
     */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    /**
     * Calculate perimeter.
     */
    public double getPerimeter() {
        return 2.0 * Math.PI * radius;
    }

    /**
     * Error
     */
    public double getSide() {
        throw error;
    }

    public double getWidth() {
        throw error;
    }

    public double getLength() {
        throw error;
    }

    /**
     * Print.
     */
    public String toString() {
        return ("Circle[" + "radius=" + radius
        + ",color=" + super.color + ",filled=" + super.filled + "]");
    }

}
 