import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PhoneUnlockTest {

    @Test
    public void referenceTest() {
        int N = 10;
        int[] hits = new int[] {1,2,3,4,5,6,2,7,8,9};
        assertEquals("982843", PhoneUnlock.PatternUnlock(N,hits));
    }
    @Test
    public void manualTest() {
        int N = 4;
        int[] hits = new int[] {1,8,3,5};
        assertEquals("424264", PhoneUnlock.PatternUnlock(N,hits));
    }
    @Test
    public void fullTest () {
        int N = 14;
        int [] hits = {5,2,8,7,3,4,2,6,1,8,3,5,2,9};
        assertEquals("1548528",PhoneUnlock.PatternUnlock(N,hits));
    }
    @Test
    public void oneNumTest () {
        int N = 1;
        int [] hits = {2};
        assertEquals("",PhoneUnlock.PatternUnlock(N,hits));
    }
    @Test
    public void zeroTest () {
        int [] hits = {};
        int N = 0;
        assertEquals("",PhoneUnlock.PatternUnlock(N,hits));
    }
    @Test
    public void miniTest ()  {
        int N = 4;
        int [] hits = {1,5,2,9};
        assertEquals("382843",PhoneUnlock.PatternUnlock(N,hits));
    }
}