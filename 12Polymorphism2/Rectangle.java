public class Rectangle extends Shape {
    protected Point topLeft;
    protected double width;
    protected double length;

    /**
     * Default construcor.
     */
    public Rectangle() {
    }

    /**
     * Constructor with width and length.
     */
    public Rectangle(double width, double length) {
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
     * Constructor with topLeft, width, length, color and filled.
     */
    public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
        super(color, filled);
        this.topLeft = topLeft;
        this.width = width;
        this.length = length;
    }

    /**
     * Get topLeft.
     */
    public Point getTopLeft() {
        return this.topLeft;
    }

    /**
     * Set topLeft.
     */
    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    /**
     * Get width.
     */
    public double getWidth() {
        return this.width;
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
        return this.length;
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
     * Comparation.
     */
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Rectangle)) {
            return false;
        }
        Rectangle rectangle = (Rectangle) o;
        return topLeft.equals(rectangle.getTopLeft())
                && width == rectangle.getWidth() && length == rectangle.getLength();
    }

    /**
     * Hash code.
     */
    public int hashCode() {
        int result = 12;
        result = 31 * result + topLeft.hashCode();
        result = 31 * result + (int) width;
        result = 31 * result + (int) length;
        if (color != null) {
            result = 31 * result + color.hashCode();
        }
        if (filled) {
            result = result + 1;
        }
        return result;
    }

    /**
     * Print information.
     */
    public String toString() {
        return "Rectangle[" + "topLeft=" + topLeft.toString()
                + ",width=" + width + ",length=" + length
                + ",color=" + color + ",filled=" + filled + "]";
    }
}
