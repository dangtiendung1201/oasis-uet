import java.util.List;
public class Week11 {
    public static <T extends Comparable<T>> List<T> sortGeneric(List<T> list) {
            for (int i = 0; i < list.size(); i++) {
            T min = list.get(i);
            int minIndex = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (min.compareTo(list.get(j)) > 0) {
                    min = list.get(j);
                    minIndex = j;
                }
            }
            list.set(minIndex, list.get(i));
            list.set(i, min);
        }
        return list;
    }
}