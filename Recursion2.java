import java.util.*;

public class Recursion2 {
    public static int ListLen(List<String> list) {
        if (list.isEmpty()) {
            return list.size();
        }
        list.removeFirst();
        return ListLen(list) + 1;
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
