import java.util.*;

public class Level1 {
    public static int odometer(int [] oksana) {
        int odo = 0;
        for (int i = 0; i < oksana.length - 1; i += 2) {
            if (i == 0) {
                odo += oksana[i] * oksana[i + 1];
            } else {
                odo += oksana[i] * (oksana[i + 1] - oksana[i - 1]);
            }
        }
        return odo;
    }
}


