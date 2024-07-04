import org.junit.Test;
import org.junit.jupiter.api.RepeatedTest;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.*;

public class MadMaxTest {

    @RepeatedTest(1000)
    public void Test1000() {
        Random random = new Random();
        int N = random.nextInt(126) + 1;
        if (N % 2 == 0) {
            N += 1;
        }
        int [] arr = new int[N];
        int i, j;
        for (i = 0; i < arr.length;) {
            int num = random.nextInt(256);
            for (j = 0; j < i; j ++) {
                if (arr[j] == num) {
                    break;
                }
            }
            if (j == i) {
                arr[i] = num;
                i ++;
            }
        }
        assertArrayEquals(MadMax.MadMax(N,arr), MadMax.MadMax(N,arr));
    }

    @Test
    public void manualTest() {
        int N = 13;
        int [] arr = new int[] {1,6,4,2,3,7,5,13,9,8,12,10,11};
        int [] arrSort = new int[] {1,2,3,4,5,6,13,12,11,10,9,8,7};
        assertArrayEquals(arrSort, MadMax.MadMax(N, arr));
    }
    @Test
    public void referenceTest() {
        int N = 7;
        int[] arr = new int[]{1,2,3,4,5,6,7};
        int[] arrSort = new int[]{1,2,3,7,6,5,4};
        assertArrayEquals(arrSort, MadMax.MadMax(N, arr));
    }
    @Test
    public void miniTest() {
        int N = 3;
        int[] arr = new int[]{3,2,1};
        int[] arrSort = new int[]{1,3,2};
        assertArrayEquals(arrSort, MadMax.MadMax(N, arr));
    }
    @Test
    public void oneNumTest() {
        int N = 1;
        int[] arr = new int[]{1};
        int[] arrSort = new int[]{1};
        assertArrayEquals(arrSort, MadMax.MadMax(N, arr));
    }
}