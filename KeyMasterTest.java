import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class KeyMasterTest {

    @Test
    public void referenceTest() {
        assertEquals("1", KeyMaster.Keymaker(1));
        assertEquals("1001", KeyMaster.Keymaker(4));
        assertEquals("100100001", KeyMaster.Keymaker(9));
        assertEquals("1001000010000001", KeyMaster.Keymaker(16));
        assertEquals("1001000010000001000000001", KeyMaster.Keymaker(25));
        assertEquals("100100001000000100000000100000000001", KeyMaster.Keymaker(36));
    }
}