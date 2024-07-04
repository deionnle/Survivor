import java.util.*;
import java.util.HashMap;

public class Level1 {
    public static int [] SynchronizingTables(int N, int [] ids, int [] salary) {
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
            for (Integer j : salaryIdsList.keySet()) {
                if (j == ids[i]) {
                    result[i] = salaryIdsList.get(j);
                    break;
                }
            }
        }
        return result;
    }
}


