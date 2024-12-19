import java.util.*;

public class SalesReport {
    public static String [] ShopOLAP(int N, String [] items) {
        if (N < 1 || items == null || items.length != N) {
            throw new IllegalArgumentException("Некорректные входные данные");
        }
        HashMap<String, Integer> shopList = new HashMap<>();
        for (int i = 0; i < N; i ++) {
            String[] splitStr = items[i].split(" ");
            if (shopList.containsKey(splitStr[0])) {
                int val = shopList.get(splitStr[0]);
                shopList.put(splitStr[0], val + Integer.valueOf(splitStr[1]));
            } else {
                shopList.put(splitStr[0], Integer.valueOf(splitStr[1]));
            }
        }
        ArrayList<Integer> nums = new ArrayList<>();
        for (Integer i : shopList.values()) {
            nums.add(i);
        }
        ArrayList<String> str = new ArrayList<>();
        for (String i : shopList.keySet()) {
            str.add(i);
        }
        str.sort(Comparator.naturalOrder());
        nums.sort(Comparator.reverseOrder());
        String[] salesSummary = new String[shopList.size()];
        int count = str.size();
        for (int i = 0; i < nums.size(); i ++) {
            for (String s : str) {
                for (String j : shopList.keySet()) {
                    if (nums.get(i) == shopList.get(j) && s == j) {
                        salesSummary[i] = j + " " + nums.get(i);
                        str.remove(s);
                        break;
                    }
                }
                if (str.size() < count) {
                    count--;
                    break;
                }
            }
        }
        if (salesSummary.length > N) {
            throw new IllegalStateException("Размер итогового массива больше исходного");
        }
        return salesSummary;
    }
}


