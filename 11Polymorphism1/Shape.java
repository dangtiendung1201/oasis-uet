public class Shape {
    protected String color;
    protected boolean filled;

    /**
     * Construcor
     */
    public Shape() {
        color = "red";
        filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    /**
     * Getter.
     */
    public String getColor() {
        return color;
    }

    public boolean getFilled() {
        return filled;
    }

    /**
     * Setter.
     */
    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     * Print.
     */
    public String toString() {
        // Shape[color=?,filled=?]
        return ("Shape[color=" + color + ",filled=" + filled + "]");
    }

}
