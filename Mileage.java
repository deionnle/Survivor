public class Mileage {
    public static int getDistance(int [] oksana) {
        if (oksana == null || oksana.length == 0) {
            throw new IllegalArgumentException("Входной массив не может быть пустым");
        }
        int odo = 0;
        for (int speed = 0; speed < oksana.length - 1; speed += 2) {
            if (oksana[speed] < 0) {
                throw new IllegalArgumentException("Некорректное значение скорости");
            }
            if (speed == 0) {
                odo += oksana[speed] * oksana[speed + 1];
            } else {
                odo += oksana[speed] * (oksana[speed + 1] - oksana[speed - 1]);
            }
        }
        return odo;
    }
}


