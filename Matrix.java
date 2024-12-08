import java.util.*;

public class Matrix {
    public static String digital_rain(String col) {
        int sum = 0;
        int begin = 0;
        int end = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < col.length(); i ++) {
           if (col.charAt(i) == '0') {
               sum--;
           } else {
               sum++;
           }
           if (map.containsKey(sum) && i - map.get(sum) > end - 1) {
               end = i - map.get(sum);
               begin = map.get(sum) + 1;
           }
           map.putIfAbsent(sum, i);
        }
        if (sum == 0) return col;
        return col.substring(begin, begin + end);
    }
}
