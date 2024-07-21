import java.util.*;

public class Level1 {
    public static boolean TransformTransform(int A[], int N) {
        int[] SA = transformA(A, N);
        int[] SSA = transformA(SA, SA.length);
        int res = Arrays.stream(SSA).sum();
        if (res % 2 == 0) {
            return true;
        }
        return false;
    }
    public static int[] transformA(int[] A, int N) {
        ArrayList<Integer> BValues = new ArrayList<>();
        for (int i = 0; i < N ; i ++) {
            for (int j = 0; j < N - i; j ++) {
                int k = i + j;
                ArrayList<Integer> values = new ArrayList<>();
                for (int m = 0 ; m <= k - j; m ++) {
                    values.add(A[j + m]);
                }
                int max = Collections.max(values);
                BValues.add(max);
            }
        }
        int[] B = new int[BValues.size()];
        for (int i = 0; i < B.length; i ++) {
            B[i] = BValues.get(i);
        }
        return B;
    }
}


