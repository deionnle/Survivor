import java.util.*;

public class TreeofLifeAndrassil {

    // Символы для обозначения живых (+) и мёртвых (.) ветвей дерева
    private static final Character TREE_BRANCH = '+';
    private static final Character DEAD_BRANCH = '.';

    public static String [] TreeOfLife(int H, int W, int N, String [] tree) {

        // Проверка соответствия количества строк дерева заданной высоте H
        if (tree.length != H) {
            throw new IllegalArgumentException("Неверное значение количества строк H");
        }
        // Проверка, что каждая строка дерева имеет длину W
        for (String row : tree) {
            if (row.length() != W) {
                throw new IllegalArgumentException("Неверное значение длины строк W");
            }
        }

        int[][] matrix = new int[H][W];

        for (int i = 0; i < H; i ++) {
            String s = tree[i];
            for (int j = 0; j < W; j ++) {
                if (s.charAt(j) == DEAD_BRANCH) {
                    matrix[i][j] = 0;
                } else {
                    matrix[i][j] = 1;
                }
            }
        }
        // Обновляем состояние дерева в N циклах роста и удаления
        for (int i = 0; i < N; i ++) {
            updateBranchAge(matrix);
            if (i % 2 == 1) {
                removeDeadBranches(matrix);
            }
        }

        String[] res = new String[H];
        for (int i = 0; i < H; i ++) {
            String s = "";
            for (int j = 0; j < W; j ++) {
                if (matrix[i][j] == 0) {
                    s += DEAD_BRANCH;
                } else {
                    s += TREE_BRANCH;
                }
            }
            res[i] = s;
        }
        return res;
    }

    public static int[][] updateBranchAge(int[][] matrix) {
        for (int i = 0; i < matrix.length; i ++) {
            for (int j = 0; j < matrix[i].length; j ++) {
                    matrix[i][j] ++;
            }
        }
        return matrix;
    }

    public static int[][] removeDeadBranches(int[][] matrix) {
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


