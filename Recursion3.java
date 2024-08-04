import java.util.*;

public class Recursion3 {
    public static void evenNums(List<Integer> list) {
        getValue(list, 0);
    }
    public static void getValue(List<Integer> list, int n) {
        if (n == list.size()) return;
        if (list.get(n) % 2 == 0) {
            System.out.println(list.get(n));
        }
        getValue(list, n + 1);
    }

    public static void evenIndex(List<String> list) {
        getIndex(list, 0);
    }
    public static void getIndex(List<String> list, int n) {
        if (n == list.size()) return;
        if (list.indexOf(list.get(n)) % 2 == 0) {
            System.out.println(list.get(n));
        }
        getIndex(list, n + 1);
    }
}
