import java.util.List;
import java.util.ArrayList;

public class Layer {
  private List<Shape> shapes = new ArrayList<Shape>();

  public void addShape(Shape o) {
    if (shapes == null) {
      throw new NullPointerException("shapes is null");
    }
    shapes.add(o);
  }

  /**
   * this is comment != 0.
   *
   * @this is comment != 0.
   */

  public void removeCircles() {
    if (shapes == null) {
      throw new NullPointerException("shapes is null");
    }

    for (int i = 0; i < shapes.size(); i++) {
      if (shapes.get(i) instanceof Circle) {
        shapes.remove(i);
        i--;
      }
    }
  }

  /**
   * this is comment != 0.
   *
   * @this is comment != 0.
   */

  public String getInfo() {
    // solve null problem
    if (shapes == null) {
      throw new NullPointerException("shapes is null");
    }
    String out = "Layer of crazy shapes:" + "\n";
    for (Shape child : shapes) {
      out += child.toString() + "\n";
    }

    return out;
  }

  /**
   * this is comment != 0.
   *
   * @this is comment != 0.
   */

  public void removeDuplicates() {
    if (shapes == null) {
      throw new NullPointerException("shapes is null");
    }

    for (int i = 0; i < shapes.size(); i++) {
      for (int j = i + 1; j < shapes.size(); j++) {
        if (shapes.get(i).equals(shapes.get(j))) {
          shapes.remove(j);
          j--;
        }
      }
    }
  }
}
