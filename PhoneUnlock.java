public class PhoneUnlock {
    public static String PatternUnlock(int N, int [] hits) {
        int[][] keyboard = new int[][] {{6,1,9}, {5,2,8}, {4,3,7}};
        double unlockLineLength = 0;
        for (int i = 1; i < N; i ++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (hits[i] == keyboard[j][k] && j < 2 && hits[i - 1] == keyboard[j + 1][k]) {
                        unlockLineLength += 1;
                        break;
                    } else if (hits[i] == keyboard[j][k] && k < 2 && hits[i - 1] == keyboard[j][k + 1]) {
                        unlockLineLength += 1;
                        break;
                    } else if (hits[i] == keyboard[j][k] && j > 0 && hits[i - 1] == keyboard[j - 1][k]) {
                        unlockLineLength += 1;
                        break;
                    } else if (hits[i] == keyboard[j][k] && k > 0 && hits[i - 1] == keyboard[j][k - 1]) {
                        unlockLineLength += 1;
                        break;
                    } else if (hits[i] == keyboard[j][k] && j > 0 && hits[i - 1] != keyboard[j - 1][k]) {
                        unlockLineLength += Math.sqrt(2);
                        break;
                    } else if (hits[i] == keyboard[j][k] && k > 0 && hits[i - 1] != keyboard[j][k - 1]) {
                        unlockLineLength += Math.sqrt(2);
                        break;
                    } else if (hits[i] == keyboard[j][k] && j < 2 && k < 2 && (hits[i - 1] != keyboard[j + 1][k] || hits[i - 1] != keyboard[j][k + 1])) {
                        unlockLineLength += Math.sqrt(2);
                        break;
                    } else if (hits[i] == keyboard[j][k] && j < 2 && k < 2 && (hits[i - 1] != keyboard[j + 1][k] || hits[i - 1] != keyboard[j][k + 1])) {
                        unlockLineLength += Math.sqrt(2);
                        break;
                    }
                }
            }
        }
        return String.format("%.5f", unlockLineLength).replaceAll("[,0.]","");
    }
}


