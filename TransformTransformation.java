import java.util.*;

public class TransformTransformation {
    public static boolean TransformTransform(int A[], int N) {
        int[] singleTransformation = transformA(A, N);
        int[] doubleTransformation = transformA(singleTransformation, singleTransformation.length);
        int res = Arrays.stream(doubleTransformation).sum();
        if (res % 2 == 0) {
            return true;
        }
        return false;
    }
    public static int[] transformA(int[] A, int N) {
        ArrayList<Integer> TransformationValues = new ArrayList<>();
        for (int i = 0; i < N ; i ++) {
            for (int j = 0; j < N - i; j ++) {
                int k = i + j;
                ArrayList<Integer> values = new ArrayList<>();
                for (int m = 0 ; m <= k - j; m ++) {
                    values.add(A[j + m]);
                }
                int max = Collections.max(values);
                TransformationValues.add(max);
            }
        }
        int[] B = new int[TransformationValues.size()];
        for (int i = 0; i < B.length; i ++) {
            B[i] = TransformationValues.get(i);
        }
        return B;
    }
}


