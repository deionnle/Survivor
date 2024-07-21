import java.util.*;

public class Level1 {
    public static String [] TreeOfLife(int H, int W, int N, String [] tree) {
        int[][] matrix = new int[H][W];

        for (int i = 0; i < H; i ++) {
            String s = tree[i];
            for (int j = 0; j < W; j ++) {
                if (s.charAt(j) == '.') {
                    matrix[i][j] = 0;
                } else {
                    matrix[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < N; i ++) {
            getMatrix(matrix);
            if (i % 2 == 1) {
                delMatrix(matrix);
            }
        }
        String[] res = new String[H];
        for (int i = 0; i < H; i ++) {
            String s = "";
            for (int j = 0; j < W; j ++) {
                if (matrix[i][j] == 0) {
                    s += ".";
                } else {
                    s += "+";
                }
            }
            res[i] = s;
        }
        return res;
    }

    public static int[][] getMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i ++) {
            for (int j = 0; j < matrix[i].length; j ++) {
                    matrix[i][j] ++;
            }
        }
        return matrix;
    }

    public static int[][] delMatrix(int[][] matrix) {
        ArrayList<String> value = new ArrayList<>();
        for (int i = 0; i < matrix.length; i ++) {
            for (int j = 0; j < matrix[i].length; j ++) {
                if (matrix[i][j] >= 3)
                    value.add(i + " " + j);
            }
        }
        for (int i = 0; i < value.size(); i ++) {
            String s = value.get(i);
            int h = Integer.parseInt(s.substring(0,1));
            int w = Integer.parseInt(s.substring(2));
            matrix[h][w] = 0;
            if (h - 1 >= 0) {
                matrix[h - 1][w] = 0;
            }
            if (h + 1 < matrix.length) {
                matrix[h + 1][w] = 0;
            }
            if (w + 1 < matrix[h].length) {
                matrix[h][w + 1] = 0;
            }
            if (w -1 >= 0)
                matrix[h][w - 1] = 0;
        }
        return matrix;
    }
}


