import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SquirrelTest {

    @Test
    public void equalsTest () {
        assertEquals(Squirrel.squirrel(7), 5);
        assertEquals(Squirrel.squirrel(11), 3);
        assertEquals(Squirrel.squirrel(2), 2);
        assertEquals(Squirrel.squirrel(1), 1);
    }
}