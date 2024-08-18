public class Cyberpunk1995 {
    public static String army_communication_matrix(int n, int [][] matrix) {
        String str = "0 0 2";
        if (n == 2) {
            return str;
        }
        int sum = 0;
        return subMatrix(str, sum, 2, n, matrix);
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
                if (x == 0 && y == 0 && m == 2) {
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