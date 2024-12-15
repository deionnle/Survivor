import java.util.*;

public class Matrix {
    public static String digital_rain(String col) {
        final Character ZERO_BIT = '0';
        int difference = 0;
        int beginIndexOfSubstr = 0;
        int endIndexOfSubstr = 0;
        HashMap<Integer, Integer> StorageOfDifference = new HashMap<>();
        for (int i = 0; i < col.length(); i ++) {
           if (col.charAt(i) == ZERO_BIT) {
               difference--;
           } else {
               difference++;
           }
           if (StorageOfDifference.containsKey(difference) && i - StorageOfDifference.get(difference) > endIndexOfSubstr - 1) {
               endIndexOfSubstr = i - StorageOfDifference.get(difference);
               beginIndexOfSubstr = StorageOfDifference.get(difference) + 1;
           }
           StorageOfDifference.putIfAbsent(difference, i);
        }
        if (difference == 0) return col;
        return col.substring(beginIndexOfSubstr, beginIndexOfSubstr + endIndexOfSubstr);
    }
}
