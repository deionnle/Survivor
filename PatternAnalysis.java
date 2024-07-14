import java.util.*;

public class Level1 {
    public static boolean LineAnalysis(String line) {
        int count = 0;
        if (line.charAt(0) != '*' || line.charAt(line.length()-1) != '*') {
            return false;
        }
        if (!line.contains(".")) {
            return true;
        }
        for (int i = 1; i < line.length(); i ++) {
            if (line.charAt(i) == '*') {
                break;
            } else {
                count ++;
            }
        }
        String l = line;
        for (int i = 0; i < line.length() / (count + 1); i ++) {
            for (int j = 1; j <= count; j ++) {
                if (l.charAt(j) != '.') {
                    return false;
                }
            }
            if (l.charAt(count + 1) != '*') {
                return false;
            }
            l = l.substring(count + 1);
        }
        return true ;
    }
}


