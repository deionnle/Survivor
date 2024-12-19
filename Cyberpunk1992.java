import java.util.*;

public class Cyberpunk1992 {
    public static int getIndexOfDuplicate(int[] activate) {
        if (activate == null || activate.length == 0) {
            throw new IllegalArgumentException("Входной массив не может быть пустым");
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int min = activate.length;
        for (int i = 0; i < activate.length; i++) {
            if (map.containsKey(activate[i])) {
                if (map.get(activate[i]) < min) {
                    min = map.get(activate[i]);
                }
            } else {
                map.put(activate[i], i);
            }
        }
        if (min == activate.length) {
            return -1;
        }
        return min;
    }
}
