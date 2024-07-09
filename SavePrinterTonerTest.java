import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SavePrinterTonerTest {

    @Test
    public void referenceTest() {
        String Line = "&,28> DJPV\\bhntz";
        assertEquals(SavePrinterToner.PrintingCosts(Line), 282);
    }

    @Test
    public void oneSymbolTest() {
        String Line = "@";
        assertEquals(SavePrinterToner.PrintingCosts(Line), 32);
    }

    @Test
    public void noSymbolTest() {
        String Line = "№№№";
        assertEquals(SavePrinterToner.PrintingCosts(Line), 69);
    }

    @Test
    public void qwertyTest () {
        String Line = "qwerty";
        assertEquals(SavePrinterToner.PrintingCosts(Line), 121);
    }
}