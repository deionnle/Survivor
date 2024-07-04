import java.util.*;
import java.util.Arrays;

public class Level1 {
    public static int [] MadMax(int N, int [] Tele) {
        int [] res = new int[N];
        Arrays.sort(Tele);
        for (int i = 0; i < N; i ++) {
            if (i < N / 2) {
                res[i] = Tele[i];
            } else if (i == N / 2) {
                res[i] = Tele[N - 1];
            } else {
                res[i] = Tele[N - 1 - (i - (N / 2))];
            }
        }
        return res;
    }
}


