import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TreeofLifeAndrassilTest {

    @Test
    public void referenceTest() {
        String[] tree = {".+..","..+.",".+.."};
        String[] res = {".+..","..+.",".+.."};
        int H = 3;
        int W = 4;
        int N = 4;
        assertArrayEquals(res,TreeofLifeAndrassil.TreeOfLife(H,W,N,tree));
    }

    @Test
    public void fiveTest(){
        String[] tree = {"+...+",".....",".....",".....","+...+"};
        String[] res = {"+...+",".....",".....",".....","+...+"};
        int H = 5;
        int W = 5;
        int N = 8;
        assertArrayEquals(res,TreeofLifeAndrassil.TreeOfLife(H,W,N,tree));
    }

    @Test
    public void fourTest(){
        String[] tree = {"...+","....","....","+..."};
        String[] res = {"++..", "+++.", ".+++","..++"};
        int H = 4;
        int W = 4;
        int N = 6;
        assertArrayEquals(res,TreeofLifeAndrassil.TreeOfLife(H,W,N,tree));
    }
}