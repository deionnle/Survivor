import java.util.*;

public class SumNumbers {
    public static int SumOfThe(int N, int[] data) {
        int total = Arrays.stream(data).sum();
        return findMatchingElement(data, total);
    }


    private static int findMatchingElement(int[] data, int total) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == total - data[i]) {
                return data[i];
            }
        }
        return 0;
    }
}


