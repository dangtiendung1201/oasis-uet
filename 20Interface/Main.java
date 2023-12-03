import java.util.List;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) {
        ShapeUtil shapeUtil = new ShapeUtil();
        List<GeometricObject> list = new ArrayList<GeometricObject>();
        Circle circle = new Circle(new Point(1, 2), 3);
        Triangle triangle = new Triangle(new Point(1, 2), new Point(3, 4), new Point(5, 6));
        list.add(circle);
        list.add(triangle);
        System.out.println(shapeUtil.printInfo(list));
    }
}