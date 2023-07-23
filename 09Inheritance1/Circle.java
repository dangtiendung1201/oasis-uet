public class Circle {
    protected static final double PI = 3.14;

    private double radius;
    private String color;

    /**
     * Constructor.
     */
    public Circle() {
        radius = 1.0;
        color = "red";
    }

    public Circle(double radius) {
        this.radius = radius;
        color = "red";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    /**
     * Getter.
     */
    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    /**
     * Setter.
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
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
     * Print.
     */
    public String toString() {
        return ("Circle[radius=" + radius + ",color=" + color + "]");
    }
}
