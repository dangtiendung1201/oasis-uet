import java.util.List;

public class Week11 {
    /**
     * Quick sort.
     */
    public static <T extends Comparable<T>> void quickSort(List<T> list, int l, int r) {
        if (l < r) {
            int pivot = (l + r) / 2;
            int i = l;
            int j = r;

            while (list.get(i).compareTo(list.get(pivot)) < 0) {
                i++;
            }
            while (list.get(j).compareTo(list.get(pivot)) > 0) {
                j--;
            }

            if (i <= j) {
                T temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);

                i++;
                j--;
            }

            quickSort(list, l, j);
            quickSort(list, i, r);
        }
    }

    /**
     * Sort generic.
     */
    public static <T extends Comparable<T>> List<T> sortGeneric(List<T> list) {
        int l = 0;
        int r = list.size() - 1;

        quickSort(list, l, r);

        return list;
    }
}