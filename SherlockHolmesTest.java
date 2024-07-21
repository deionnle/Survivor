import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SherlockHolmesTest {

    @Test
    public void referenceTrueTest() {
        String s = "xyz";
        assertEquals(true, SherlockHolmes.SherlockValidString(s));
    }

    @Test
    public void referenceTrue2Test() {
        String s = "xyzaa";
        assertEquals(true, SherlockHolmes.SherlockValidString(s));
    }

    @Test
    public void referenceTrue3Test() {
        String s = "xxyyz";
        assertEquals(true, SherlockHolmes.SherlockValidString(s));
    }

    @Test
    public void referenceFalseTest() {
        String s = "xyzzz";
        assertEquals(false, SherlockHolmes.SherlockValidString(s));
    }

    @Test
    public void referenceFalse2Test() {
        String s = "xxyyzabc";
        assertEquals(false, SherlockHolmes.SherlockValidString(s));
    }
    @Test
    public void myTest() {
        String s = "abcdefgg";
        assertEquals(true, SherlockHolmes.SherlockValidString(s));
    }

    @Test
    public void bigTrueTest() {
        String s = "nbvcxzzxcvbnvbncxzvcxznbvcbxnz";
        assertEquals(true, SherlockHolmes.SherlockValidString(s));
    }

    @Test
    public void bigFalseTest() {
        String s = "nbvcxzzxcvbnvbncxzvcxznbvcbxnznz";
        assertEquals(false, SherlockHolmes.SherlockValidString(s));
    }
}