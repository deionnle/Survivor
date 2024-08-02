import java.util.*;

public class Recursion2 {
    public static int ListLen(List<String> list, int sum) {
        if (list.isEmpty()) return sum;
        sum += list.getFirst().length();
        list.removeFirst();
        return ListLen(list,sum);
    }

    public static boolean palindrom(String str) {
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }
        if (str.length() == 1) return true;
        str = str.substring(1,str.length()-1);
        return palindrom(str);
    }
}
