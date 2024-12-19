public class Paratroopers {
    public static int ConquestCampaign(int N, int M, int L, int[] battalion) {
        int[][] platz = new int[N][M];
        for (int i = 0; i < L * 2 - 1; i += 2) {
            int x = battalion[i] - 1;
            int y = battalion[i + 1] - 1;
            platz[x][y] = 1;
        }

        boolean isFreeSquare = true;
        int daysPassed = 0;
        while (isFreeSquare) {
            isFreeSquare = false;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (platz[i][j] == 0) {
                        isFreeSquare = true;
                        break;
                    }
                }
            }
            daysPassed++;
            if (!isFreeSquare) {
                break;
            }
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (platz[i][j] == 0) {
                        continue;
                    }
                    if (platz[i][j] == daysPassed && j == 0) {
                        if (platz[i][j + 1] == 0) {
                            platz[i][j + 1] = daysPassed + 1;
                        }
                    } else if (platz[i][j] == daysPassed && j != (M - 1)) {
                        if (platz[i][j - 1] == 0) {
                            platz[i][j - 1] = daysPassed + 1;
                        }
                        if (platz[i][j + 1] == 0) {
                            platz[i][j + 1] = daysPassed + 1;
                        }
                    }
                    if (platz[i][j] == daysPassed && j == M - 1) {
                        platz[i][j - 1] = daysPassed + 1;
                    }
                    if (platz[i][j] == daysPassed && i == N - 1) {
                        platz[i - 1][j] = daysPassed + 1;
                    }
                    if (platz[i][j] == daysPassed && i == 0) {
                        platz[i + 1][j] = daysPassed + 1;
                    } else if (platz[i][j] == daysPassed && i != (N - 1)) {
                        platz[i + 1][j] = daysPassed + 1;
                        platz[i - 1][j] = daysPassed + 1;
                    }
                }
            }
        }
        return daysPassed;
    }
}


