import java.util.*;

public class Level1 {
    public static int Unmanned(int L, int N, int[][] track) {
        int index = 0;
        int dist = 0;
        for (int i = 1; i <= L; i ++) {
            dist++;
            if (index < N && i == track[index][0]) {
                dist += distance(index, dist, track);
                index++;
            }
        }
        return dist;
    }
    public static int distance(int index, int dist, int[][] track) {
        int red = track[index][1];
        int green = track[index][2];
        while (dist > 0) {
            if (dist - red <= 0) {
                dist = red - dist;
                break;
            }
            if (dist - red > 0) {
                dist -= red;
            }
            if (dist < green) {
                dist = 0;
                break;
            }
            if (dist - green > 0) {
                dist -= green;
            }
        }
        return dist;
    }
}


