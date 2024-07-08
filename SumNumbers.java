import java.util.*;

public class Level1 {
    public static int SumOfThe(int N, int [] data) {
        int res = 0;
        int total = Arrays.stream(data).sum();
        for (int i = 0; i < data.length; i ++) {
            if (data[i] == total - data[i]) {
                res = data[i];
                break;
            }
        }
        return res;
    }
}


