import java.util.*;

public class Squirrel {
    public static int squirrel(int N) {
        int factorial = 1;
        for (int i = 2; i <= N; i ++) {
            factorial *= i;
        }
        while (factorial > 10) {
            factorial /= 10;
        }
        return factorial;
    }
}


