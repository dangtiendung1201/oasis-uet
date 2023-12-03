import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

public class Layer {
    private List<Shape> shapes = new ArrayList<Shape>();

    /**
     * Add shape to layer.
     */
    public void addShape(Shape o) {
        if (shapes == null) {
            throw new NullPointerException("shapes is null");
        }
        shapes.add(o);
    }

    /**
     * Remove all circles.
     */
    public void removeCircles() {
        if (shapes == null) {
            throw new NullPointerException("shapes is null");
        }

        shapes.removeIf(shape -> shape instanceof Circle);
    }

    /**
     * Print information.
     */
    public String getInfo() {
        String res = "Layer of crazy shapes:" + "\n";
        for (Shape child : shapes) {
            res += child.toString() + "\n";
        }

        return res;
    }

    /**
     * Remove duplicates based on hashCode.
     */
    public void removeDuplicates() {
        if (shapes == null) {
            throw new NullPointerException("shapes is null");
        }

        for (int i = 0; i < shapes.size(); i++) {
            for (int j = i + 1; j < shapes.size(); j++) {
                // if (shapes.get(i).equals(shapes.get(j))) {
                // shapes.remove(j);
                // j--;
                // }

                if (shapes.get(i).hashCode() == shapes.get(j).hashCode()) {
                    shapes.remove(j);
                    j--;
                }
            }
        }
    }
}
