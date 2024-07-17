import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BastShoeTest {

    @Test
    public void referenceTest() {
        String command = "1 Привет";
        assertEquals("Привет", BastShoe.BastShoe(command));
        command = "1 , Мир!";
        assertEquals("Привет, Мир!", BastShoe.BastShoe(command));
        command = "1 ++";
        assertEquals("Привет, Мир!++", BastShoe.BastShoe(command));
        command = "2 2";
        assertEquals("Привет, Мир!", BastShoe.BastShoe(command));
        command = "4";
        assertEquals("Привет, Мир!++", BastShoe.BastShoe(command));
        command = "4";
        assertEquals("Привет, Мир!", BastShoe.BastShoe(command));
        command = "1 *";
        assertEquals("Привет, Мир!*",BastShoe.BastShoe(command));
        command = "4";
        assertEquals("Привет, Мир!", BastShoe.BastShoe(command));
        command = "4";
        assertEquals("Привет, Мир!", BastShoe.BastShoe(command));
        command = "4";
        assertEquals("Привет, Мир!", BastShoe.BastShoe(command));
        command = "3 6";
        assertEquals(",", BastShoe.BastShoe(command));
        command = "2 100";
        assertEquals("", BastShoe.BastShoe(command));
    }

    @Test
    public void reference2Test() {

        String command = "1 Привет";
        assertEquals("Привет", BastShoe.BastShoe(command));
        command = "1 , Мир!";
        assertEquals("Привет, Мир!", BastShoe.BastShoe(command));
        command = "1 ++";
        assertEquals("Привет, Мир!++", BastShoe.BastShoe(command));
        command = "4";
        assertEquals("Привет, Мир!", BastShoe.BastShoe(command));
        command = "4";
        assertEquals("Привет", BastShoe.BastShoe(command));
        command = "5";
        assertEquals("Привет, Мир!", BastShoe.BastShoe(command));
        command = "4";
        assertEquals("Привет", BastShoe.BastShoe(command));
        command = "5";
        assertEquals("Привет, Мир!", BastShoe.BastShoe(command));
        command = "5";
        assertEquals("Привет, Мир!++", BastShoe.BastShoe(command));
        command = "5";
        assertEquals("Привет, Мир!++", BastShoe.BastShoe(command));
        command = "5";
        assertEquals("Привет, Мир!++", BastShoe.BastShoe(command));
        command = "4";
        assertEquals("Привет, Мир!", BastShoe.BastShoe(command));
        command = "4";
        assertEquals("Привет", BastShoe.BastShoe(command));
        command = "2 2";
        assertEquals("Прив", BastShoe.BastShoe(command));
        command = "4";
        assertEquals("Привет", BastShoe.BastShoe(command));
        command = "5";
        assertEquals("Прив", BastShoe.BastShoe(command));
        command = "5";
        assertEquals("Прив", BastShoe.BastShoe(command));
        command = "5";
        assertEquals("Прив", BastShoe.BastShoe(command));
    }

    @Test
    public void myTest() {

        String command = "1 Привет";
        assertEquals("Привет", BastShoe.BastShoe(command));
        command = "1 , Мир!";
        assertEquals("Привет, Мир!", BastShoe.BastShoe(command));
        command = "1 ++";
        assertEquals("Привет, Мир!++", BastShoe.BastShoe(command));
        command = "4";
        assertEquals("Привет, Мир!", BastShoe.BastShoe(command));
        command = "2 6";
        assertEquals("Привет", BastShoe.BastShoe(command));
        command = "4";
        assertEquals("Привет, Мир!", BastShoe.BastShoe(command));
        command = "5";
        assertEquals("Привет", BastShoe.BastShoe(command));
        command = "5";
        assertEquals("Привет", BastShoe.BastShoe(command));
        command = "5";
        assertEquals("Привет", BastShoe.BastShoe(command));
        command = "1 , Мир!";
        assertEquals("Привет, Мир!", BastShoe.BastShoe(command));
        command = "4";
        assertEquals("Привет", BastShoe.BastShoe(command));
        command = "4";
        assertEquals("Привет", BastShoe.BastShoe(command));
        command = "5";
        assertEquals("Привет, Мир!", BastShoe.BastShoe(command));
        command = "5";
        assertEquals("Привет, Мир!", BastShoe.BastShoe(command));
        command = "5";
        assertEquals("Привет, Мир!", BastShoe.BastShoe(command));
        command = "2 11";
        assertEquals("П", BastShoe.BastShoe(command));
        command = "3 0";
        assertEquals("П", BastShoe.BastShoe(command));
    }
}