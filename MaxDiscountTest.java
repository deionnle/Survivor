import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.*;

public class MaxDiscountTest {

    @Test
    public void referenceTest() {
        int[] price = new int[] {250,300,200,350,400,150,100};
        assertEquals(450, MaxDiscount.MaximumDiscount(7,price));
    }

    @Test
    public void bigTest() {
        int[] price = new int[] {450,600,300,650,100,50,500,300,150,90,800};
        assertEquals(1000, MaxDiscount.MaximumDiscount(11,price));
    }

    @Test
    public void twelveTest() {
        int[] price = new int[] {450,600,300,70,650,100,50,500,300,150,90,800};
        assertEquals(1050, MaxDiscount.MaximumDiscount(12,price));
    }

    @Test
    public void threeTest() {
        int[] price = new int[] {450,600,300};
        assertEquals(300, MaxDiscount.MaximumDiscount(3,price));
    }

    @Test
    public void zeroTest() {
        int[] price = new int[] {600,300};
        assertEquals(0, MaxDiscount.MaximumDiscount(2,price));
    }

    @Test
    public void onePriceTest() {
        int[] price = new int[] {300};
        assertEquals(0, MaxDiscount.MaximumDiscount(1,price));
    }

    @RepeatedTest(1000)
    public void random1000Test() {
        Random rand = new Random();
        int N = rand.nextInt(30)+1;
        int[] prices = new int[N];
        for (int i = 0; i < N; i++) {
            prices[i] = rand.nextInt(1000)+1;
        }
        assertEquals(MaxDiscount.MaximumDiscount(N,prices),MaxDiscount.MaximumDiscount(N,prices));
    }
}