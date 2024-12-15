import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BigNumbersTest {

    @Test
    public void referenceTest () {
        assertEquals("1234567890",BigNumbers.getDifference("1234567891", "1"));
    }

    @Test
    public void reference2Test () {
        assertEquals("320",BigNumbers.getDifference("1", "321"));
    }

    @Test
    public void zeroTest () {
        assertEquals("99457253",BigNumbers.getDifference("543268", "100000521"));
    }

    @Test
    public void bigTest () {
        assertEquals("53874847503896692617805845065970",BigNumbers.getDifference("56225002100458703650041500067480", "2350154596562011032235655001510"));
    }

    @Test
    public void equalTest () {
        assertEquals("0",BigNumbers.getDifference("987654321", "987654321"));
    }

    @Test
    public void fiveTest () {
        assertEquals("5",BigNumbers.getDifference("5555555550", "5555555555"));
    }

    @Test
    public void reverseTest () {
        assertEquals("864197532",BigNumbers.getDifference("987654321", "123456789"));
    }

    @Test
    public void millionTest () {
        assertEquals("1000000",BigNumbers.getDifference("1000000", "0"));
    }

    @Test
    public void mirrorTest () {
        assertEquals("1",BigNumbers.getDifference("100000000002", "100000000001"));
    }
}