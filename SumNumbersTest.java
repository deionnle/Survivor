import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SumNumbersTest {

    @Test
    public void referenceTest() {
        int N = 5;
        int[] data = new int[] {10,-25,-45,-35,5};
        assertEquals(-45, SumNumbers.SumOfThe(N,data));
    }
    @Test
    public void reference2Test() {
        int[] data = new int[] {-50,90,-25,10,90,-35,100};
        int N = data.length;
        assertEquals(90, SumNumbers.SumOfThe(N,data));
    }
    @Test
    public void pozitiveTest() {
        int[] data = new int[] {10,20,30,150,40,50};
        int N = data.length;
        assertEquals(150, SumNumbers.SumOfThe(N,data));
    }
    @Test
    public void negativeTest() {
        int[] data = new int[] {-10,-20,-30,-150,-40,-50};
        int N = data.length;
        assertEquals(-150, SumNumbers.SumOfThe(N,data));
    }
    @Test
    public void miniTest() {
        int[] data = new int[] {50,50};
        int N = data.length;
        assertEquals(50, SumNumbers.SumOfThe(N,data));
    }
    @Test
    public void maxTest() {
        int[] data = new int[] {148,-23,69,-84,52,-10,66,92,-50,32,-89,-100,20,33,-154,-22};
        int N = data.length;
        assertEquals(-10, SumNumbers.SumOfThe(N,data));
    }
    @Test
    public void zeroTest() {
        int[] data = new int[] {0,0,0};
        int N = data.length;
        assertEquals(0, SumNumbers.SumOfThe(N,data));
    }
}