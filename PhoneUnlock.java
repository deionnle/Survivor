import java.util.*;

public class Level1 {
    public static String PatternUnlock(int N, int [] hits) {
        int[][] keyboard = new int[][] {{6,1,9}, {5,2,8}, {4,3,7}};
        double sum = 0;
        for (int i = 1; i < N; i ++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (hits[i] == keyboard[j][k] && j < 2 && hits[i - 1] == keyboard[j + 1][k]) {
                        sum += 1;
                        break;
                    } else if (hits[i] == keyboard[j][k] && k < 2 && hits[i - 1] == keyboard[j][k + 1]) {
                        sum += 1;
                        break;
                    } else if (hits[i] == keyboard[j][k] && j > 0 && hits[i - 1] == keyboard[j - 1][k]) {
                        sum += 1;
                        break;
                    } else if (hits[i] == keyboard[j][k] && k > 0 && hits[i - 1] == keyboard[j][k - 1]) {
                        sum += 1;
                        break;
                    } else if (hits[i] == keyboard[j][k] && j > 0 && hits[i - 1] != keyboard[j - 1][k]) {
                        sum += Math.sqrt(2);
                        break;
                    } else if (hits[i] == keyboard[j][k] && k > 0 && hits[i - 1] != keyboard[j][k - 1]) {
                        sum += Math.sqrt(2);
                        break;
                    } else if (hits[i] == keyboard[j][k] && j < 2 && k < 2 && (hits[i - 1] != keyboard[j + 1][k] || hits[i - 1] != keyboard[j][k + 1])) {
                        sum += Math.sqrt(2);
                        break;
                    } else if (hits[i] == keyboard[j][k] && j < 2 && k < 2 && (hits[i - 1] != keyboard[j + 1][k] || hits[i - 1] != keyboard[j][k + 1])) {
                        sum += Math.sqrt(2);
                        break;
                    }
                }
            }
        }
        String res = String.format("%.5f",sum).replaceAll("[,0.]","");;
        return res;
    }
}


