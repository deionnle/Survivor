import java.util.*;

public class Recursion3 {
    public static void evenNums(List<Integer> list) {
        if (list.size() == 0) return;
        if (list.getFirst() % 2 == 0) {
            System.out.println(list.getFirst());
        }
        list.removeFirst();
        evenNums(list);
    }

    public static void evenIndex(List<String> list) {
        if (list.size() == 0) return;
        if (list.indexOf(list.getFirst()) % 2 == 0) {
            System.out.println(list.getFirst());
            list.removeFirst();
        }
        list.removeFirst();
        evenIndex(list);
    }
}
