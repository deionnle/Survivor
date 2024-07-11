import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UFOSignalTest {

    @Test
    public void referenceTest() {
        int N = 2;
        int[] data = new int[] {1234, 1777};
        boolean octal = false;
        assertArrayEquals( new int[] {4660, 6007}, UFOSignal.UFO(N,data,octal));
    }

    @Test
    public void reference2Test() {
        int N = 2;
        int[] data = new int[] {1234,1777};
        boolean octal = true;
        assertArrayEquals( new int[] {668,1023}, UFOSignal.UFO(N,data,octal));
    }

    @Test
    public void big16Test() {
        int[] data = new int[] {48888901,8483,572345,31400,41013,898};
        int N = data.length;
        boolean octal = false;
        assertArrayEquals( new int[] {1216907521,33923,5710661,201728,266259,2200}, UFOSignal.UFO(N,data,octal));
    }

    @Test
    public void big8Test() {
        int[] data = new int[] {706104,2446,74315,13031303,13562};
        int N = data.length;
        boolean octal = true;
        assertArrayEquals( new int[] {232516,1318,30925,2896579,6002}, UFOSignal.UFO(N,data,octal));
    }

    @Test
    public void oneNum16Test() {
        int[] data = new int[] {20};
        int N = data.length;
        boolean octal = false;
        assertArrayEquals( new int[] {32}, UFOSignal.UFO(N,data,octal));
    }

    @Test
    public void oneNum8Test() {
        int[] data = new int[] {20};
        int N = data.length;
        boolean octal = true;
        assertArrayEquals( new int[] {16}, UFOSignal.UFO(N,data,octal));
    }
}