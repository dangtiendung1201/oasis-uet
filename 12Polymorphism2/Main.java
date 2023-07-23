
public class Main {

    public static void main(String[] args) {
        Layer layer = new Layer();
        layer.addShape(new Circle(new Point(1, 2), 3, "red", true));
        layer.getInfo();
    }
}
