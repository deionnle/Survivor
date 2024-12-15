import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SquirrelTest {

    @Test
    public void equalsTest () {
        assertEquals(Squirrel.getFirstDigitOfFactorial(7), 5);
        assertEquals(Squirrel.getFirstDigitOfFactorial(11), 3);
        assertEquals(Squirrel.getFirstDigitOfFactorial(2), 2);
        assertEquals(Squirrel.getFirstDigitOfFactorial(1), 1);
    }
}