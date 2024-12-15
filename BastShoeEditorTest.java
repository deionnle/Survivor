import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BastShoeEditorTest {

    @Test
    public void referenceTest() {
        String command = "1 Привет";
        assertEquals("Привет", BastShoeEditor.returnCurrentString(command));
        command = "1 , Мир!";
        assertEquals("Привет, Мир!", BastShoeEditor.returnCurrentString(command));
        command = "1 ++";
        assertEquals("Привет, Мир!++", BastShoeEditor.returnCurrentString(command));
        command = "2 2";
        assertEquals("Привет, Мир!", BastShoeEditor.returnCurrentString(command));
        command = "4";
        assertEquals("Привет, Мир!++", BastShoeEditor.returnCurrentString(command));
        command = "4";
        assertEquals("Привет, Мир!", BastShoeEditor.returnCurrentString(command));
        command = "1 *";
        assertEquals("Привет, Мир!*",BastShoeEditor.returnCurrentString(command));
        command = "4";
        assertEquals("Привет, Мир!", BastShoeEditor.returnCurrentString(command));
        command = "4";
        assertEquals("Привет, Мир!", BastShoeEditor.returnCurrentString(command));
        command = "4";
        assertEquals("Привет, Мир!", BastShoeEditor.returnCurrentString(command));
        command = "3 6";
        assertEquals(",", BastShoeEditor.returnCurrentString(command));
        command = "2 100";
        assertEquals("", BastShoeEditor.returnCurrentString(command));
        command = "1 Привет";
        assertEquals("Привет", BastShoeEditor.returnCurrentString(command));
        command = "1 , Мир!";
        assertEquals("Привет, Мир!", BastShoeEditor.returnCurrentString(command));
        command = "1 ++";
        assertEquals("Привет, Мир!++", BastShoeEditor.returnCurrentString(command));
        command = "4";
        assertEquals("Привет, Мир!", BastShoeEditor.returnCurrentString(command));
        command = "4";
        assertEquals("Привет", BastShoeEditor.returnCurrentString(command));
        command = "5";
        assertEquals("Привет, Мир!", BastShoeEditor.returnCurrentString(command));
        command = "4";
        assertEquals("Привет", BastShoeEditor.returnCurrentString(command));
        command = "5";
        assertEquals("Привет, Мир!", BastShoeEditor.returnCurrentString(command));
        command = "5";
        assertEquals("Привет, Мир!++", BastShoeEditor.returnCurrentString(command));
        command = "5";
        assertEquals("Привет, Мир!++", BastShoeEditor.returnCurrentString(command));
        command = "5";
        assertEquals("Привет, Мир!++", BastShoeEditor.returnCurrentString(command));
        command = "4";
        assertEquals("Привет, Мир!", BastShoeEditor.returnCurrentString(command));
        command = "4";
        assertEquals("Привет", BastShoeEditor.returnCurrentString(command));
        command = "2 2";
        assertEquals("Прив", BastShoeEditor.returnCurrentString(command));
        command = "4";
        assertEquals("Привет", BastShoeEditor.returnCurrentString(command));
        command = "5";
        assertEquals("Прив", BastShoeEditor.returnCurrentString(command));
        command = "5";
        assertEquals("Прив", BastShoeEditor.returnCurrentString(command));
        command = "5";
        assertEquals("Прив", BastShoeEditor.returnCurrentString(command));
    }

    @Test
    public void reference2Test() {

        String command = "1 Привет";
        assertEquals("Привет", BastShoeEditor.returnCurrentString(command));
        command = "1 , Мир!";
        assertEquals("Привет, Мир!", BastShoeEditor.returnCurrentString(command));
        command = "1 ++";
        assertEquals("Привет, Мир!++", BastShoeEditor.returnCurrentString(command));
        command = "4";
        assertEquals("Привет, Мир!", BastShoeEditor.returnCurrentString(command));
        command = "4";
        assertEquals("Привет", BastShoeEditor.returnCurrentString(command));
        command = "5";
        assertEquals("Привет, Мир!", BastShoeEditor.returnCurrentString(command));
        command = "4";
        assertEquals("Привет", BastShoeEditor.returnCurrentString(command));
        command = "5";
        assertEquals("Привет, Мир!", BastShoeEditor.returnCurrentString(command));
        command = "5";
        assertEquals("Привет, Мир!++", BastShoeEditor.returnCurrentString(command));
        command = "5";
        assertEquals("Привет, Мир!++", BastShoeEditor.returnCurrentString(command));
        command = "5";
        assertEquals("Привет, Мир!++", BastShoeEditor.returnCurrentString(command));
        command = "4";
        assertEquals("Привет, Мир!", BastShoeEditor.returnCurrentString(command));
        command = "4";
        assertEquals("Привет", BastShoeEditor.returnCurrentString(command));
        command = "2 2";
        assertEquals("Прив", BastShoeEditor.returnCurrentString(command));
        command = "4";
        assertEquals("Привет", BastShoeEditor.returnCurrentString(command));
        command = "5";
        assertEquals("Прив", BastShoeEditor.returnCurrentString(command));
        command = "5";
        assertEquals("Прив", BastShoeEditor.returnCurrentString(command));
        command = "5";
        assertEquals("Прив", BastShoeEditor.returnCurrentString(command));
    }

    @Test
    public void myTest() {

        String command = "1 Привет";
        assertEquals("Привет", BastShoeEditor.returnCurrentString(command));
        command = "1 , Мир!";
        assertEquals("Привет, Мир!", BastShoeEditor.returnCurrentString(command));
        command = "1 ++";
        assertEquals("Привет, Мир!++", BastShoeEditor.returnCurrentString(command));
        command = "4";
        assertEquals("Привет, Мир!", BastShoeEditor.returnCurrentString(command));
        command = "2 6";
        assertEquals("Привет", BastShoeEditor.returnCurrentString(command));
        command = "4";
        assertEquals("Привет, Мир!", BastShoeEditor.returnCurrentString(command));
        command = "5";
        assertEquals("Привет", BastShoeEditor.returnCurrentString(command));
        command = "5";
        assertEquals("Привет", BastShoeEditor.returnCurrentString(command));
        command = "5";
        assertEquals("Привет", BastShoeEditor.returnCurrentString(command));
        command = "1 , Мир!";
        assertEquals("Привет, Мир!", BastShoeEditor.returnCurrentString(command));
        command = "4";
        assertEquals("Привет", BastShoeEditor.returnCurrentString(command));
        command = "4";
        assertEquals("Привет", BastShoeEditor.returnCurrentString(command));
        command = "5";
        assertEquals("Привет, Мир!", BastShoeEditor.returnCurrentString(command));
        command = "5";
        assertEquals("Привет, Мир!", BastShoeEditor.returnCurrentString(command));
        command = "5";
        assertEquals("Привет, Мир!", BastShoeEditor.returnCurrentString(command));
        command = "2 11";
        assertEquals("П", BastShoeEditor.returnCurrentString(command));
        command = "3 0";
        assertEquals("П", BastShoeEditor.returnCurrentString(command));
    }

    @Test
    public void undoTest() {

        String command = "1 Привет";
        assertEquals("Привет", BastShoeEditor.returnCurrentString(command));
        command = "4";
        assertEquals("", BastShoeEditor.returnCurrentString(command));
        command = "4";
        assertEquals("", BastShoeEditor.returnCurrentString(command));
        command = "4";
        assertEquals("", BastShoeEditor.returnCurrentString(command));
        command = "4";
        assertEquals("", BastShoeEditor.returnCurrentString(command));
        command = "1 Привет";
        assertEquals("Привет", BastShoeEditor.returnCurrentString(command));
        command = "1 , Мир!";
        assertEquals("Привет, Мир!", BastShoeEditor.returnCurrentString(command));
        command = "1 ++";
        assertEquals("Привет, Мир!++", BastShoeEditor.returnCurrentString(command));
        command = "4";
        assertEquals("Привет, Мир!", BastShoeEditor.returnCurrentString(command));
        command = "4";
        assertEquals("Привет", BastShoeEditor.returnCurrentString(command));
        command = "4";
        assertEquals("Привет", BastShoeEditor.returnCurrentString(command));
        command = "4";
        assertEquals("Привет", BastShoeEditor.returnCurrentString(command));
        command = "5";
        assertEquals("Привет, Мир!", BastShoeEditor.returnCurrentString(command));
        command = "5";
        assertEquals("Привет, Мир!++", BastShoeEditor.returnCurrentString(command));
        command = "5";
        assertEquals("Привет, Мир!++", BastShoeEditor.returnCurrentString(command));
        command = "4";
        assertEquals("Привет, Мир!", BastShoeEditor.returnCurrentString(command));
        command = "4";
        assertEquals("Привет", BastShoeEditor.returnCurrentString(command));
        command = "4";
        assertEquals("Привет", BastShoeEditor.returnCurrentString(command));
        command = "4";
        assertEquals("Привет", BastShoeEditor.returnCurrentString(command));
        command = "4";
        assertEquals("Привет", BastShoeEditor.returnCurrentString(command));
        command = "4";
        assertEquals("Привет", BastShoeEditor.returnCurrentString(command));
        command = "1 , Мир!";
        assertEquals("Привет, Мир!", BastShoeEditor.returnCurrentString(command));
        command = "4";
        assertEquals("Привет", BastShoeEditor.returnCurrentString(command));
        command = "4";
        assertEquals("Привет", BastShoeEditor.returnCurrentString(command));
        command = "5";
        assertEquals("Привет, Мир!", BastShoeEditor.returnCurrentString(command));
        command = "5";
        assertEquals("Привет, Мир!", BastShoeEditor.returnCurrentString(command));
    }

    @Test
    public void issueTest() {
        String command = "1 Привет";
        assertEquals("Привет", BastShoeEditor.returnCurrentString(command));
        command = "1 , Мир!";
        assertEquals("Привет, Мир!", BastShoeEditor.returnCurrentString(command));
        command = "1 ++";
        assertEquals("Привет, Мир!++", BastShoeEditor.returnCurrentString(command));
        command = "2 2";
        assertEquals("Привет, Мир!", BastShoeEditor.returnCurrentString(command));
        command = "3 6";
        assertEquals(",", BastShoeEditor.returnCurrentString(command));
        command = "3 15";
        assertEquals("", BastShoeEditor.returnCurrentString(command));
        command = "3 6";
        assertEquals(",", BastShoeEditor.returnCurrentString(command));
    }
}