import java.util.*;

public class Level1 {
    public static String Keymaker(int k) {
        int[] doors = new int[k];
        for (int i = 0; i < k; i ++) {
            for (int j = i; j < k; j += i + 1) {
                if (doors[j] == 0) {
                    doors[j] = 1;
                } else {
                    doors[j] = 0;
                }
            }
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < k; i ++) {
            res.append(doors[i]);
        }
        return res.toString();
    }
}


