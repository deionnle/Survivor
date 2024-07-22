import java.util.*;

public class Level1 {
    public static boolean white_walkers(String village) {
        if (village.length() == 0) {
            return false;
        }
        ArrayList<Integer> values = new ArrayList<>();
        for (int i = 0; i < village.length(); i ++) {
            if (village.charAt(i) >= 48 && village.charAt(i) <= 57) {
                values.add(i);
            }
        }
        if (values.size() == 1) {
            return false;
        }
        int tenSum = 0;
        for (int i = 0; i < values.size() - 1; i ++) {
            String s = village.substring(values.get(i), values.get(i + 1) + 1);
            int first = Integer.parseInt(Character.toString(s.charAt(0)));
            int last = Integer.parseInt(Character.toString(s.charAt(s.length() - 1)));
            int count = 0;
            for (int j = 0; j < s.length(); j ++) {
                if (first + last == 10 && s.charAt(j) == '=') {
                    count ++;
                }
            }
            if (first + last == 10 && count != 3) {
                return false;
            }
            if (first + last == 10) {
                tenSum ++;
            }
        }
        if (tenSum > 0) {
            return true;
        }
        return false;
    }
}



