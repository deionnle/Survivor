import java.util.*;

public class MissionImpossible {
    private static final String SPACE = " ";
    private static final String NO_SPACE = "";
    private static final double EPSILON = 1e-9;

    public static String TheRabbitsFoot(String s, boolean encode) {
        String s1 = s.replaceAll(SPACE, NO_SPACE);
        int len = s1.length();
        double sq = Math.sqrt(len);
        int n = (int) sq;
        int m;
        if (Math.abs(sq - n) < EPSILON) {
            m = n;
        } else {
            m = n + 1;
        }
        if ((n * m) < len) {
            n++;
        }
        StringBuilder summaryLine = new StringBuilder(NO_SPACE);
        if (encode) {
            ArrayList<String> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(s1.substring(0, m));
                s1 = s1.substring(m);
                boolean isSubstring = s1.length() < m && s1.length() > 0;
                if (isSubstring) {
                    list.add(s1);
                    break;
                }
            }
            for (int i = 0; i < list.get(0).length(); i ++) {
                if (i > 0) {
                    summaryLine.append(SPACE);
                }
                for (String r : list) {
                    if (i >= r.length()) {
                        continue;
                    }
                    summaryLine.append(r.charAt(i));
                }
            }
        } else {
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
                        summaryLine.append(r.charAt(i));
                    }
                }
        }
        return summaryLine.toString();
    }
}


