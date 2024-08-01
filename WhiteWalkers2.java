import java.util.*;

public class WhiteWalkers2 {
    public static boolean white_walkers(String village) {
        if (village.isEmpty()) {
            return false;
        }
        ArrayList<Integer> values = new ArrayList<>();
        int count = 0;
        int sum = 0;
        int first = 0;
        int last = 0;
        String s = "";
        String s1 = "";
        for (int i = 0; i < village.length(); i ++) {
            if (village.charAt(i) >= 48 && village.charAt(i) <= 57) {
                values.add(i);
            }
            if (values.size() == 2) {
                s = village.substring(values.get(0), values.get(1) + 1);
                first = Integer.parseInt(Character.toString(s.charAt(0)));
                last = Integer.parseInt(Character.toString(s.charAt(s.length() - 1)));

            }
            if (first + last == 10) {
                s1 = s.replace("=", "");
                sum ++;

            }
            if (s.length() - s1.length() == 3 && !s1.isEmpty()) {
                count ++;
                values.removeFirst();
                first = 0;
                last = 0;
                s = "";
                s1 = "";
            }
            if (values.size() == 2) {
                values.removeFirst();
            }
        }
        if (count == 0) {
            return false;
        }
        return count == sum;
    }
}



