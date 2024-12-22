import java.util.*;
import java.util.HashMap;

public class SalaryTable {

    /*
    Функция получает параметром N длину обоих массивов. Параметр ids - массив, содержащий номера сотрудников,
    параметр salary - массив, содержащий зарплаты.
    Возвращает функция массив, содержащий переупорядоченные зарплаты.
    */

    public static int [] SynchronizingTables(int N, int [] ids, int [] salary) {
        if (ids == null || salary == null || ids.length != salary.length || N <= 0) {
            throw new IllegalArgumentException("Некорректные входные данные");
        }
        int [] idsSort = new int[N];
        System.arraycopy(ids, 0, idsSort, 0, N);
        Arrays.sort(idsSort);
        Arrays.sort(salary);

        HashMap<Integer, Integer> salaryIdsList = new HashMap<>();
        for (int i = 0; i < N; i ++) {
            salaryIdsList.put(idsSort[i], salary[i]);
        }

        int [] result = new int[N];
        for (int i = 0; i < N; i ++) {
            for (Integer key : salaryIdsList.keySet()) {
                if (key == ids[i]) {
                    result[i] = salaryIdsList.get(key);
                    break;
                }
            }
        }
        return result;
    }
}


