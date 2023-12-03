public class Circle {
    protected static final double PI = 3.14;

    private double radius;
    private String color;

    /**
     * Default constructor.
     */
    public Circle() {
        radius = 1.0;
        color = "red";
    }

    /**
     * Constructor with radius.
     */
    public Circle(double radius) {
        this.radius = radius;
        color = "red";
    }

    /**
     * Constructor with radius and color.
     */
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
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
     * Get color.
     */
    public String getColor() {
        return color;
    }

    /**
     * Set color.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Get area.
     */
    public double getArea() {
        return PI * radius * radius;
    }

    /**
     * Print information.
     */
    public String toString() {
        return ("Circle[radius=" + radius + ",color=" + color + "]");
    }
}
