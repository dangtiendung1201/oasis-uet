public class Square extends Rectangle {
    /**
     * Default constructor.
     */
    public Square() {
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
     * Constructor with topLeft, side, color and filled.
     */
    public Square(Point o, double side, String color, boolean filled) {
        super(o, side, side, color, filled);
    }

    /**
     * Get side.
     */
    public double getSide() {
        return super.width;
    }

    /**
     * Set side.
     */
    public void setSide(double side) {
        super.width = side;
        super.length = side;
    }

    /**
     * Set width.
     */
    public void setLength(double side) {
        super.setLength(side);
    }

    /**
     * Set length.
     */
    public void setWidth(double side) {
        super.setWidth(side);
    }

    /**
     * Comparation.
     */
    public boolean equals(Object o) {
        return super.equals(o);
    }

    /**
     * Hash code.
     */
    public int hashCode() {
        return super.hashCode();
    }

    /**
     * Print information.
     */
    public String toString() {
        return "Square[" + "topLeft=" + topLeft.toString() + ",side=" + width
                + ",color=" + color + ",filled=" + filled + "]";
    }
}
