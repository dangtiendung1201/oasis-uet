import java.lang.AssertionError;
import java.lang.Math;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    /**
     * Default construcor.
     */
    public Shape() {
        color = null;
        filled = false;
    }

    /**
     * Constructor with color and filled.
     */
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
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
     * Get filled.
     */
    public boolean isFilled() {
        return filled;
    }

    /**
     * Set filled.
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     * Get area.
     */
    public abstract double getArea();

    /**
     * Get perimeter.
     */
    public abstract double getPerimeter();

    /**
     * Print information.
     */
    public String toString() {
        return ("Shape[color=" + color + ",filled=" + filled + "]");
    }
}
