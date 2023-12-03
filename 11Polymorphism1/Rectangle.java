public class Rectangle extends Shape {
    protected double width;
    protected double length;

    /**
     * Default constructor.
     */
    public Rectangle() {
        super();
        width = 1.0;
        length = 1.0;
    }

    /**
     * Constructor with width and length.
     */
    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    /**
     * Constructor with width, length, color and filled.
     */
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    /**
     * Get width.
     */
    public double getWidth() {
        return width;
    }

    /**
     * Set width.
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Get length.
     */
    public double getLength() {
        return length;
    }

    /**
     * Set length.
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Get area.
     */
    public double getArea() {
        return width * length;
    }

    /**
     * Get perimeter.
     */
    public double getPerimeter() {
        return 2 * (width + length);
    }

    /**
     * Print information.
     */
    public String toString() {
        return ("Rectangle[width=" + width + ",length=" + length
                + ",color=" + color + ",filled=" + filled + "]");
    }
}
