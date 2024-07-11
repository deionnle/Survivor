import java.util.*;

public class Level1 {
    public static int [] UFO(int N, int [] data, boolean octal) {
        int count = 0;
        if (octal == true) {
            count = 8;
        } else {
            count = 16;
        }
        int[] value = new int[N];
        for (int i = 0; i < N; i ++) {
            int len = String.valueOf(data[i]).length();
            for (int j = 0; j < len; j ++) {
                value[i] += (data[i] % 10) * Math.pow(count, j);
                data[i] /= 10;
            }
        }
        return value;
    }
}


