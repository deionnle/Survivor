import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Cyberpunk203xTest {

    @Test
    public void referenceTest(){
        assertEquals(false, Cyberpunk203x.EEC_help(new int[] {1,2,3},new int[] {1,2,3,4}));
        assertEquals(true, Cyberpunk203x.EEC_help(new int[] {1,2,3},new int[] {1,2,3}));
        assertEquals(true, Cyberpunk203x.EEC_help(new int[] {1,3,2},new int[] {1,2,3}));
        assertEquals(false, Cyberpunk203x.EEC_help(new int[] {1,3,2,3},new int[] {1,2,2,3}));
        assertEquals(true, Cyberpunk203x.EEC_help(new int[] {1,1},new int[] {1,1}));
    }

    @Test
    public void myTest(){
        assertEquals(false, Cyberpunk203x.EEC_help(new int[] {1,2,3,3},new int[] {1,2,4,4}));
        assertEquals(true, Cyberpunk203x.EEC_help(new int[] {1,2,3,3},new int[] {1,3,3,2}));
        assertEquals(false, Cyberpunk203x.EEC_help(new int[] {1,1,1,1,1,5},new int[] {1,1,1,1,1,4}));
        assertEquals(true, Cyberpunk203x.EEC_help(new int[] {1,1,2,2,3,3,4,4},new int[] {4,3,2,1,4,3,2,1}));
    }
}