public class Square extends Rectangle {
    /**
     * Constructor.
     */
    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    /**
     * Getter.
     */
    public double getSide() {
        return width;
    }

    /**
     * Setter.
     */
    public void setSide(double side) {
        width = side;
        length = side;
    }

    public void setWidth(double side) {
        width = side;
        length = side;
    }

    public void setLength(double side) {
        width = side;
        length = side;
    }

    /**
     * Error
     */
    public double getRadius() {
        throw error;
    }

    /**
     * Print.
     */
    public String toString() {
        return ("Square[side=" + super.width
                + ",color=" + super.color + ",filled=" + super.filled + "]");
    }

}
