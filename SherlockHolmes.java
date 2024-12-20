import java.util.*;

public class SherlockHolmes {
    public static boolean SherlockValidString(String s) {
        HashMap<Character, Integer> countMap = buildFrequencyMap(s);

        if (checkEqualFrequency(countMap)) {
            return true;
        }

        for (int i = 0; i < s.length(); i++) {
            if (checkAfterRemoval(s, i, countMap)) {
                return true;
            }
        }
        return false;
    }

    private static HashMap<Character, Integer> buildFrequencyMap(String s) {
        HashMap<Character, Integer> countMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
        }
        return countMap;
    }

    private static boolean checkEqualFrequency(HashMap<Character, Integer> countMap) {
        int firstValue = -1;
        for (int count : countMap.values()) {
            if (firstValue == -1) {
                firstValue = count;
            } else if (firstValue != count) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkAfterRemoval(String s, int indexToRemove, HashMap<Character, Integer> countMap) {
        HashMap<Character, Integer> delValue = new HashMap<>(countMap);
        char ch = s.charAt(indexToRemove);
        int val = delValue.get(ch);
        delValue.put(ch, val - 1);

        if (delValue.get(ch) == 0) {
            delValue.remove(ch);
        }
        return checkEqualFrequency(delValue);
    }
}


