public class Square extends Rectangle {
    /**
     * Default constructor.
     */
    public Square() {
        super();
    }

    /**
     * Constructor with side.
     */
    public Square(double side) {
        super(side, side);
    }

    /**
     * Constructor with side, color and filled.
     */
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    /**
     * Get side.
     */
    public double getSide() {
        return width;
    }

    /**
     * Set side.
     */
    public void setSide(double side) {
        width = side;
        length = side;
    }

    /**
     * Set width.
     */
    public void setWidth(double side) {
        width = side;
        length = side;
    }

    /**
     * Set length.
     */
    public void setLength(double side) {
        width = side;
        length = side;
    }

    /**
     * Print information.
     */
    public String toString() {
        return ("Square[side=" + width
                + ",color=" + color + ",filled=" + filled + "]");
    }
}
