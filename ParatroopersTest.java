import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ParatroopersTest {

    @Test
    public void test1() {
        int [] a = new int[] {2,2, 3,4};
        int days = Paratroopers.ConquestCampaign(3,4,2, a);
        assertEquals(3, days);
    }
    @Test
    public void angleTest() {
        int [] a = new int[] {1,1, 1,5, 5,1, 5,5};
        int days = Paratroopers.ConquestCampaign(5,5,4, a);
        assertEquals(5, days);
    }
    @Test
    public void zeroStartTest() {
        int [] a = new int[] {1,1};
        int days = Paratroopers.ConquestCampaign(5,5,1, a);
        assertEquals(9, days);
    }
    @Test
    public void twoDaysTest() {
        int [] a = new int[] {1,2,2,1,2,3,3,2};
        int days = Paratroopers.ConquestCampaign(3,3,4, a);
        assertEquals(2, days);
    }
    @Test
    public void oneNumTest() {
        int [] a = new int[] {2,3};
        int days = Paratroopers.ConquestCampaign(4,4,2, a);
        assertEquals(5, days);
    }
    @Test
    public void oneDay() {
        int [] a = new int[] {1,1,1,2};
        int days = Paratroopers.ConquestCampaign(2,2,1, a);
        assertEquals(2, days);
    }
}