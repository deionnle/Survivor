import java.util.*;

public class FootballTeam {
    public static boolean checkArrayInAscending(int F[], int N) {
        int[] FSort = Arrays.copyOf(F,N);
        Arrays.sort(FSort);
        if (Arrays.equals(FSort, F)) return false;

        for (int i = 0; i < N - 1; i ++) {
            for (int j = i + 1; j < N; j ++) {
                int[] originalNumberOrder = Arrays.copyOf(F,N);
                int current = originalNumberOrder[i];
                originalNumberOrder[i] = originalNumberOrder[j];
                originalNumberOrder[j] = current;
                if (Arrays.equals(FSort, originalNumberOrder)) return true;
            }
        }

        for (int i = 0; i < N - 2; i ++) {
            for (int j = i + 3; j < N; j ++) {
                int[] originalNumberOrder = Arrays.copyOf(F,N);
                for (int k = i; k <= (j + i) / 2; k ++) {
                    int current = originalNumberOrder[k];
                    originalNumberOrder[k] = originalNumberOrder[j - k + i];
                    originalNumberOrder[j - k + i] = current;
                }
                if (Arrays.equals(FSort, originalNumberOrder)) return true;
            }
        }
        return false;
    }
}


