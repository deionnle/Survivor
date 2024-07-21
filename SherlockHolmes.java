import java.util.*;

public class Level1 {
    public static boolean SherlockValidString(String s) {
        HashMap<Character, Integer> countMap = new HashMap<>();
        for (int i = 0; i < s.length(); i ++) {
            if (countMap.containsKey(s.charAt(i))) {
                int val = countMap.get(s.charAt(i));
                countMap.put(s.charAt(i), val + 1);
            } else {
                countMap.put(s.charAt(i), 1);
            }
        }
        int count = 0;
        for (int j : countMap.values()) {
            if (j == countMap.get(s.charAt(0))) {
                count ++;
            }
            if (count == countMap.size()) {
                return true;
            }
        }
        for (int i = 0; i < s.length(); i ++) {
            HashMap<Character, Integer> delValue = (HashMap<Character, Integer>) countMap.clone();
            int val = delValue.get(s.charAt(i));
            count = 0;
            delValue.put(s.charAt(i), val - 1);
            for (char j : delValue.keySet()) {
                if (delValue.get(j) == 0) {
                    delValue.remove(j);
                    break;
                }
            }
            ArrayList<Integer> valueList = new ArrayList<>();
            for (int k : delValue.values()) {
                valueList.add(k);
            }
            for (int n : valueList) {
                if (valueList.get(0) == n) {
                    count ++;
                }
            }
            if (count == valueList.size()) {
                return true;
            }
        }
        return false ;
    }
}


