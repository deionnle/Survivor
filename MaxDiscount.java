import java.util.*;

public class MaxDiscount {
    public static int getMaxDiscount(int N, int [] price) {
        Arrays.sort(price);
        price = getTurnArray(price);
        int discount = 0;
        for (int i = 2; i < N; i += 3) {
            discount += price[i];
        }
        return discount;
    }

    public static int[] getTurnArray(int[] price) {
        for (int i = 0; i < price.length / 2; i ++) {
            int count = price[i];
            price[i] = price[price.length - i - 1];
            price[price.length - i - 1] = count;
        }
        return price;
    }
}


