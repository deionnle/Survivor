import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BigNumbersTest {

    @Test
    public void referenceTest () {
        assertEquals("1234567890",BigNumbers.BigMinus("1234567891", "1"));
    }

    @Test
    public void reference2Test () {
        assertEquals("320",BigNumbers.BigMinus("1", "321"));
    }

    @Test
    public void zeroTest () {
        assertEquals("99457253",BigNumbers.BigMinus("543268", "100000521"));
    }

    @Test
    public void bigTest () {
        assertEquals("53874847503896692617805845065970",BigNumbers.BigMinus("56225002100458703650041500067480", "2350154596562011032235655001510"));
    }

    @Test
    public void equalTest () {
        assertEquals("0",BigNumbers.BigMinus("987654321", "987654321"));
    }

    @Test
    public void fiveTest () {
        assertEquals("5",BigNumbers.BigMinus("5555555550", "5555555555"));
    }

    @Test
    public void reverseTest () {
        assertEquals("864197532",BigNumbers.BigMinus("987654321", "123456789"));
    }

    @Test
    public void millionTest () {
        assertEquals("1000000",BigNumbers.BigMinus("1000000", "0"));
    }

    @Test
    public void mirrorTest () {
        assertEquals("1",BigNumbers.BigMinus("100000000002", "100000000001"));
    }
}