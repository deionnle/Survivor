import org.junit.Test;
import org.junit.jupiter.api.RepeatedTest;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Random;

public class SalaryTableTest {

    @Test
    public void referenceTest() {
        int [] ids = new int[] {50,1,1024};
        int [] salary = new int[] {20000, 100000, 90000};
        int N = 3;
        assertArrayEquals(new int[] {90000,20000,100000},SalaryTable.SynchronizingTables(N,ids,salary));
    }
    @Test
    public void manualTest() {
        int [] ids = new int[] {9,1,7,3,8,2,5,6,4,10};
        int [] salary = new int[] {600,200,400,800,100,900,500,700,1000,300};
        int N = 10;
        int [] res = new int[] {900,100,700,300,800,200,500,600,400,1000};
        assertArrayEquals(res, SalaryTable.SynchronizingTables(N,ids,salary));
    }
    @RepeatedTest(1000)
    public void RepeatedTest () {
        int N = 4;
        int [] ids = {50,1,1024,512};
        int [] salary = {4,3,1,2};
        assertArrayEquals(new int[]{2,1,4,3},SalaryTable.SynchronizingTables(N,ids,salary));
    }
    @RepeatedTest(1000)
    public void RandomTest () {
        Random random = new Random();
        int N = random.nextInt(100)+1;
        int [] ids = new int[N];
        int i, j;
        for (i = 0; i < N;) {
            int num = random.nextInt(2000) + 1;
            for (j = 0; j < i; j ++) {
                if (ids[j] == num) {
                    break;
                }
            }
            if (j == i) {
                ids[i] = num;
                i ++;
            }
        }
        int [] salary = new int[N];
        for (int k = 0; k < N; k++) {
            salary[k] = random.nextInt(100000)+1;
        }
        assertArrayEquals(SalaryTable.SynchronizingTables(N,ids,salary),SalaryTable.SynchronizingTables(N,ids,salary));
    }
}