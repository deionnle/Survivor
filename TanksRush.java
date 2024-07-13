import java.util.*;

public class Level1 {
    public static boolean TankRush(int H1, int W1, String S1, int H2, int W2, String S2) {
        int[][] map1 = strToArr(H1,W1,S1);
        int[][] map2 = strToArr(H2,W2,S2);

        for (int i = 0; i < H1 - H2 + 1; i ++) {
            for (int j = 0; j < W1 - W2 + 1; j ++) {
                int[][] res = new int[H2][W2];
                for (int k = 0; k < H2; k ++) {
                    for (int n = 0; n < W2; n ++) {
                        res[k][n] = map1[k + i][n + j];
                    }
                }
                if (Arrays.deepEquals(res,map2)) {
                    return true;
                }
            }
        }

        return false;
    }
    public static int[][] strToArr(int H, int W, String S) {
        int[][] map = new int[H][W];
        char ch1[] = S.replaceAll(" ", "").toCharArray();
        int n1 = 0;
        for (int i = 0; i < H; i ++) {
            for (int j = 0; j < W; j ++) {
                map[i][j] = Character.getNumericValue(ch1[n1]);
                n1 ++;
            }
        }
        return map;
    }
}


