import java.util.*;

public class Recursion2 {
    public static int ListLen(List<String> list) {
        int sum = 0;
        if (!list.isEmpty()) {
            sum += list.getFirst().length();
            list.removeFirst();
            return sum + ListLen(list);
        }
        return sum;
    }

    public static boolean palindrom(String str) {
        return index(0,str.length() - 1, str);
    }

    public static boolean index(int begin, int last, String str) {
        if (str.charAt(begin) != str.charAt(last)) return false;
        if (begin == last) return true;
        return index(begin + 1, last - 1, str);
    }
}
