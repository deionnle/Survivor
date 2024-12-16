public class Cyberpunk1995 {

    private static final String DEFAULT_RESULT = "0 0 2";

    public static String army_communication_matrix(int n, int [][] matrix) {
        if (n == 2) {
            return DEFAULT_RESULT;
        }
        int sum = 0;
        return subMatrix(DEFAULT_RESULT, sum, 2, n, matrix);
    }

    public static String subMatrix(String str,int sum, int m, int n, int[][] matrix) {
        if (m == n) {
            return str;
        }
        for (int x = 0; x < n - m + 1; x++) {
            for (int y = 0; y < n - m + 1; y++) {
                int res = 0;
                for (int i = x; i < m + x; i++) {
                    for (int j = y; j < m + y; j++) {
                        res += matrix[i][j];
                    }
                }
                boolean isFirstIteration = (x == 0 && y == 0 && m == 2);
                if (isFirstIteration) {
                    sum = res;
                    str = y + " " + x + " " + m;
                }
                if (res > sum) {
                    sum = res;
                    str = y + " " + x + " " + m;
                }
            }
        }
        return subMatrix(str, sum,m + 1, n, matrix);
    }
}