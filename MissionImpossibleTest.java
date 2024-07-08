import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MissionImpossibleTest {

    @Test
    public void referenceTest() {
        String s = "отдай мою кроличью лапку";
        boolean encode = true;
        assertEquals("омоюу толл дюиа акчп йрьк", MissionImpossible.TheRabbitsFoot(s,encode));
    }

    @Test
    public void myTest() {
        String s = "Миссия невыполнима Красный портфель";
        boolean encode = true;
        assertEquals("Мнлрпл иенаоь свиср сымнт ипаыф яоКйе", MissionImpossible.TheRabbitsFoot(s,encode));
    }

    @Test
    public void decodeReferenceTest() {
        String s = "омоюу толл дюиа акчп йрьк";
        boolean encode = false;
        assertEquals("отдаймоюкроличьюлапку", MissionImpossible.TheRabbitsFoot(s,encode));
    }

    @Test
    public void decodeMyTest() {
        String s = "Мнлрпл иенаоь свиср сымнт ипаыф яоКйе";
        boolean encode = false;
        assertEquals("МиссияневыполнимаКрасныйпортфель", MissionImpossible.TheRabbitsFoot(s,encode));
    }

    @Test
    public void equalTest() {
        String s = "Всего четыре слова";
        boolean encode = true;
        assertEquals("Воыл счро ееев гтса", MissionImpossible.TheRabbitsFoot(s,encode));
    }

    @Test
    public void decodeEqualTest() {
        String s = "Воыл счро ееев гтса";
        boolean encode = false;
        assertEquals("Всегочетыреслова", MissionImpossible.TheRabbitsFoot(s,encode));
    }

    @Test
    public void encodeTest () {
        String s = "Ложись спать уже поздно";
        boolean encode = true;
        assertEquals("Лььо осуз жпжд иаен стпо",MissionImpossible.TheRabbitsFoot(s,encode));
    }

    @Test
    public void decodeTest () {
        String s = "Вмори енчод чакчи елект рапа овас";
        boolean encode = false;
        assertEquals("Вечеромналавочкепарочкасидит",MissionImpossible.TheRabbitsFoot(s,encode));
    }

    @Test
    public void encodeMaxTest () {
        String s = "Но если есть в кармане пачка сигарет значит все не так уж плохо на сегодняшний день";
        boolean encode = true;
        assertEquals("Ньпрвжей оваеспгд екчтелое сакзнодн лранехнь имсатоя еаичанш снгикан театуси",MissionImpossible.TheRabbitsFoot(s,encode));
    }

    @Test
    public void decodeMaxTest () {
        String s = "Ньпрвжей оваеспгд екчтелое сакзнодн лранехнь имсатоя еаичанш снгикан театуси";
        boolean encode = false;
        assertEquals("Ноеслиестьвкарманепачкасигаретзначитвсенетакужплохонасегодняшнийдень",MissionImpossible.TheRabbitsFoot(s, encode));
    }

    @Test
    public void zeroTest () {
        String s = "";
        boolean encode = false;
        assertEquals("",MissionImpossible.TheRabbitsFoot(s,encode));
    }
}