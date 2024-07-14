import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.*;

public class MrRobotTest {

    @Test
    public void referenceTest() {
        int[] data = new int[] {1,3,4,5,6,2,7};
        assertEquals(true, MrRobot.MisterRobot(7, data));
    }

    @Test
    public void myTest() {
        int[] data = new int[] {1,2,3,5,6,7,4,9,8};
        assertEquals(true, MrRobot.MisterRobot(9, data));
    }

    @Test
    public void timeTest() {
        int[] data = new int[] {2,12,6,14,8,4,13,1,10,7,3,11,5,9,15};
        assertEquals(false, MrRobot.MisterRobot(15, data));
    }

    @Test
    public void tenTest() {
        int[] matrix = {10,8,5,2,6,7,3,4,1,9};
        assertEquals(false,MrRobot.MisterRobot(10,matrix));
    }

    @Test
    public void reversTest() {
        int[] matrix = {10,9,8,7,6,5,4,3,2,1};
        assertEquals(false,MrRobot.MisterRobot(10,matrix));
    }

    @RepeatedTest(100)
    public void randomTenTest() {
        Random random = new Random();
        int N = 20;
        int [] arr = new int[N];
        int i, j;
        for (i = 0; i < N;) {
            int num = random.nextInt(N) + 1;
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
        assertEquals(MrRobot.MisterRobot(N,arr),MrRobot.MisterRobot(N,arr));
    }
}