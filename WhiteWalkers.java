import java.util.*;

public class WhiteWalkers {
    private static final int TARGET_SUM = 10;
    private static final int REQUIRED_EQUALS = 3;

    public static boolean white_walkers(String village) {
        if (village.length() == 0) {
            return false;
        }
        ArrayList<Integer> digitIndexes = new ArrayList<>();
        for (int i = 0; i < village.length(); i ++) {
            if (Character.isDigit(village.charAt(i))) {
                digitIndexes.add(i);
            }
        }
        if (digitIndexes.size() == 1) {
            return false;
        }
        int validPairs = 0;
        for (int i = 0; i < digitIndexes.size() - 1; i ++) {
            String s = village.substring(digitIndexes.get(i), digitIndexes.get(i + 1) + 1);
            int first = Character.getNumericValue(village.charAt(digitIndexes.get(i)));
            int last = Character.getNumericValue(village.charAt(digitIndexes.get(i + 1)));
            int count = 0;
            for (int j = 0; j < s.length(); j ++) {
                if (first + last == 10 && s.charAt(j) == '=') {
                    count ++;
                }
            }
            if (first + last == TARGET_SUM && count != REQUIRED_EQUALS) {
                return false;
            }
            if (first + last == TARGET_SUM) {
                validPairs++;
            }
        }
        if (validPairs > 0) {
            return true;
        }
        return false;
    }
}



