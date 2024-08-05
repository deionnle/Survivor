import java.util.*;

public class Cyberpunk203x {
    public static boolean EEC_help(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            if (map.containsKey(arr1[i])) {
                int val = map.get(arr1[i]);
                map.put(arr1[i], val + 1);
            } else {
                map.put(arr1[i], 1);
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            if (map.containsKey(arr2[i])) {
                int val = map.get(arr2[i]);
                if (val > 1) {
                    map.put(arr2[i], val - 1);
                } else {
                    map.remove(arr2[i]);
                }
            } else return false;
        }
        return true;
    }
}
