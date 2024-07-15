import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SalesReportTest {

    @Test
    public void referenceTest() {
        String[] items = new String[] {"платье1 5", "сумка32 2", "платье1 1", "сумка23 2", "сумка128 4"};
        String[] result = {"платье1 6", "сумка128 4", "сумка23 2", "сумка32 2"};
        assertArrayEquals(result, SalesReport.ShopOLAP(items.length,items));
    }
    @Test
    public void myTest() {
        String[] items = {"сумка32 2", "туфли2 7", "платье1 1", "сумка23 2", "платье2 8"};
        String[] sort = {"платье2 8", "туфли2 7", "сумка23 2", "сумка32 2", "платье1 1"};
        assertArrayEquals(sort,SalesReport.ShopOLAP(items.length,items));
    }

    @Test
    public void plusTest() {
        String[] items = {"платье3 1", "туфли1 3", "платье1 4", "платье3 1", "туфли5 5", "платье3 1", "туфли1 2", "платье3 1", "платье3 1"};
        String[] sort = {"платье3 5", "туфли1 5", "туфли5 5", "платье1 4"};
        assertArrayEquals(sort,SalesReport.ShopOLAP(items.length,items));
    }

    @Test
    public void sumTest() {
        String[] items = {"платье1 1", "платье1 1", "платье1 1", "платье1 1", "платье1 1", "платье1 1", "платье1 1", "платье1 1", "платье1 1", "платье1 1",};
        String[] sort = { "платье1 10"};
        assertArrayEquals(sort,SalesReport.ShopOLAP(items.length,items));
    }

    @Test
    public void twoTest() {
        String[] items = {"платье1 1", "туфли1 6", "платье2 6", "туфли1 1", "платье3 1", "туфли3 6", "платье6 6"};
        String[] sort = {"туфли1 7", "платье2 6", "платье6 6", "туфли3 6", "платье1 1", "платье3 1"};
        assertArrayEquals(sort,SalesReport.ShopOLAP(items.length,items));
    }
}