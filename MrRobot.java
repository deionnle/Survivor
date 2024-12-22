import java.util.*;

public class MrRobot {

    /*
    Функция получает размер массива N и сам массив, и возвращает true если можно отсортировать массив,
    используя круговой сдвиг трех подряд элементов влево произвольное количество раз.
    */
    public static boolean MisterRobot(int N, int [] data) {
        int[] ascendingOrder = Arrays.copyOf(data, data.length);
        Arrays.sort(ascendingOrder);
        int count = 0;
        while (!Arrays.equals(data, ascendingOrder) && count < N) {
            data = sortarr(N, data);
            count ++;
        }
        return Arrays.equals(data, ascendingOrder);
    }

    public static int[] sortarr(int N, int[] data) {
        for (int i = N - 1; i > 1; i --) {
            if (data[i] > data[i -1] && data[i] > data[i - 2]) {
                continue;
            }
            while (data[i] < data[i - 1] || data[i] < data[i - 2]){
                int currentValue = data[i -2]; data[i - 2] = data[i - 1];
                data[i - 1] = data[i]; data[i] = currentValue;
            }
        }
        return data;
    }
}


