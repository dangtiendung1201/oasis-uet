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

    /**
     * Print.
     */
    public String toString() {
        return ("Square[" + "side=" + width + "," + super.toString() + "]");
    }

}
