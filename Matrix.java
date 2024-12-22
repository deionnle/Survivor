import java.util.*;

public class Matrix {
    private static final char ZERO_BIT = '0';

    public static String digital_rain(String col) {;
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
           // Если разность уже встречалась, проверяем длину подстроки
           if (StorageOfDifference.containsKey(difference) && i - StorageOfDifference.get(difference) > endIndexOfSubstr - 1) {
               endIndexOfSubstr = i - StorageOfDifference.get(difference);
               beginIndexOfSubstr = StorageOfDifference.get(difference) + 1;
           }
           StorageOfDifference.putIfAbsent(difference, i);
        }
        if (difference == 0) return col;
        /*
        Возвращает функция наибольшую подстроку в строке col, в которой одинаковое количество 1 и 0,
        или пустую строку "", если таковой не нашлось.
         */
        return col.substring(beginIndexOfSubstr, beginIndexOfSubstr + endIndexOfSubstr);
    }
}
