public class Rectangle extends Shape {
    protected double width;
    protected double length;

    /**
     * Constructor.
     */
    public Rectangle() {
        super();
        width = 1.0;
        length = 1.0;
    }

    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    /**
     * Getter.
     */
    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    /**
     * Setter.
     */
    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Calculate area.
     */
    public double getArea() {
        return width * length;
    }

    /**
     * Calculate perimeter.
     */
    public double getPerimeter() {
        return 2 * (width + length);
    }

    /**
     * Error
     */
    public double getRadius() {
        throw error;
    }

    public double getSide() {
        throw error;
    }


    /**
     * Print.
     */
    public String toString() {
        return ("Rectangle[width=" + width + ",length=" + length
                + ",color=" + super.color + ",filled=" + super.filled + "]");
    }
}
