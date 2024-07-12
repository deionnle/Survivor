import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrafficOptimizationTest {

    @Test
    public void referenceTest() {
        int L = 10;
        int N = 2;
        int[][] track = { {3,5,5,}, {5,2,2,}};
        assertEquals(12, TrafficOptimization.Unmanned(L,N,track));
    }

    @Test
    public void bigTest() {
        int L = 8;
        int N = 5;
        int[][] track = { {1,3,3}, {3,2,2}, {4,3,3}, {6,4,4}, {8,8,8}};
        assertEquals(14, TrafficOptimization.Unmanned(L,N,track));
    }
    @Test
    public void noTrafficLightTest() {
        int L = 10;
        int N = 0;
        int[][] track = {};
        assertEquals(10, TrafficOptimization.Unmanned(L,N,track));
    }
    @Test
    public void oneTrafficLightGreenTest() {
        int L = 5;
        int N = 1;
        int[][] track = { {3,2,2} };
        assertEquals(5, TrafficOptimization.Unmanned(L,N,track));
    }
    @Test
    public void oneTrafficLightRedTest() {
        int L = 5;
        int N = 1;
        int[][] track = { {1,10,10} };
        assertEquals(14, TrafficOptimization.Unmanned(L,N,track));
    }
}