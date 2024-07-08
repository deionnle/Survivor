import java.util.*;

public class Level1 {
    public static int [] WordSearch(int len, String s, String subs) {
        int count = 0;
        int endIndex = 0;
        ArrayList<String> str = new ArrayList<>();
        while (s.length() > 0) {
            if (s.charAt(count) == ' ') {
                endIndex = count + 1;
            }
            if (count == len && endIndex == 0) {
                str.add(s.substring(0, len));
                s = s.substring(len);
                count = 0;
            }
            if (count == len && s.charAt(count) != ' ') {
                str.add(s.substring(0,endIndex));
                s = s.substring(endIndex);
                count = 0;
                endIndex = 0;
            }
            if (count == len && s.charAt(count) == ' ') {
                str.add(s.substring(0,len + 1));
                s = s.substring(len + 1);
                count = 0;
                endIndex = 0;
            }
            if (s.length() <= len) {
                str.add(s);
                s = s.substring(s.length());
            }
            count ++;
        }

        int[] res = new int[str.size()];
        for (int i = 0; i < str.size(); i ++) {
            String[] words = str.get(i).split(" ");
            for (int j = 0; j < words.length; j ++) {
                String word = words[j];
                if (word.equals(subs)) {
                    res[i] = 1;
                }
            }
        }
        return res;
    }
}


