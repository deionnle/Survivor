import java.util.*;

public class Level1 {
    public static int MaximumDiscount(int N, int [] price) {
        int discount = 0;
        Arrays.sort(price);
        price = reverseprice(price);
        for (int i = 2; i < N; i += 3) {
            discount += price[i];
        }
        return discount;
    }

    public static int[] reverseprice(int[] price) {
        for (int i = 0; i < price.length / 2; i ++) {
            int count = price[i];
            price[i] = price[price.length - i - 1];
            price[price.length - i - 1] = count;
        }
        return price;
    }
}


