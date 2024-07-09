import java.util.*;

public class Level1 {
    public static String TheRabbitsFoot(String s, boolean encode) {
        String s1 = s.replaceAll(" ", "");
        String res = "";
        int len = s1.length();
        double sq = Math.sqrt(len);
        int n = (int) sq;
        int m = 0;
        if (sq % n == 0) {
            m = n;
        } else {
            m = n + 1;
        }
        if ((n * m) < len) {
            n++;
        }
        if (encode) {
            ArrayList<String> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(s1.substring(0, m));
                s1 = s1.substring(m);
                if (s1.length() < m && s1.length() > 0) {
                    list.add(s1);
                    break;
                }
            }
            for (int i = 0; i < list.get(0).length(); i ++) {
                if (i > 0) {
                    res += " ";
                }
                for (String r : list) {
                    if (i >= r.length()) {
                        continue;
                    }
                    res += r.charAt(i);
                }
            }
        }
        if (!encode) {
                ArrayList<String> list = new ArrayList<>();
                int n1 = (int) sq;
                for (int i = 0; i < n; i++) {
                    if (i < (len - (n1 * m))) {
                        list.add(s1.substring(0, m));
                        s1 = s1.substring(m);
                    }
                    else if (i > n - ((n1 * m) - len)) {
                        list.add(s1.substring(0, n1 - 1));
                        s1 = s1.substring(n1-1);
                    } else {
                        list.add(s1.substring(0, n1));
                        s1 = s1.substring(n1);
                    }
                    if (s1.length() < n1) {
                        list.add(s1);
                        break;
                    }
                }
                for (int i = 0; i < list.size(); i ++) {
                    for (String r : list) {
                        if (i >= r.length()) {
                            continue;
                        }
                        res += r.charAt(i);
                    }
                }
        }
        return res;
    }
}


