import java.lang.Math;

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
        return 2 * radius * Math.PI;
    }

    /**
     * Print.
     */
    public String toString() {
        // Circle[radius=?,color=?,filled=?]
        return ("Circle[" + "radius=" + radius + "," + super.toString() + "]");
    }

}
