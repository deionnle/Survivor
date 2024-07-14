import java.util.*;

public class Level1 {
    public static boolean MisterRobot(int N, int [] data) {
        int[] sort = Arrays.copyOf(data, data.length);
        Arrays.sort(sort);
        int count = 0;
        while (!Arrays.equals(data, sort) && count < N) {
            data = sortarr(N, data);
            count ++;
        }
        return Arrays.equals(data, sort);
    }

    public static int[] sortarr(int N, int[] data) {
        for (int i = N - 1; i > 1; i --) {
            if (data[i] > data[i -1] && data[i] > data[i - 2]) {
                continue;
            }
            int val = 0;
            while (data[i] < data[i - 1] || data[i] < data[i - 2]){
                val = data[i -2]; data[i - 2] = data[i - 1];
                data[i - 1] = data[i]; data[i] = val;
            }
        }
        return data;
    }
}


