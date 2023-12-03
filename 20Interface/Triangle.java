public class Triangle implements GeometricObject {
    private Point p1;
    private Point p2;
    private Point p3;

    /**
     * Default constructor.
     */
    public Triangle() {
        this.p1 = new Point();
        this.p2 = new Point();
        this.p3 = new Point();
    }

    /**
     * Constructor with three points.
     */
    public Triangle(Point p1, Point p2, Point p3) throws RuntimeException {
        if (p1.distance(p2) + p2.distance(p3) <= p3.distance(p1)
                || p2.distance(p3) + p3.distance(p1) <= p1.distance(p2)
                || p3.distance(p1) + p1.distance(p2) <= p2.distance(p3)) {
            throw new RuntimeException("Hihi deo cho tao");
        }

        if (p1.getX() == p2.getX() && p1.getY() == p2.getY()) {
            throw new RuntimeException("Hihi deo cho tao");
        }
        if (p2.getX() == p3.getX() && p2.getY() == p3.getY()) {
            throw new RuntimeException("Hihi deo cho tao");
        }
        if (p3.getX() == p1.getX() && p3.getY() == p1.getY()) {
            throw new RuntimeException("Hihi deo cho tao");
        }

        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    /**
     * Get point 1.
     */
    public Point getP1() {
        return p1;
    }

    /**
     * Get point 2.
     */
    public Point getP2() {
        return p2;
    }

    /**
     * Get point 3.
     */
    public Point getP3() {
        return p3;
    }

    /**
     * Get area.
     */
    public double getArea() {
        double a = p1.distance(p2);
        double b = p2.distance(p3);
        double c = p3.distance(p1);
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    /**
     * Get perimeter.
     */
    public double getPerimeter() {
        return p1.distance(p2) + p2.distance(p3) + p3.distance(p1);
    }

    /**
     * Get info.
     */
    public String getInfo() {
        return "Triangle[" + p1.getInfo() + "," + p2.getInfo() + "," + p3.getInfo() + "]";
    }
}