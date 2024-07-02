import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MileageTest {

    @Test
    public void distance1Test() {
        int [] a = new int[] { 10,1,20,2 };
        assertEquals(Mileage.odometer(a), 30);
    }
    @Test
    public void distance2Test() {
        int[] a = new int[]{ 50,1,100,2,200,9 };
        assertEquals(Mileage.odometer(a), 1550);
    }
    @Test
    public void notEqualsTest() {
        int [] a = new int[] { 10,1,20,2,30 };
        assertEquals(Mileage.odometer(a), 30);
    }
    @Test
    public void zeroDistTest() {
        int[] a = new int[]{ 0,1,0,3,0,5,0,7 };
        assertEquals(Mileage.odometer(a), 0);
    }
    @Test
    public void zeroTest() {
        int[] a = new int[]{ 0,0 };
        assertEquals(Mileage.odometer(a), 0);
    }
}