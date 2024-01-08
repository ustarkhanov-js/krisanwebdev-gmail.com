import java.util.ArrayList;
import java.util.List;

public class ArrayDiff {
    public static void main(String[] args) {
        int[] array = {1, 67, 65, 4, 5, 8};
        int[] array2 = {1, 2, 3, 4};

        arrayDiff(array, array2);
    }

    public static int[] arrayDiff(int[] a, int[] b) {
        ArrayList<Integer> list = new ArrayList<>();
        List<Integer> removeList = new ArrayList<>();

        for (int num : a) {
            list.add(num);
        }

        for (int i = 0; i < b.length; i++) {
            if (list.contains(b[i])) {
                removeList.add(b[i]);
            }
        }

        list.removeAll(removeList);

        int[] values = new int[list.size()];

        for (int i = 0; i < values.length; i++) {
            values[i] = list.get(i);
        }

        return values;
    }
}
