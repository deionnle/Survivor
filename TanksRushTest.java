import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TanksRushTest {

    @Test
    public void referenceTest() {
        int H1 = 3;
        int W1 = 4;
        String S1 = "1234 2345 0987";
        int H2 = 2;
        int W2 = 2;
        String S2 = "34 98";
        assertEquals(true,TanksRush.TankRush(H1,W1,S1,H2,W2,S2));
    }

    @Test
    public void reference2Test() {
        int H1 = 3;
        int W1 = 4;
        String S1 = "1234 2345 0987";
        int H2 = 2;
        int W2 = 2;
        String S2 = "45 87";
        assertEquals(true,TanksRush.TankRush(H1,W1,S1,H2,W2,S2));
    }

    @Test
    public void referenceFalseTest() {
        int H1 = 3;
        int W1 = 4;
        String S1 = "1234 2345 0987";
        int H2 = 2;
        int W2 = 2;
        String S2 = "35 98";
        assertEquals(false,TanksRush.TankRush(H1,W1,S1,H2,W2,S2));
    }


    @Test
    public void fiveTest() {
        int H1 = 5;
        int W1 = 5;
        String S1 = "34721 65904 22870 46422 83196";
        int H2 = 3;
        int W2 = 3;
        String S2 = "287 642 319";
        assertEquals(true,TanksRush.TankRush(H1,W1,S1,H2,W2,S2));
    }


    @Test
    public void tenTest() {
        int H1 = 10;
        int W1 = 10;
        String S1 = "5325874165 2359658215 2563251024 2018902543 0214200365 2012496856 2302584110 0211258965 3632587410 2021458965";
        int H2 = 2;
        int W2 = 2;
        String S2 = "89 74";
        assertEquals(true,TanksRush.TankRush(H1,W1,S1,H2,W2,S2));
    }

    @Test
    public void lineTest() {
        int H1 = 4;
        int W1 = 4;
        String S1 = "5628 2547 7456 2235";
        int H2 = 4;
        int W2 = 1;
        String S2 = "8 7 6 5";
        assertEquals(true,TanksRush.TankRush(H1,W1,S1,H2,W2,S2));
    }

    @Test
    public void oneTest() {
        int H1 = 4;
        int W1 = 4;
        String S1 = "5628 2547 7456 2035";
        int H2 = 1;
        int W2 = 1;
        String S2 = "0";
        assertEquals(true,TanksRush.TankRush(H1,W1,S1,H2,W2,S2));
    }
}