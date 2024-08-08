import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Cyberpunk1991Test {

    @Test
    public void referenceTest() {
        assertEquals(0, Cyberpunk1991.artificial_muscle_fibers(new int[]{1,2,3,4,5}));
        assertEquals(2, Cyberpunk1991.artificial_muscle_fibers(new int[]{1,2,3,2,1}));
        assertEquals(2, Cyberpunk1991.artificial_muscle_fibers(new int[]{1,2,3,2,1,2,4,2,1}));
        assertEquals(4, Cyberpunk1991.artificial_muscle_fibers(new int[]{1,2,3,4,4,3,2,1,1,2,3,4}));
    }
}