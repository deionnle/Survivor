import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Recursion1Test {

    @Test
    public void zeroTest(){
        assertEquals(1,Recursion1.exp(2,0));
    }

    @Test
    public void oneTest(){
        assertEquals(2,Recursion1.exp(2,1));
    }

    @Test
    public void sixTest(){
        assertEquals(64,Recursion1.exp(2,6));
    }

    @Test
    public void bigTest(){
        assertEquals(4194304,Recursion1.exp(2,22));
    }

    @Test
    public void sum1Test(){
        assertEquals(1,Recursion1.sumNumbers(1));
    }

    @Test
    public void sum1432Test(){
        assertEquals(10,Recursion1.sumNumbers(1432));
    }

    @Test
    public void sum123456789Test(){
        assertEquals(45,Recursion1.sumNumbers(123456789));
    }

    @Test
    public void bidSumTest(){
        assertEquals(10,Recursion1.sumNumbers(1000000009));
    }
}