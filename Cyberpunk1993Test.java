import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Cyberpunk1993Test {

    @Test
    public void referenceTest(){
        assertArrayEquals(new int[] {0,1,2}, Cyberpunk1993.TRC_sort(new int[] {2,1,0}));
        assertArrayEquals(new int[] {0,0,1,1,2,2}, Cyberpunk1993.TRC_sort(new int[] {0,1,2,1,0,2}));
    }

    @Test
    public void myTest(){
        assertArrayEquals(new int[] {0,0,0,0,1,1,1,1,2,2,2,2}, Cyberpunk1993.TRC_sort(new int[] {2,0,1,1,0,2,2,1,1,0,0,2}));
        assertArrayEquals(new int[] {0,1,2,2,2,2,2,2,2}, Cyberpunk1993.TRC_sort(new int[] {2,2,2,2,2,0,1,2,2}));
    }
}