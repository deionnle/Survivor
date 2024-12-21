import java.util.*;

public class SumNumbers {
    public static int SumOfThe(int N, int[] data) {
        int total = Arrays.stream(data).sum();
        return findMatchingElement(data, total);
    }


    private static int findMatchingElement(int[] data, int total) {
        for (int value : data) {
            if (value == total - value) {
                return value;
            }
        }
        return 0;
    }
}


