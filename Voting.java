import java.util.*;

public class Level1 {
    public static String MassVote(int N, int [] Votes) {
        double total = Arrays.stream(Votes).sum();
        double[] vot = new double[N];
        for (int i = 0; i < vot.length; i ++) {
            double res = Votes[i] / total;
            vot[i] = Math.ceil(res * 100000) / 1000;
        }
        double max = Arrays.stream(vot).max().getAsDouble();
        int n = 0;
        int K = 0;
        for (int i = 0; i < vot.length; i ++) {
            if (vot[i] == max) {
                n ++;
                K = i + 1;
            }
        }
        if (n > 1) {
            return "no winner";
        }
        if (max > 50.0) {
            return ("majority winner " + K);
        }
        return ("minority winner " + K);
    }
}


