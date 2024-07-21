public class Level1 {
    public static void MatrixTurn(String Matrix[], int M, int N, int T) {

        int[][] matrix = new int[M][N];
        for (int i = 0; i < M; i ++) {
            String s = Matrix[i];
            for (int j = 0; j < N; j ++) {
                matrix[i][j] = Integer.parseInt(Character.toString(s.charAt(j)));
            }
        }
        for (int i = 0; i < T; i ++) {
            for (int j = 0; j < M / 2; j ++) {
                int x = matrix[j][N - 1 - j];
                for (int k = N - 1 - j; k > 0; k --) {
                    matrix[j][k] = matrix[j][k - 1];
                }
                int y = matrix[M - 1 - j][N - 1 - j];
                for (int a = M - 1 - j; a > 0 + j; a --) {
                    if (a == 1 + j) {
                        matrix[a][N -1 - j] = x;
                    } else {
                        matrix[a][N - 1 - j] = matrix[a - 1 - j][N - 1 - j];
                    }
                }
                int z = matrix[M - 1 - j][j];
                for (int b = j; b < N - 1 - j; b ++) {
                    if (b == N - 2 - j) {
                        matrix[M - 1 - j][b] = y;
                    } else {
                        matrix[M - 1 - j][b] = matrix[M - 1 - j][b + 1];
                    }
                }
                for (int c = j; c < M - 1 - j; c ++) {
                    if (c == M - 2 - j) {
                        matrix[c][j] = z;
                    } else {
                        matrix[c][j] = matrix[c + 1][j];
                    }
                }
            }
        }
        for (int i = 0; i < M; i ++) {
            String s = "";
            for (int j = 0; j < N; j ++) {
                s += matrix[i][j];
            }
            Matrix[i] = s;
        }
    }
}


