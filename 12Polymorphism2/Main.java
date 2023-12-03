
public class Main {

    public static void main(String[] args) {
        Layer layer = new Layer();
        layer.addShape(new Rectangle(new Point(1, 2), 3, 4, "red", true));
        layer.addShape(new Circle(new Point(1, 9), 3, "red", true));
        layer.addShape(new Circle(new Point(1, 2), 3, "red", true));
        layer.addShape(new Rectangle(new Point(1, 2), 3, 4, "red", true));
        layer.addShape(new Circle(new Point(1, 2), 3, "blue", true));

        layer.removeCircles();
        layer.removeDuplicates();
        System.out.println(layer.getInfo());
        // layer.getInfo();
    }
}
