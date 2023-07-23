public class Cylinder extends Circle {
    private double height;

    /**
     * Constructor.
     */
    public Cylinder() {
        super();
        height = 1.0;
    }

    public Cylinder(double radius) {
        super(radius);
        height = 1.0;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    /**
     * Getter.
     */
    public double getHeight() {
        return height;
    }

    /**
     * Setter.
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Get volume.
     */
    public double getVolume() {
        return super.getArea() * height;
    }

    /**
     * Print.
     */
    public String toString() {
        return ("Cylinder[" + super.toString() + ",height=" + height + "]");
    }
    
}
