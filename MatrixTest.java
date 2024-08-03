import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MatrixTest {

    @Test
    public void referenceTest(){
        assertEquals("111000", Matrix.digital_rain("1111000"));
        assertEquals("10", Matrix.digital_rain("011111110"));
        assertEquals("11101000", Matrix.digital_rain("11101000"));
        assertEquals("", Matrix.digital_rain("11111111"));
    }
    @Test
    public void myTest(){
        assertEquals("011100", Matrix.digital_rain("0110111001"));
        assertEquals("10", Matrix.digital_rain("00001000"));
        assertEquals("1001", Matrix.digital_rain("001000100100"));
        assertEquals("111001010010", Matrix.digital_rain("00111001010010"));
    }
}