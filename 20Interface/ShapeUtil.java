import java.util.List;

public class ShapeUtil {
    /**
     * Print info.
     */
    public String printInfo(List<GeometricObject> list) {
        String res = "";
        
        res += "Circle:\n";
        for (GeometricObject o : list) {
            if (o instanceof Circle) {
                res += o.getInfo() + "\n";
            }
        }
        res += "Triangle:\n";
        for (GeometricObject o : list) {
            if (o instanceof Triangle) {
                res += o.getInfo() + "\n";
            }
        }

        return res;
    }
}