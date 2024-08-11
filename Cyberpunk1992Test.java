import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Cyberpunk1992Test {

    @Test
    public void referenceTest(){
        assertEquals(0,Cyberpunk1992.massdriver(new int[] {1,2,3,1,2,3,4}));
        assertEquals(1,Cyberpunk1992.massdriver(new int[] {1,2,3,4,3,4,2}));
        assertEquals(-1,Cyberpunk1992.massdriver(new int[] {1,2,3,4,5,6,7}));
    }

    @Test
    public void myTest(){
        assertEquals(0,Cyberpunk1992.massdriver(new int[] {1,2,3,2,3,2,1,2,3,2}));
        assertEquals(1,Cyberpunk1992.massdriver(new int[] {1,8,3,6,5,2,4,2,3,6,8,2}));
        assertEquals(0,Cyberpunk1992.massdriver(new int[] {2,2}));
    }
}