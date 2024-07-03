import java.util.*;

public class Level1 {
    public static int ConquestCampaign(int N, int M, int L, int[] battalion) {
        int[][] platz = new int[N][M];
        int day = 0;
        for (int i = 0; i < L * 2 - 1; i += 2) {
            int x = battalion[i] - 1;
            int y = battalion[i + 1] - 1;
            platz[x][y] = 1;
        }

        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (platz[i][j] == 0) {
                        flag = true;
                        break;
                    }
                }
            }
            day++;
            if (!flag) {
                break;
            }
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (platz[i][j] == 0) {
                        continue;
                    }
                    if (platz[i][j] == day && j == 0) {
                        if (platz[i][j + 1] == 0) {
                            platz[i][j + 1] = day + 1;
                        }
                    } else if (platz[i][j] == day && j != (M - 1)) {
                        if (platz[i][j - 1] == 0) {
                            platz[i][j - 1] = day + 1;
                        }
                        if (platz[i][j + 1] == 0) {
                            platz[i][j + 1] = day + 1;
                        }
                    }
                    if (platz[i][j] == day && j == M - 1) {
                        platz[i][j - 1] = day + 1;
                    }
                    if (platz[i][j] == day && i == N - 1) {
                        platz[i - 1][j] = day + 1;
                    }
                    if (platz[i][j] == day && i == 0) {
                        platz[i + 1][j] = day + 1;
                    } else if (platz[i][j] == day && i != (N - 1)) {
                        platz[i + 1][j] = day + 1;
                        platz[i - 1][j] = day + 1;
                    }
                }
            }
        }
        return day;
    }
}


