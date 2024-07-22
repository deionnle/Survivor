import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WhiteWalkersTest {

    @Test
    public void referenceTest() {
        String village = "axxb6===4xaf5===eee5";
        assertEquals(true, WhiteWalkers.white_walkers(village));
    }

    @Test
    public void reference2Test() {
        String village = "5==ooooooo=5=5";
        assertEquals(false, WhiteWalkers.white_walkers(village));
    }

    @Test
    public void reference3Test() {
        String village = "abc=7==hdjs=3gg1=======5";
        assertEquals(true, WhiteWalkers.white_walkers(village));
    }

    @Test
    public void reference4Test() {
        String village = "aaS=8";
        assertEquals(false, WhiteWalkers.white_walkers(village));
    }

    @Test
    public void reference5Test() {
        String village = "9===1===9===1===9";
        assertEquals(true, WhiteWalkers.white_walkers(village));
    }

    @Test
    public void myTest() {
        String village = "8fd=vg=v=2==bg4===6ogitg5oo===oo5pgpgbb1dr=fvc=v=9";
        assertEquals(true, WhiteWalkers.white_walkers(village));
    }

    @Test
    public void falseTest() {
        String village = "3gtv===7bfgg==4====6";
        assertEquals(false, WhiteWalkers.white_walkers(village));
    }

    @Test
    public void trueTest() {
        String village = "===7===3==1===9=2===8=aa5===5===";
        assertEquals(true, WhiteWalkers.white_walkers(village));
    }

    @Test
    public void noTest(){
        String village = "fbh1=gf=6ogh===2bh=5===1=";
        assertEquals(false,WhiteWalkers.white_walkers(village));

    }

    @Test
    public void miniTest(){
        String village = "===5===5===";
        assertEquals(true,WhiteWalkers.white_walkers(village));

    }
}