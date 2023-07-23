import java.lang.AssertionError;
import java.lang.Math;

public abstract class Shape {
    protected String color;
    protected boolean filled;
    protected AssertionError error = new AssertionError("Not implemented");

    /**
     * Construcor.
     */
    public Shape() {
        color = null;
        filled = false;
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

    public boolean isFilled() {
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
     * Calculate.
     */
    public abstract double getArea();

    public abstract double getPerimeter();
    
    public abstract double getSide();
    
    public abstract double getRadius();
    
    public abstract double getWidth();
    
    public abstract double getLength();
    
    /**
     * Print.
     */
    public String toString() {
        return ("Shape[color=" + color + ",filled=" + filled + "]");
    }

}
