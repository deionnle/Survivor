public class Mileage {
    public static int odometer(int [] oksana) {
        int odo = 0;
        for (int speed = 0; speed < oksana.length - 1; speed += 2) {
            if (speed == 0) {
                odo += oksana[speed] * oksana[speed + 1];
            } else {
                odo += oksana[speed] * (oksana[speed + 1] - oksana[speed - 1]);
            }
        }
        return odo;
    }
}


