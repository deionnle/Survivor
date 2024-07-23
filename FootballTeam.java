import java.util.*;

public class Level1 {
    public static boolean Football(int F[], int N) {
        int[] FSort = Arrays.copyOf(F,N);
        Arrays.sort(FSort);
        if (Arrays.equals(FSort, F)) return false;

        for (int i = 0; i < N - 1; i ++) {
            for (int j = i + 1; j < N; j ++) {
                int[] values = Arrays.copyOf(F,N);
                int val = values[i];
                values[i] = values[j];
                values[j] = val;
                if (Arrays.equals(FSort,values)) return true;
            }
        }

        for (int i = 0; i < N - 2; i ++) {
            for (int j = i + 3; j < N; j ++) {
                int[] values = Arrays.copyOf(F,N);
                for (int k = i; k <= (j + i) / 2; k ++) {
                    int val = values[k];
                    values[k] = values[j - k + i];
                    values[j - k + i] = val;
                }
                if (Arrays.equals(FSort,values)) return true;
            }
        }
        return false;
    }
}


