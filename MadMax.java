import java.util.Arrays;

public class MadMax {
    public static int [] getImpulseArray(int N, int [] Tele) {
        if (Tele == null || Tele.length != N || (N < 1 || N > 127) || N % 2 == 0) {
            throw new IllegalArgumentException("Некорректные входные данные");
        }
        int [] finalImpulse = new int[N];
        Arrays.sort(Tele);
        for (int i = 0; i < N; i ++) {
            if (i < N / 2) {
                finalImpulse[i] = Tele[i];
            } else if (i == N / 2) {
                finalImpulse[i] = Tele[N - 1];
            } else {
                finalImpulse[i] = Tele[N - 1 - (i - (N / 2))];
            }
        }
        return finalImpulse;
    }
}


