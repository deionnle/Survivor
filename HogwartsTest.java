import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HogwartsTest {

    @Test
    public void referenceTest() {
        String input = "вибк";
        assertEquals("викб", Hogwarts.BiggerGreater(input));
    }

    @Test
    public void reference2Test() {
        String input = "вкиб";
        assertEquals("ибвк", Hogwarts.BiggerGreater(input));
    }

    @Test
    public void reference3Test() {
        String input = "нклм";
        assertEquals("нкмл", Hogwarts.BiggerGreater(input));
    }

    @Test
    public void reference4Test() {
        String input = "fff";
        assertEquals("", Hogwarts.BiggerGreater(input));
    }

    @Test
    public void myTest() {
        String input = "оса";
        assertEquals("сао", Hogwarts.BiggerGreater(input));
    }
    @Test
    public void my2Test() {
        String input = "абвгдеж";
        assertEquals("абвгдже", Hogwarts.BiggerGreater(input));
    }

    @Test
    public void oaoTest() {
        String input = "оао";
        assertEquals("ооа", Hogwarts.BiggerGreater(input));
    }

    @Test
    public void oaаoTest() {
        String input = "оаао";
        assertEquals("оаоа", Hogwarts.BiggerGreater(input));
    }

    @Test
    public void abcTest() {
        String input = "aabbcde";
        assertEquals("aabbced", Hogwarts.BiggerGreater(input));
    }

    @Test
    public void BiggerGreater() {
        String input = "za";
        assertEquals("", Hogwarts.BiggerGreater(input));
    }
}